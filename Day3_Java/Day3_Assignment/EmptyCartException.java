package Day3_Java.Day3_Assignment;
import java.util.Scanner;
import java.util.ArrayList;


public class EmptyCartException {
    ArrayList<Integer> ItemId=new ArrayList<Integer>();
    ArrayList<String> Name=new ArrayList<String>();
    ArrayList<Integer> Price=new ArrayList<Integer>();
    public void Add(int ItemId,String Name,int Price)
    {
        this.ItemId.add(ItemId);
        this.Name.add(Name);
        this.Price.add(Price);
    }
    public void DisplayCart()
    {
        try{
            if(ItemId.size()==0)
            {
                throw new CartEmptyException("the cart is empty");
            }
            else
            {
            for(int i=0;i<ItemId.size();i++)
            {
                System.out.println("Item ID : "+ItemId.get(i)+" Name of Product : "+Name.get(i)+" Price : "+Price.get(i));
            }
            }
        }
        catch( CartEmptyException e)
        {
            System.out.println(e);
        }
    }
}
//create cart exception
class CartEmptyException extends Exception
{
    CartEmptyException(String message)
    {
        super(message);
    }
}

