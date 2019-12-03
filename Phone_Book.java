
import java.util.Scanner;
import java.util.HashMap;


public class Phone_Book 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter no. of contacts:");
        int n=sc.nextInt();
        HashMap<String,Integer> hm=new HashMap<>();
          
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            System.out.println("Enter the name");
            String name=sc.next();
            System.out.println("Enter the number");
            int number=sc.nextInt();
            hm.put(name,number);
        }
        System.out.println("Enter number of contacts number find out by name");
        int m=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            String find=sc.next();
            if(hm.get(find) == null)
                System.out.println("Not Found");
            else
                System.out.println("Name :"+find+"\nNumber :"+hm.get(find));
        }
        
        
    }
}
