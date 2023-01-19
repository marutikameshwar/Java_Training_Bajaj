//incomplete

package Day3_Java.Day3_Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.text.AbstractDocument.Content;

public class MergeFileException {
    public void MergeFilesExceptionDemonstration()
    {
        try{
            File file1 = new File("C:\\Users\\pankaj\\Desktop\\test.txt"); // put the location of the fiel
            BufferedReader br1= new BufferedReader(new FileReader(file1));
            File file2 = new File("C:\\Users\\pankaj\\Desktop\\test.txt"); // put the location of the fiel
            BufferedReader br2= new BufferedReader(new FileReader(file2));
            try
            {
                String File1Content=br1.readLine();
                String File2Content=br2.readLine(); 
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
