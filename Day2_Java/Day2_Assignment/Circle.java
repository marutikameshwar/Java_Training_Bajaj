package Day2_Java.Day2_Assignment;
class Circle extends Shape
{
	int radius;
	Circle(int radius)
	{
		super("Circle&quote");
		this.radius=radius;
		
	}
	public double CalculateArea()
	{
		return 3.14*radius*radius;
	}
}