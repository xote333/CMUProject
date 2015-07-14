import connection.*;
import eachuser.*;

public class Test {
	public static void main(String argv[]){		
		UserThread uth = new UserThread();
		uth.setMsg("02");
		uth.parsedMsg();
		System.out.println(uth.sampleView());
	}
}

/*
class users implements Runnable {

	@Override
	public void run() {
		
		
	}
	
}
*/