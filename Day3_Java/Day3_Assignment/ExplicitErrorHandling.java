package Day3_Java.Day3_Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExplicitErrorHandling {
    public void ExplicitNullPointer()
    {
        String string=null;
        try
        {
            string.length();
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    
    }
    public void ExplicitArithmeticException()
    {
        try
        { 
            int result=1/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
    public void ExplicitFileNotfoundException()
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
