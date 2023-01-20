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
            File file1 = new File("test1.txt"); 
            BufferedReader br1= new BufferedReader(new FileReader(file1));
            File file2 = new File("test2.txt"); 
            BufferedReader br2= new BufferedReader(new FileReader(file2));
            try
            {
                String File1Content=br1.readLine();
                String File2Content=br2.readLine(); 
                try
                {
                    char[] arr1=File1Content.toCharArray();
                    char[] arr2=File2Content.toCharArray();
                    String merged="";
                    int count=arr1.length;
                    if(count<arr2.length)
                       { count=arr2.length;}
                    for(int i=0;i<count;i++)
                    {
                        if(i<arr1.length)
                        {
                            merged=merged+arr1[i];
                        }
                        if(i<arr2.length)
                        {
                            merged=merged+arr2[i];
                        }
                    }

                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
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
