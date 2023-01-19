package Day3_Java.collections;
import java.util.ArrayList;
import java.util.List;
public class LoopsOfCollections {
    public static void main(String args[])
    {   
        List <String>arr=new <String> ArrayList();
        arr.add("ram");
        arr.add("shyam");
        arr.add("jaam");
        for(String name:arr) System.out.println(name);
    }
}
