public class Inventory {
    public static int harvestedCrops = 0;
    private static int wallet = 100;
    public static boolean bTractor = false;
    public static boolean sTractor = false;
    public static boolean mTractor = false;
    public static boolean lTractor = false;

    public Inventory(int w) {
       wallet = w;

    }
    //this whole class just keeps track of what you have and how much of it you have.
    static void setWallet(int w) {
        wallet = w;
    }

    static int getWallet(){
        return wallet;
    }

    public void addWallet(int w){
        wallet = wallet + w;
    }

    public static void setHarvestedCrops(int amount) {
        harvestedCrops = amount;
    }

    public static void addHarvestedCrops(int amount) {
        harvestedCrops += amount;
    }

    public static int getHarvestedCrops() {
        return harvestedCrops;
    }


}
