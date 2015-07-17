import java.io.IOException;
import java.net.UnknownHostException;

import businesslogic.*;

public class Test {
	public static void main(String argv[]){		
		MiddlewareCaller msg = new MiddlewareCaller();
		try {
			msg.SendProtocol("1");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*
class users implements Runnable {

	@Override
	public void run() {
		
		
	}
	
}
*/