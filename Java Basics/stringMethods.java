public class stringMethods {
    public static void main(String[] args) {

         // String = a reference data type that can store one or more characters
         //          reference data types have access to useful methods

        String name = "Stro";

        //boolean result = name.equalsIgnoreCase("bro");
        //int result = name.length();       //check length of string
        //char result = name.charAt(0);     // reutrns char at given position
        //int result = name.indexOf("o");   // returns int at char's 
        //boolean result = name.isEmpty();  // is string is empty or not
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();      // remove all the empty space
        String result = name.replace('o', 'a');


        System.out.println(result);
    }
}
