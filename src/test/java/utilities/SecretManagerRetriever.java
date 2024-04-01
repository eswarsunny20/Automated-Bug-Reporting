package utilities;

import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
import com.amazonaws.services.secretsmanager.model.GetSecretValueResult;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class SecretManagerRetriever {

    public static String retrieveSecret(String secretName, String field) {
        AWSSecretsManager client = AWSSecretsManagerClientBuilder.defaultClient();

        GetSecretValueRequest request = new GetSecretValueRequest()
                                            .withSecretId(secretName);

        GetSecretValueResult result = client.getSecretValue(request);

        String secretValue = "";
        if (result.getSecretString() != null) {
            secretValue = extractFieldValue(result.getSecretString(), field);
        } else {
            ByteBuffer binarySecret = result.getSecretBinary();
            byte[] binaryData = binarySecret.array();
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonNode = objectMapper.readTree(new ByteArrayInputStream(binaryData));
                secretValue = extractFieldValue(jsonNode.toString(), field);
            } catch (IOException e) {
                e.printStackTrace();
                // Handle error appropriately
            }
        }

//        System.out.println("Retrieved secret value for field '" + field + "': " + secretValue);
        return secretValue;

    }
    
    private static String extractFieldValue(String json, String field) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(json);
            return rootNode.path(field).asText();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle error appropriately
            return "";
        }
    }
    
    
    public static String getEmailPassword() {
        return retrieveSecret("prod/emailandjira/tokens", "EmailPassword");
    }

    public static String getJiraToken() {
        return retrieveSecret("prod/emailandjira/tokens", "JiraToken");
    }
    
    
}
