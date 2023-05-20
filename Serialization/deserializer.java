
import java.io.*;


public class deserializer {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        
        User user = null;

        FileInputStream fileIn = new FileInputStream("G:/My Personal/Coding/Java/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}
