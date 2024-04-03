package synchronization;

public class MyThread extends Thread {

		DisplayMessage dm;   // use other class
		String name;
		
		MyThread(DisplayMessage dm, String name){
			this.dm = dm;
			this.name = name;            //if you write this in main this wont work 
			
		}
		
		public void rum() {
			dm.sayHello(name);     //This pass name to constructor
			
		}

	}


