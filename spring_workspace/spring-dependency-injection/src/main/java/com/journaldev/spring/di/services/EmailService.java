package com.journaldev.spring.di.services;

public class EmailService implements MessageService{

	public boolean sendMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("Email Sent to "+rec+ " with Message="+msg);
		return true;
	}

}
