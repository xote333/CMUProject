/***************************************************************************************************
 This package is used in Paraphrasing in Data stream. Each control data will be parsed each String
 Being parsed by this class between WebHandler and Business logic.
 Copyright 2015 Razor TeamB in Ajou univ, All right reserved
 ***************************************************************************************************/

package parsing;

public class Parsing {
	public String sample = "013050";//This is sample string(will be deleted when socket message will be received)
	private String protocol_message = null;
	
	private String parsed_message = null;//parsed message will be in this String
	

	public void ReadMsg(String msg){
		this.protocol_message = msg;
		if(this.protocol_message == null)
			System.out.println("Failed to Read");
		else
			System.out.println("Read Success");
	}//Read protocol message and setting the message!

	public void MessageProcess(){
		String temp = null;

		try{
			temp = protocol_message.substring(0, 2);//Header analysis part
			switch (temp){
			case "01":
				//Do something
				
				this.parsed_message = "0100000000";
				break;
			case "02":
				//Do something
				
				this.parsed_message = "0200000000";
				break;
			case "03":
				//Do something
				
				break;
			case "04":
				//Do something
				
				break;
			case "05":
				//Do something
				
				break;
			case "06":
				//Do something
				
				break;
			case "07":
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
	public String getParsedmsg(){
		return this.parsed_message;
	}//This message will be sent to SA node
}
