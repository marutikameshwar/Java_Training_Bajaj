package Day2_Java.inheritance;

public class TestParentChild {

	public static void main(String[] args) {
		Child child = new Child();   //Calling the non parameterized constructor
		Child children = new Child(200);  //calling the parameterized cons
		children.addition();  
		children.display();
		children.show();
		child.display();
		child.show();
		child.addition();
		child.multiply();
		
	}

}
