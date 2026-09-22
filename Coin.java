import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Coin {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        
        byte headsC = 0;
        byte tailsC = 0;
       
        File f = new File("flips.txt"); 
        s.close();
        s = new Scanner(f);
        for (byte i = 1; i < 98; i++){
       
            String latestL = s.nextLine();
            if (latestL.equals("heads")){
                headsC++;
            } else {
                tailsC++;
            }
        }
        System.out.println("Heads: " + headsC);
        System.out.println("Tails: " + tailsC);
    }

}