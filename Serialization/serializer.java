import java.io.*;

public class serializer {
    public static void main(String[] args) throws IOException {

        User user = new User();

        user.name = "Stro";
        user.password = "I<3pizza";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);

        out.close();
        fileOut.close();

        System.out.println("object info saved! :)");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    
    }

  
}

