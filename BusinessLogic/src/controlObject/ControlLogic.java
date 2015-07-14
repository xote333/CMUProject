package controlObject;

public interface ControlLogic {
	boolean state = false;//State
	String msg = null;//Input Protocol message
	String body = null;//Act
	
	public boolean GetStateObject();//Information of object state
	public boolean ControlObject();//Control 	
}

