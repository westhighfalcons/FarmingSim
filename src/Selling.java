import java.util.Scanner;

public class Selling {
    public static void main(String[] args){


    }

    public static void  market(){
        System.out.println( "Welcome to the market, what would you like to sell?" );
        Scanner input = new Scanner( System.in );
        String userInput = input.nextLine();
        if(userInput.toLowerCase().equals( "crops" )){
            System.out.println( "You have " + Inventory.getHarvestedCrops() + " crops. " );
            System.out.println( "How much would you like to sell?" );
            Inventory.setWallet(Inventory.getWallet() + (input.nextInt() * 25));
            System.out.println( "Your balance is now " + Inventory.getWallet() );
        }


    }

}
