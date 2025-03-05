import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist{
    public static void main(String[] args){
        ArrayList<String> fruits=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Number of Fruits:");
        int n=sc.nextInt();
        sc.nextLine();//consume the new nextLine
        
        for(int i=0;i<n;i++){
            System.out.print("Enter Fruit "+(i+1)+":");
            String fruit=sc.nextLine();
            fruits.add(fruit);
        }
        
        System.out.println("Fruits List:"+fruits);
        System.out.println("First Fruit:"+fruits.get(0));
        
        fruits.remove("Banana");
        System.out.println("After Removing Banana:"+fruits);
        
        if(fruits.contains("Mango")){
            System.out.println("Mango is in the list.");
        }
        
        System.out.println("Iterating over the List:");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        
        System.out.println("Total Fruits:"+fruits.size());
        
        fruits.clear();
        System.out.println("After clearing , is the list is emplty: "+fruits.isEmpty());
    }
}