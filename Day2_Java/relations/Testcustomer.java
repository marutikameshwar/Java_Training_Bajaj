package Day2_Java.relations;

public class Testcustomer {
	public static void main(String[] args) {
		customer c1=new customer();
		c1.setCid(101);
		c1.setName("jam");
		Account account =c1.getAccount();
		account.setAnumber(112233);
		account.setBalance(5000);
		System.out.println(c1.getCid()+" "+c1.getName()+" "+c1.getAccount().getAnumber()+" "+c1.getAccount().getBalance());
	}
}
