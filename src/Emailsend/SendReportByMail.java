package Emailsend;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendReportByMail {

	public static void main(String[] args) throws Exception {
		System.out.println("Email started sending");
		Email email = new SimpleEmail();
		email.setHostName("Emailna.app.invesco.net");
		email.setSmtpPort(465);
		
		email.setAuthenticator(new DefaultAuthenticator("raghurao300@gmail.com", "Ammanaveni1"));
		email.setSSLOnConnect(true);
		email.setSSLOnConnect(true);
		email.setFrom("raghurao0309@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("raghurao0309@gmail.com");
		email.send();
		System.out.println("Emial sent");
	}

}
