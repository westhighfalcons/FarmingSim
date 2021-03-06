import java.util.Scanner;
import java.util.Timer;

public class Plots {



    // creates and displays the plots
    public static long[][] plots = new long[3][3];
    public static int[][] displayPlots = {
            {1,2,3},
            {4,5,6},
            {7,8,9}};

    public static void setPlots(int i, int b){
        plots[i][b] = 1;
    }
    // allows you to plant your crops
    static void plantCrop(int plotToPlantOn){
        if(Inventory.lTractor){

            plots[getX(plotToPlantOn)][getY(plotToPlantOn)] = setTime(25);
        }
        else if(Inventory.bTractor){

            plots[getX(plotToPlantOn)][getY(plotToPlantOn)] = setTime(30);
        }
        else if(Inventory.mTractor){

            plots[getX(plotToPlantOn)][getY(plotToPlantOn)] = setTime(45);
        }
        else if(Inventory.sTractor){
            plots[getX(plotToPlantOn)][getY(plotToPlantOn)] = setTime(60);
        }

        else
            System.out.println( "You do not have any tractors to plant with!!" );

    }
    //getting coordinates for the 2D array
    private static int getX(int input) {
        return (input-1)/3;
    }

    private static int getY(int input) {
        return (input-1)%3;
    }

    public static void harvest(int plotToHarvest) {
        // Put crop into inventory
        if( plots[getX(plotToHarvest)][getY(plotToHarvest)] - (System.currentTimeMillis()/1000) <= 0 &&
                plots[getX(plotToHarvest)][getY(plotToHarvest)] - (System.currentTimeMillis()/1000) >= -10000) {
            plots[getX( plotToHarvest )][getY( plotToHarvest )] = 0;
            Inventory.addHarvestedCrops( 1 );
        }
        else
            System.out.println( "Crops not done!" );

    }

    public static void checkCrops() {
        // Prints out the planted plots
        for (long[] rows : Plots.plots) {
            for (long cols : rows) {
                if ((cols - (System.currentTimeMillis()/1000)) > 0)
                    System.out.print((cols  - (System.currentTimeMillis()/1000)) + " seconds,");
                else
                    System.out.print(0 + " seconds,");
            }
            System.out.print("\n");
        }
    }

//sets the time of the crops
    public static long setTime(int t){
        return (System.currentTimeMillis()/1000) + t;
    }





}