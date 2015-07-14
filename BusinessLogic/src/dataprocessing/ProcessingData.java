/***************************************************************************************************
 This package is used in DataBase system. Specifically, the Query of Database is set by this Package
 Data Protocol:
 Temperature | Humidity | Light | Proxy | Door | Alarm | Mailbox | Extra String
 Copyright 2015 Razor TeamB in Ajou univ, All right reserved
 ***************************************************************************************************/


package dataprocessing;



public class ProcessingData {
	private String temp = null;   //Temperature
	private String humi = null;   //Humidity
	private String light = null;  //Light
	private String proxy = null;  //Proxy
	private String door = null;   //Door
	private String alarm = null;  //Alarm
	private String mailbox = null;//Mailbox
	private String extra = null;  //Extra Body
	
	
	//private String Full_body = null;//Integrated Body
	
	public void setTemp(String temp){
		this.temp = temp;
	}//Set Temperature

	public String getTemp(){
		return temp;
	}//Get Temperature
	
	public void setHumi(String humi){
		this.humi = humi;
	}//Set Humidity
	
	public String getHumi(){
		return humi;
	}//Get Humidity
	
	public void setLight(String light){
		this.light = light;
	}//Set Light
	
	public String getLight(){
		return light;
	}//Get Light
	
	public void setProxy(String proxy){
		this.proxy = proxy;
	}//Set Proxy
	
	public String getProxy(){
		return proxy;
	}//Get Proxy
	
	public void setDoor(String door){
		this.door = door;
	}//Set Door sensor
	
	public String getDoor(){
		return door;
	}//Get Door sensor
	
	public void setAlarm(String alarm){
		this.alarm = alarm;
	}//Set Alarm
	
	public String getAlarm(){
		return alarm;
	}//Get Alarm
	
	public void setMailbox(String mailbox){
		this.mailbox = mailbox;
	}//Set Mailbox
	
	public String getMailbox(){
		return mailbox;
	}//Get Mailbox
	
	public void setExtra(String extra){
		this.extra = extra;
	}
	
	public String getAllbody(){
		String temp = humi+light+proxy+door+alarm+mailbox;
		return temp;
	}
}
