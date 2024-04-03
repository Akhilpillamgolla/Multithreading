package multiThreading;

public class MultiThreading extends  Thread{   //1 Approach other is using runnable 

	public static void main(String[] args) {
	MultiThreading mt = new MultiThreading(); 
	mt.start();
	
	for (int j=1; j <= 200; j++) {
		System.out.print("j: "+j+ "\t");
	}
	}
	public void run() {
		for (int i=1; i <= 200; i++) {
			System.out.print("i: "+i+ "\t");

		}
		System.out.println("There is no Specific order");

	}
}
