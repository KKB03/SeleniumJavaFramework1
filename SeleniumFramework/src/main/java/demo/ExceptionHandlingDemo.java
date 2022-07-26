package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		try {
			int i = 1/0;
			System.out.println(i);
		}
		catch(Exception e){
		System.out.println("Exception occurrred");
		}
	}

}
