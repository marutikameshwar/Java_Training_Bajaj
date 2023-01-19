package Day2_Java.exception;

public class TestVoter {

	public static void main(String[] args) {
		Voter voter=new Voter();
		voter.validateage(18);
		System.out.println("Validation Done");
		
	}

}
