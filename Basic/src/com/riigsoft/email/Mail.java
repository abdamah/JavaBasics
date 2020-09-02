package com.riigsoft.email;

public class Mail {

	public void sendEmail() {

		// connect
		connect();
		// authenticate
		authenticate();
		// actual Email
		// disconnect
		disconnect();
	}

	private void connect() {
		System.out.println("Connect to server");
	}

	private void disconnect() {
		System.out.println("Disconnect to server");
	}

	private void authenticate() {
		System.out.println("Authenticated");
	}
}
