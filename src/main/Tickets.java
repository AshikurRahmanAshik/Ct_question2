package main;

import java.util.Scanner;

public class Tickets {
	
	public static final int total = 100;
    public static final int max = 4;

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int tickets = total;
        int buyers = 0;

        while(tickets > 0) {

            int count = in.nextInt();

            if(count < 0 || count > max)
            	continue;

            if(count == 0)
                continue;


            if(tickets < count)
                continue;

            tickets = tickets - count;
            buyers++;
            
        }

        System.out.println("All(100) tickets have been sold, to " + buyers + " buyers.");
        
    }

}
