package Lab06;

import java.util.Scanner;

public class PowersOf2 {
    
    public static void main(String[] args)
    {
        int numPowersOf2;
        int nextPowerOf2;
        int exponent;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many powers of 2 would you like printed?");
        numPowersOf2 = scan.nextInt();
        
        //print a message saying how many powers of 2 will be printed 
        System.out.println(numPowersOf2 + " powers of 2 will be printed:");
        
        //initialize exponent -- the first thing printed is 2 to the what?
        exponent = 0;
        nextPowerOf2 = 1;
        
        while (exponent < numPowersOf2) 
        {
            System.out.println("2^" + exponent + " = " + nextPowerOf2);
            nextPowerOf2 = nextPowerOf2*2;
            exponent++;
      }
    }
}
