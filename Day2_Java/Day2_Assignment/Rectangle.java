package Day2_Java.Day2_Assignment;

class Rectange extends Shape
{
	int length;
	int breath;
	Rectange(int length,int breath) {
		super("Rectangel&quote");
		this.length=length;
		this.breath=breath;
	}
	public double CalculateArea()
	{
		return (double) (length*breath);
	}
	
}