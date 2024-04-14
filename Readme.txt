Firstly make sure these values are present in project.properties file
1. OS( For local Mac and Windows)
2. Linux for AWS linux server where chrome browse and chrome driver should be installed
3. Public_URL -  Need to provide the application URL where we want to test 
4. DeletePreviousReports, DeletePreviousZipReports, ZipReportsAtEnd should have boolean values true or false based on requirement
5. Check the Jira configuration RaiseBug = true/ False based on this value jira bug is raised
6. This is your JIRA account URL for jira domain BaseURI = https://hasherscapstone.atlassian.net/rest/api/3
7. Here you need to mention your jira credentials, Usually password is a Jira token generated from jira account Username = yourJiraEmail@gmail.com, Password = Password for jira account
8. for RunEnvironment = Local/CICD we should give these values based on this either it will be ran on local or on jenkins build, this configuration is imp in running based on config
9. EmailFlag is a boolean value based on which test restults will be emailed to client and make sure FromEmail is activated with google api 2.0 and have encrypted password.



Make sure you fill this information if you are not integrating the project with AWS and running in local
1. String region = "ca-central-1";
2. String accessKeyId = "AccessKeyHere";
3. String secretAccessKey = "SecretAccessKeyHere+";

If the project is integrated with AWS and running in linux server we need to add the policy to allow and use the values we created in secrets manager to be used in EC2 server.
This project is configured in the following way:-
1. Have created a secrets manager Key-Value Pair for jira auth token and Email password
2. Created policy to read, added to a role , added this role to a Users - this setup is for local where we need to mention accessKey and secretAccessKey of user in file - SecretManagerRetrieverLocal.java 
3. For running it in cloud we need to add the same policy which we created to the EC2 server, from which it will automatically take the required values to run
4. In both the cases local/CICD we need to specify the secret name for both SecretManagerRetrieverLocal and SecretManagerRetriever files methods - getEmailPassword(), getJiraToken() and respective values which are given while creating secret
ex:-   public static String getEmailPassword() {
        return retrieveSecret("SecretName", "KeyName");
    }

Jira:
1. Make sure the payload is as per requirement, and do necessary customisations as required.
2. 
