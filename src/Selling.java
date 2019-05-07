import java.util.Scanner;

public class Selling {
    public static void main(String[] args){


    }

    public static void  market(){

        System.out.println( "How many crops would you like to sell?" );

            //allows user to sell the crops they have for money to buy a bigger tractor for quicker harvest times.
            System.out.println( "You have " + Inventory.getHarvestedCrops() + " crops. " );

            Scanner input = new Scanner( System.in );
            String userInput = input.nextLine();
            if (Integer.parseInt( userInput ) <= Inventory.getHarvestedCrops()) {
                Inventory.setWallet( Inventory.getWallet() + (Integer.parseInt( userInput ) * 25) );
                System.out.println( "Your balance is now " + Inventory.getWallet() );
            }
            else
            {System.out.println( "You dont have that many crops!" );}

            System.out.println( "Would you like to keep selling crops?" );
            userInput = input.nextLine();
            if(userInput.equalsIgnoreCase( "no" ))
                System.out.println( "Exiting to main menu" );
            else
                market();




    }

}
