import java.util.Scanner;
public class Main {
    public static String name;


    public static void main(String[] args) {
        //Loads the save file as soon as the game starts

            SaveLoad.Load();
        boolean gameState = true;

        String userinput;
        Scanner Sc = new Scanner( System.in );
        System.out.println( "Welcome to our farming game" );
        if(name.equals( "new" )){
            //if it is a new game, it asks for your name.
            System.out.println( "Enter your name: " );
            name = Sc.nextLine();

        }
        else
            System.out.println( "Welcome back " + name );
            System.out.println( "Type commands to get started" );
        while (gameState) {
            //main menu where players interact with the game by typing in commands
            userinput = Sc.nextLine();
            if (userinput.equalsIgnoreCase("commands")) {
                System.out.println( "To buy your first tractor: *shop*" );
                System.out.println( "To plant your crops: *plant*" );
                System.out.println( "To sell stuff at the market:  *market*" );
                System.out.println( "To check if your crops are done: *check*" );
                System.out.println( "To harvest your crops: *harvest*" );
                System.out.println( "To save your data: *save*" );
                System.out.println( "To reset your save data: *reset*" );

            } else if (userinput.toLowerCase().equals( "shop" )) {
                Shop tpShop = new Shop();
                tpShop.tpShop();
            }
            else   if (userinput.toLowerCase().equals("market")) {
                Selling market = new Selling();
                market.market();
            }

            else if (userinput.equalsIgnoreCase("plant")) {
                // Do planting stuff
                // Prints out the plots and asks which plot to plant in
                System.out.println( "Which plot would you like to plant in?" );
                for (int[] rows : Plots.displayPlots) {
                    for (int cols : rows) {
                        System.out.print(cols);
                    }
                    System.out.print("\n");
                }
                // Gets input for the plot plant in
                int plot = Sc.nextInt();
                Plots.plantCrop(plot);

                Plots.checkCrops();
            } else if (userinput.equalsIgnoreCase("check")) {
                // Checks on the crops time left
                Plots.checkCrops();
            }
            else if(userinput.equalsIgnoreCase( "reset" )){

                SaveLoad.ResetSave();

            }
            else if (userinput.equalsIgnoreCase("harvest")) {
                // Prints out the plots and asks which plot to plant in
                System.out.println( "Which plot would you like to harvest?" );
                for (int[] rows : Plots.displayPlots) {
                    for (int cols : rows) {
                        System.out.print(cols);
                    }
                    System.out.print("\n");
                }
                // Gets input for the plot plant in
                int plot = Sc.nextInt();
                Plots.harvest(plot);

                Plots.checkCrops();

                System.out.println("You have " + Inventory.getHarvestedCrops() + " harvested crops.");
            } else if (userinput.equalsIgnoreCase( "save" )) {

                SaveLoad.Save();

            }
            }

        }
    }
