public class Inventory {
    public static int wheat = 0;
    public static int corn = 0;
    public static int soybeans = 0;
    private static int wallet = 100;
    private static int walletChange;
    private static int walletChangeSub;
    private static int totalWallet;

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


}
