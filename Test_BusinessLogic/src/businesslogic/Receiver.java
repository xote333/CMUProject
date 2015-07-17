package businesslogic;

import java.io.*;
import java.net.*;


public class Receiver {
	Socket socket = null;//Argument of Method
	DataInputStream input;//Data Stream

	String protocol_msg = null;//protocol messages
	String parsed_msg = null;//parsed message by parsing package

	// 2. MessageReceiver**********************************

	public void ReceiveMsg(Socket socket){
		this.socket = socket;
		try {
			input = new DataInputStream(this.socket.getInputStream());
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured");
		}
	}
	//Socket data input stream in here
}
