package utilities;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {
	public static void Email() {
		String projectPath = System.getProperty("user.dir");

		String to = "";


		String from = "casuallysunny12@gmail.com";

		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", "smtp.gmail.com");
		properties.setProperty("mail.smtp.port", "465");
		properties.setProperty("mail.smtp.ssl.enable", "true");
		properties.setProperty("mail.smtp.auth", "true");

		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("casuallysunny12@gmail.com", "Password Here");

			}
		});
//	      session.setDebug(true);
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Hashers Test Report!");
			Multipart multipart = new MimeMultipart();
			// HTML part
		    Properties envProperties = TestUtils.loadProperties(projectPath + "/project.properties");
		    String runEnv = envProperties.getProperty("RunEnvironment");
		    String runBroser = envProperties.getProperty("RunBrowser");
		    String runOS = System.getProperty("os.name");
		    
		    //Time zone
		    LocalDateTime currentDateTime = LocalDateTime.now(ZoneId.systemDefault());
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // Or any other desired format
			String runDateTime = currentDateTime.format(formatter);
		    
		    BodyPart htmlPart = new MimeBodyPart();
		    String htmlContent = "<h2 style='color:#007bff;'>Hashers Test Report</h2>"
		                        + "<p style='font-size:16px;'>Dear Team,</p>"
		                        + "<p style='font-size:14px;'>Greetings! Please find below the test report from Hashers.</p>"
		                        + "<p style='font-size:14px;'>This report contains the comprehensive test results and detailed reports of our recent testing run.</p>"
		                        + "<em>Run Configuration </em>"
		                        + "<p><strong>Run Environment: - "+ runEnv +"</strong></p>"
		                        + "<p><strong>Run Browser: - "+ runBroser +"</strong></p>"
		                        + "<p><strong>Run Operating System: - "+ runOS +"</strong></p>"
		                        + "<p><strong>Run Time: - "+ runDateTime +"</strong></p>"
		                        + "<p style='font-size:14px;'>Kindly review the attached document and let the team know if you need any further assistance.</p>"
		                        + "<p style='font-size:14px;'>Best regards,<br>Hashers</p>";
		    
		    htmlPart.setContent(htmlContent, "text/html");
			BodyPart imagePart = new MimeBodyPart();
			String filename = projectPath + "/test-output.zip";
			DataSource source = new FileDataSource(filename);
			imagePart.setDataHandler(new DataHandler(source));
			imagePart.setFileName(filename);
			multipart.addBodyPart(htmlPart);
			multipart.addBodyPart(imagePart);
			message.setContent(multipart);
			System.out.println("Sending Email.... Please Wait");
			Transport.send(message);

			System.out.println("Sent message successfully...."); 
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
