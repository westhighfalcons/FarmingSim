public class Inventory {
    public static int wheat = 0;
    public static int corn = 0;
    public static int soybeans = 0;
    private static int wallet = 1000;

    public Inventory() {wallet=50;}
    public static void setWallet(int w ){wallet = w;}
    public static int getWallet(){
        return wallet;
    }


}
