package countrycitylist;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

public class CountryCityList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap map = new HashMap();
        
        System.out.println("Welcome to portal");
        while(true){
            System.out.println("\n1-\tAdd your fav location\n2-\tShow Countries\n3-\tShow Cities"
                    + "\n4-\tShow full list\n5-\tRemove from list\n6-\tQuit");
            System.out.print("Press any number: ");
            int opt = sc.nextInt();
            if(opt == 1)
            {
                System.out.println("\nEnter your favourite City then Country");
                String city = sc.next();
                String Coun = sc.next();
                map.put(city, Coun);
                
            }else if(opt == 2){
                System.out.println("\nYou have entered these countries.\n");
                for(Object list : map.values())
                {
                    System.out.println(list);
                }
            }else if(opt == 3){
               System.out.println("\nYou have entered these cities.\n");
                for(Object list : map.keySet())
                {
                    System.out.println(list);
                } 
            }else if(opt == 4){
               System.out.println("\nTotal enteries:\n");
                for(Object list : map.keySet())
                {
                    System.out.println(list+ "\t\t" +map.get(list));
                } 
            }else if(opt == 5){
                System.out.println("\nEnter City to remove from the list\n");
                String cty = sc.next();
                map.remove(cty);
                System.out.println("Your entry " +cty+ " has been removed");
            }
            else
                break;                
        }
    
    }
    
}
