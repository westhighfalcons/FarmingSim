import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.*;

public class SaveLoad {
    public static void ResetSave(){}
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
            Inventory.setWallet( Integer.parseInt( line ) );
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
