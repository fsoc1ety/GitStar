package Lab06;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    
    public static void main (String[] args) 
    {
        Item item;
        Item cartLoop;
        String itemName;
        double itemPrice;
        int quantity;
        ArrayList<Item> cart = new ArrayList<Item>();
        
        Scanner scan = new Scanner(System.in);
        
        String keepShopping = "y";
        
        do 
        { 
            System.out.print ("Enter the name of the item: ");
            itemName = scan.next();
            
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            
            // *** create a new item and add it to the cart
            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);
            
            // *** print the contents of the cart object using println
            System.out.println("Item\tPrice\tQuantity"
            		+ "\n************************");
            for (int i = 0; i < cart.size(); i++){
            	cartLoop = cart.get(i);
            	System.out.println(cartLoop.getName() + "\t" + cartLoop.getPrice()
            			+ "\t" + cartLoop.getQuantity());
            }
            System.out.println("Continue shopping (y/n)? ");
            keepShopping = scan.next();
        }
        while (keepShopping.equals("y"));
    }
} 