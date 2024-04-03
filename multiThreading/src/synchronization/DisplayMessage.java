package synchronization;

public class DisplayMessage {

	public synchronized  void sayHello(String name) {           // for making  method synchronized
		for (int i = 1; i <= 3; i++) {
			System.out.println("How are you " + name);

		}
	}

}
   