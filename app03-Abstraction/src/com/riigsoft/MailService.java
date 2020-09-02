package com.riigsoft;

public class MailService {

	public void sendEmail() {
		//connect
		connect();
		//authenticate
		authenticate();
		//sent email
		System.out.println("Sent");
		//disconnect
		disconnect();
	}
	private void connect() {
		System.out.println("Connect..");
	}
	
	private void disconnect() {
		System.out.println("Disconnect..");
	}
	private void authenticate() {
		System.out.println("Authenticate..");
	}
}
