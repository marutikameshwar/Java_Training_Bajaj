package Day2_Java.relations;
//This is a composition relationship
public class customer {
	private int cid;
	private String name;
	private Account account;
	public customer() {
		account = new Account();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	// hello world
	
}
