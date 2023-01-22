package Day4Java.Lambda;

public class Lamb{
public static void main(String args[])
{
    InterfaceAddition result=(num1,num2)-> {
        return num1+num2;
    };
    System.out.println(result.addition(10,20));
    
}
}
