package com.java.oop;

public class BMW extends Car {
	
	public static void main(String[] args){
		
		
		BMW naGoshoBavareca = new BMW();
		
		naGoshoBavareca.setTires("Gyzarskite Djanti");
		
		System.out.println("Na gosho djantite: "+naGoshoBavareca.getTires());
	}

}
