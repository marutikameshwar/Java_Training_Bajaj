package Day3_Java.Day3_Assignment;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsException {
    public void ExceptionDemonstration() throws FileNotFoundException
	{
			FileReader fileReader = new FileReader("Test.txt");  
	}
}
