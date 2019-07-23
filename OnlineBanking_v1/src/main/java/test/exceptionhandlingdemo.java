package test;

public class exceptionhandlingdemo {

	public static void main(String[] args) {
	
		try {
		
			System.out.println("hello world");
			int i = 1/0;
			System.out.println("compeleted");
		}
		catch (Exception exp){
			System.out.println("i am inside catch block");
			System.out.println("Message is : " +exp.getMessage());
			System.out.println("cause is :" +exp.getCause());
			exp.printStackTrace();
			}
		finally  {
			System.out.println("you are in final block");
			
		}
}
}
