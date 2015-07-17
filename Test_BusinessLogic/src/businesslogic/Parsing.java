/***************************************************************************************************
 This package is used in Paraphrasing in Data stream. Each control data will be parsed each String
 Being parsed by this class between WebHandler and Business logic.
 Copyright 2015 Razor TeamB in Ajou univ, All right reserved
 ***************************************************************************************************/

package businesslogic;

import java.net.Socket;

public class Parsing {
	private String protocol_header = null;//Header of message
	private String protocol_body = null;//Body of message
	
	//private String parsed_header = null;//parsed message of header	
	private String parsed_body = null;//parsed message of body
	
	private String set_msg = null;//Message setting
	
	
	public void Set_msg(String msg){
		this.set_msg = msg;
	}
	
	
	
	//Header message processing
	public void HeaderMessageProcess(Socket socket){
		String temp = null;
		

		try{
			temp = this.set_msg;//Header analysis part
			//tmep 
			switch (temp){
			case "1":
				//Do something
				
				Sender sending = new Sender();//Create instance for Socket stream
				sending.SenderMsg(socket, "It is Sample");
				System.out.println("111");				
				break;
			case "2":
				//Do something
				
								
				break;
			case "3":
				//Do something
				
				break;
			case "4":
				//Do something
				
				break;
			case "5":
				//Do something
				
				break;
			case "6":
				//Do something
				
				break;
			case "7":
				//Do something
				
				break;
				default:
					System.out.println("Range is extraordinary");
				
			}			
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
	
	public String GetBody(){
		return this.parsed_body;
	}
}
