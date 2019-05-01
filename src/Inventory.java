public class Inventory {
    public static int harvestedCrops = 0;
    private static int wallet = 100;

    public Inventory(int w) {
       wallet = w;

    }

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
