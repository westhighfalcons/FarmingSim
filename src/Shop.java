import java.util.Scanner;

public class Shop {

    public void tpShop() {

        Scanner Sc = new Scanner(System.in);
        String userinput;

        int sTractor = 50;
        int mTractor = 100;
        int bTractor = 150;
        int lTractor = 200;

        do {
            System.out.println("Welcome to the shop!");
            System.out.println("If you have just started buy a tractor with your money");
            System.out.println("Your current amount of money is : " + Inventory.getWallet());
            System.out.println("Would you like to buy a tractor? (Yes / No)");
            userinput = Sc.nextLine();

                // when they player buys a tractor, it sets its boolean to true, telling the game they bought the tractor.
            if (userinput.toLowerCase().equals("yes")) {
                System.out.println("The selection of tractors are: Small(50), Medium(100), Big(150), or Large(200)");
                userinput = Sc.nextLine();
            }if (userinput.toLowerCase().equals("small") && Inventory.getWallet() >= 50) {
                System.out.println("You have successfully bought a Small tractor");
                Inventory.setWallet(Inventory.getWallet() - sTractor);
                Inventory.sTractor = true;
            } else if (userinput.toLowerCase().equals("medium") && Inventory.getWallet() >= 100) {
                System.out.println("You have successfully bought a Medium tractor");
                Inventory.setWallet(Inventory.getWallet() - mTractor);
                Inventory.mTractor = true;
            } else if (userinput.toLowerCase().equals("big") && Inventory.getWallet() >= 150) {
                System.out.println("You have successfully bought a Big tractor");
                Inventory.setWallet(Inventory.getWallet() - bTractor);
                Inventory.bTractor = true;
            } else if (userinput.toLowerCase().equals("large") && Inventory.getWallet() >= 200) {
                System.out.println("You have successfully bought a Large tractor");
                Inventory.setWallet(Inventory.getWallet() - lTractor);
                Inventory.lTractor = true;
            } else if (userinput.toLowerCase().equals("small") && Inventory.getWallet() < 50) {
                System.out.println("You cannot afford a small tractor");
            } else if (userinput.toLowerCase().equals("medium") && Inventory.getWallet() < 100) {
                System.out.println("You cannot afford a medium tractor");
            } else if (userinput.toLowerCase().equals("big") && Inventory.getWallet() < 150) {
                System.out.println("You cannot afford a big tractor");
            } else if (userinput.toLowerCase().equals("large") && Inventory.getWallet() < 200) {
                System.out.println("You cannot afford a large tractor");
            }
            System.out.println("Your amount of money is " + Inventory.getWallet());
            System.out.println("Would you like to continue shopping? (yes or no) ");
            userinput = Sc.nextLine();

        } while (userinput.toLowerCase().equals("yes"));



    }
}




