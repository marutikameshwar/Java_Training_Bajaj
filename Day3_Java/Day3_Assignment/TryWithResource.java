package Day3_Java.Day3_Assignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TryWithResource 
{
    public void TryWithResourceImplementation()
    {
    try(Scanner file=new Scanner(new File("test.txt")))
    {
        System.out.println(file.nextLine());
    }
    catch(FileNotFoundException e)
    {
        System.out.println(e);
    }
    }
}
