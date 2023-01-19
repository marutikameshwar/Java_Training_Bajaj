package Day2_Java.exception;

public class Division {
	public static void division(int num1,int num2) {
		try {
			int div=num1/num2;
			System.out.println(div);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println(num1+" "+num2);
		}
		
	}
	public void justfun() throws InterruptedException,ClassNotFoundException{
		Class.forName("");
		System.out.println("Break!!!");
		Thread.sleep(1000);
	}

}
