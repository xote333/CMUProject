/**********************************************************************************************************
 This package is used in TCP Connection system through Socket. TCP connection will be held by this Package.
 All sensor's data will input this socket connection. Specifically, this class will activate as a Server.
 (This class will be activated when a SA node confirm its event.) 
 Copyright 2015 Razor TeamB in Ajou univ, All right reserved
 *********************************************************************************************************/

package connection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;

public class TCPServer {
	public int check = 0;
	
	public void running() throws IOException{		
		
		ServerSocket sSocket = new ServerSocket(550);//Portnum is 550
		System.out.println("Middleware Server is Activated");
		while(true){
			Socket sok = sSocket.accept();
			System.out.println("Accept SA node!");
			//Implements Something about thread for Each users
			//To-Do Something writing down
			
		}
	}
	//It is a sample(will be deleted)
}