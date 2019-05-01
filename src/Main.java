import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean gameState = true;
        boolean firstTime = true;
        String userinput;
        Scanner Sc = new Scanner( System.in );
        System.out.println( "Welcome to our farming game" );
        while (gameState) {
            userinput = Sc.nextLine();
            if (userinput.equalsIgnoreCase("help") || firstTime) {
                System.out.println( "To buy your first tractor and plot of land type Shop" );
                System.out.println( "To plant your crops type plant" );
                firstTime = false;
            } else if (userinput.toLowerCase().equals( "shop" )) {
                Shop tpShop = new Shop();
                tpShop.tpShop();
            } else if (userinput.equalsIgnoreCase("plant")) {
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

                // Prints out the planted plots
                for (long[] rows : Plots.plots) {
                    for (long cols : rows) {
                        System.out.print(cols + ",");
                    }
                    System.out.print("\n");
                }
            }

        }
    }
}