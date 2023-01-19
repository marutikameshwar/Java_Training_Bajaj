package Day2_Java.Day2_Assignment;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    	Shape sq=new Square(10);
		Shape re=new Rectange(5,5);
		Shape cir=new Circle(7);
		System.out.println(sq.CalculateArea());
		System.out.println(re.CalculateArea());
		System.out.println(cir.CalculateArea());
}
}