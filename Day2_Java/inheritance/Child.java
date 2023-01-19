package Day2_Java.inheritance;

public class Child extends Parent {
	int c = 5;
	public Child() {
		System.out.println("In child rn");
	}
	public Child(int c) {
		super();
		this.c = c;
	}
	public void show() {
		System.out.println("In child show");
	}
	public void addition() {
		int sum = p+c;
		System.out.println("sum = "+sum);
	}
	public void multiply() {
		int a = 200;
		super.p = a*c;
		int result = p*c;
		System.out.println(result);
	}
}
