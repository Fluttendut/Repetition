import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader
{
    public static void main(String[] args)
    {

        File f = new File("Resources/File");
        try {
            int numberOfWords = 0;
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()) {
                sc.nextLine();
                numberOfWords++;
            }
            System.out.println("number of words " + numberOfWords);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Woops no file found");
        }

    }

}
