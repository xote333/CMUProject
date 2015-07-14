/***************************************************************************************************
 Copyright 2015 Razor TeamB in Ajou univ, All right reserved
 ***************************************************************************************************/


package eachuser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.*;

import parsing.*;//Parsing Package
import dataprocessing.*;//Data processing Package




public class UserThread {
	private String Id = null;
	private String Password = null;//user information

	private String protocol_msg = null;//protocol messages

	private String parsed_msg = null;//parsed message by parsing package




	public void setId(String id){
		this.Id = id;
	}//ID
	public void setPassword(String password){
		this.Password = password;
	}//Password

	// 1. TCP Socket and Streaming*************************
	public void TCPClient(){
		Socket socket = null;
		try {
			socket = new Socket("192.168.1.119", 550);
			BufferedReader br;
			BufferedWriter bw;

			//SendThread st = new SendThread(socket);
			//ReceiveThread rt = new ReceiveThread(socket);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	// End of Section 1************************************

	// 2. MessageReceiver**********************************
	public void setMsg(String msg){
		this.protocol_msg = msg;
	}
	public String getMsg(){
		return this.protocol_msg;
	}//protocol message setting

	// End of Section 2************************************

	// 3. Parsing Protocol Message*************************
	public void parsedMsg(){
		String temp = null;
		Parsing parsed = new Parsing();
		//Implement the parsing method
		parsed.ReadMsg(this.protocol_msg);
		parsed.MessageProcess();
		temp = parsed.getParsedmsg();
		this.parsed_msg = temp;
	}

	// End of Section 3************************************


	// 4. All sensor data**********************************
	public void allBody(){

	}

	// End of Section 4************************************

	// Sample view
	public String sampleView(){
		return this.parsed_msg;
	}
}
