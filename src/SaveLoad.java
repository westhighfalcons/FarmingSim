import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.*;

public class SaveLoad {
    public static void ResetSave(){
        //This method resets the save data by overwriting the current data with starting data, causing the game to load the basics.
        try {
            PrintWriter write = new PrintWriter( "saveData.txt", StandardCharsets.UTF_8 );
            write.println("100");
            write.println( "new");
            write.println( "false" );
            write.println( "false" );
            write.println( "false" );
            write.println( "false" );
            write.close();
            System.out.println( "You have reset the game." );
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void Load(){

        // The name of the file to open.
        String fileName = "saveData.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.

            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            line = bufferedReader.readLine();

            if (line == null) {
                Save();
                return;
            }

            Inventory.setWallet( Integer.parseInt(line));
            line = bufferedReader.readLine();
            Main.name = line;
            line = bufferedReader.readLine();
            Inventory.lTractor = Boolean.parseBoolean( line );
            line = bufferedReader.readLine();
            Inventory.bTractor = Boolean.parseBoolean( line );
            line = bufferedReader.readLine();
            Inventory.mTractor = Boolean.parseBoolean( line );
            line = bufferedReader.readLine();
            Inventory.sTractor = Boolean.parseBoolean( line );
            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
//            System.out.println(
//                    "Unable to open file '" +
//                            fileName + "'");
            System.out.println("Creating file " + fileName + "...");
            // Call the save method
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }

    }
    public static void Save(){

        try {
            //this method takes all your current stats and inventory and saves it to a text file to be read the next time you start the game.
            PrintWriter write = new PrintWriter( "saveData.txt", StandardCharsets.UTF_8 );
            write.println( Inventory.getWallet() );
            write.println( Main.name );
            write.println( Inventory.lTractor );
            write.println( Inventory.bTractor );
            write.println( Inventory.mTractor );
            write.println( Inventory.sTractor );
            write.close();
            System.out.println( "You have saved your game." );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
