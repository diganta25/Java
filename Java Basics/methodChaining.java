public class methodChaining {
    public static void main(String[] args) {
        // method chaining = a common syntax for invoking multiple method calls in OOP
		//					 condensing code into less lines

        String name = "     Viktor";

        // name = name.concat(" Stroboveski");
        // name = name.toUpperCase();
        // name = name.trim();

        name = name.concat(" Stroboveski").toUpperCase().trim();

        System.out.println(name);
    }
    
}
