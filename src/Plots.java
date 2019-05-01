import java.util.Scanner;
import java.util.Timer;

public class Plots {
    private boolean plotFilled;
    public double cropTime;
    public static void Remainder(int seconds){


    }


    public void setPlotStatus(boolean  b){
        plotFilled = b;
    }
    public static long[][] plots = new long[3][3];
    public static int[][] displayPlots = {
            {1,2,3},
            {4,5,6},
            {7,8,9}};

    public static void resetPlots(){
        for(int i = 0; i < 4; i++ ){
            for(int b = 0; b < 4; b++){
                plots[i][b] = 0;
            }
        }
    }

    public static void plantCrop(int plotToPlantOn){

        int x = (plotToPlantOn-1)/3;
        int y = (plotToPlantOn-1)%3;

        System.out.println("X: " + x + "Y: " + y);
        plots[x][y] = setTime(30);
    }





    public static long setTime(int t){
        return (System.currentTimeMillis()/1000) + t;
    }

    public double getCropTime(){
        return cropTime;
    }

    public boolean isPlotFilled(){
        return plotFilled;
    }

    public void displayPlotempty(){
        System.out.println( "_________________________" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _|" );
        System.out.println("|_________________________|" );
    }

    public void displayPlotFilled(){
        System.out.println( "_________________________" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|. _ . _ . _ . _ . _ . _ _|" );
        System.out.println("|_________________________|" );




    }



}