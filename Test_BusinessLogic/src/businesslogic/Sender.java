package businesslogic;

import java.io.*;
import java.net.*;


public class Sender {
	Socket socket=null;

	DataOutputStream output;

	String parsed_msg = null;//parsed_msg

	public void SenderMsg(Socket socket,String parsedmsg){
		this.socket = socket;
		try {
			output = new DataOutputStream(this.socket.getOutputStream());
			output.writeUTF(parsedmsg);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured");
		}
	}
}