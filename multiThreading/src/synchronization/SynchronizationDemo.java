package synchronization;

public class SynchronizationDemo{

	public static void main(String[] args) {
		
		DisplayMessage dm = new DisplayMessage(); // this Object is shared across threads

		MyThread t1 = new MyThread(dm,"Akhil");
		MyThread t2 = new MyThread(dm,"Akhi");
		
		t1.start();
		t2.start();
	}

}
