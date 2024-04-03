package multiThreading;

public class SingleThreaded {
	public static void main(String[] args) {
	

		 SingleThreaded st = new SingleThreaded(); // Object creation for Calling Method  (Invoke Default constructor)
		 st.printNumbers();
		
		 for (int j= 1; j <= 12; j++) {                  // i & j are index 
			 System.out.print("j: "+j+ "\t");
		}
		}
		void printNumbers() {
			for (int i= 1; i <= 12; i++) { 
				 System.out.println("i: "+i+ "\t");
		}
			 System.out.println("This follow a specific Order");

		}
}
