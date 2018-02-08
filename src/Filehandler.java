import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filehandler
{
    //Reads the names from a file and returns a String[] with the names.
    private static String[] readInfoFromFile(String path)
    {
        File file = new File(path);
        String[] groceryNames = new String[10];     //List to return.
        int size = 0;

        try
        {
            Scanner reader = new Scanner(file);

            while(reader.hasNextLine())
            {
                String[] temp;                      //Temporary storage array.
                String str = reader.nextLine();
                temp = str.split(",");

                for (String name : temp)
                {
                    groceryNames[size] = name;
                    size++;
                }
            }
            reader.close();
        }
        catch (FileNotFoundException FNF)
        {
            FNF.printStackTrace();
        }
        return groceryNames;
    }

    //Returns a name from the name[] based off index.
    public static String getGroceryName(int n)
    {
        if (n <= 10)
        {
            String[] namesFromList = readInfoFromFile("Groceries.txt");
            return namesFromList[n];
        }
        return "idiot";
    }
}
