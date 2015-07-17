package businesslogic;

import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;

public class MiddlewareCaller{
	Socket socket = null;
	
	String ServerIP = "localhost";//Connection Socket InetAddress
	
	String Received_Data = null;//Return to Web Caller

	
	//1. Call this method in order to Analyze Protocol
	public void SendProtocol(String header) throws UnknownHostException, IOException{
		try{
			socket = new Socket(ServerIP, 9876);
			System.out.println("Welcome to Smart Home");

			Parsing parse = new Parsing();//Parsing instance

			parse.Set_msg(header);//Header Setting
			parse.HeaderMessageProcess(this.socket);//
		}
		catch(Exception e){
			System.out.println("Error name: "+ e);
		}
	}
	
	//2. Call this method in order to Authentication
	public void Authentication(){
		
	}
	
	//3. Call this method in order to Which home
}
