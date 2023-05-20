package File_Class.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nNigga nigga nigga\nEverywhere");
            writer.append("\n  -A poem by Stro");
            writer.close();

        } catch (IOException e) {
            
        }
    }
    
}
