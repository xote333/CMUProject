package sensor;

import controlObject.*;

public class Alarm implements ControlLogic  {
	
	String msg = null;//Input Protocol message
	String body = null;//Actual Data


	@Override
	public boolean GetStateObject() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ControlObject() {
		// TODO Auto-generated method stub
		return false;
	}
}
