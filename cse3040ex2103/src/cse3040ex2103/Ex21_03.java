package cse3040ex2103;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex21_03 {
	public static void main(String[] args) {
		InetAddress ip=null;
		
		try {
			ip=InetAddress.getLocalHost();
			System.out.println("getHostName(): "+ip.getHostName());
			System.out.println("getHostAddress(): "+ip.getHostAddress());
			System.out.println("toString(): "+ip.toString());
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
