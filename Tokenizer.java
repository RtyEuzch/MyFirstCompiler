import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Tokenizer {
    private ArrayList<String> tokens;
    private Scanner sc;
    public Tokenizer(String sourceFileName) {
        tokens = new ArrayList<String>();

        // Creates a scanner that reads text from the file 
        // character-by-character
        try {
            sc = new Scanner(sourceFileName).useDelimiter("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void mainReader() {

    }

    // Main method used to try out features before implementation
    public static void main(String... args) {
        Scanner scan = null;
        try {
            scan = new Scanner(new File("text.txt")).useDelimiter("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        while (scan.hasNext()) {
            System.out.print(scan.next() + " ");
        }
    }
}