package File_Class.FileClass;

import java.io.File;

public class fileClass {
    public static void main(String[] args) {

        // file = An abstract representation of file and directory pathnames

        File file = new File("G:/My Personal/Coding/Java/File_Class/FileClass/secretMessage.txt");

        if (file.exists()) {
            System.out.println("That file exists :O");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete();
          
            
        } else {
            System.out.println("That file does not exists :(");
        }
        
    }
    
}
