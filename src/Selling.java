import java.util.Scanner;

public class Selling {
    public static void main(String[] args){


    }

    public static void  market(){
        System.out.println( "Welcome to the market, what would you like to sell?" );
        Scanner input = new Scanner( System.in );
        String userInput = input.nextLine();
        if(userInput.toLowerCase().equals( "corn" )){
            System.out.println( "You have " + Inventory.corn + " bushels of corn. " );
            System.out.println( "How much would you like to sell?" );
            Inventory.setWallet(Inventory.getWallet() + (input.nextInt() * 25));
            System.out.println( "Your balance is now " + Inventory.getWallet() );
        }
        if(userInput.toLowerCase().equals( "soybeans" )){
            System.out.println( "You have " + Inventory.corn + " bushels of soybeans. " );
            System.out.println( "How much would you like to sell?" );
            Inventory.setWallet(Inventory.getWallet() + (input.nextInt() * 35));
            System.out.println( "Your balance is now " + Inventory.getWallet() );
        }if(userInput.toLowerCase().equals( "wheat" )){
            System.out.println( "You have " + Inventory.corn + " bushels of wheat. " );
            System.out.println( "How much would you like to sell?" );
            Inventory.setWallet(Inventory.getWallet() + (input.nextInt() * 15));
            System.out.println( "Your balance is now " + Inventory.getWallet() );
        }

    }

}
