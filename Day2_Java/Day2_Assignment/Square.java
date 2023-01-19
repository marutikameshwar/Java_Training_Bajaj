package Day2_Java.Day2_Assignment;
class Square extends Shape{
	int side;
	Square(int side)
	{
		super("Square&quote");
		this.side=side;
	}
	public double CalculateArea()
	{
		return (double)side*side;
		
	}
	
}