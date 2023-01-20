package Day3_Java.Day3_Assignment;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String args[])
    {   //implementing the divison exception
        DivisionException d=new DivisionException();
        d.DivisionExceptionExecution();
        //implementing the Throws 
        ThrowsException th=new ThrowsException();
        try
        {
            th.ExceptionDemonstration();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        //implementing multilte catch block
        MultiCatch m=new MultiCatch();
        m.MultiCatchBlock();

        //merge file exception still to be done
        MergeFileException merge=new MergeFileException();
        merge.MergeFilesExceptionDemonstration();
        //implementing the throw 
        int age=10;
        try
        {
            if(age >=18)
            {
                System.out.print("the age is valid");
            }
            else{
                throw new InvalidAgeException("the age is invalid");
            }
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e);
        }
        
        // implementing try with resource
        TryWithResource t=new TryWithResource();
        t.TryWithResourceImplementation();
        
        //Explicit Error Handling
        ExplicitErrorHandling ex=new ExplicitErrorHandling();
        ex.ExplicitNullPointer();
        ex.ExplicitArithmeticException();
        ex.ExplicitFileNotfoundException();

        //Empty cart exception handling.   

        EmptyCartException empty=new EmptyCartException();
        empty.DisplayCart();

}
}
