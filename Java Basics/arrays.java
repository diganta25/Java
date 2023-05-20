public class arrays {
    public static void main(String[] args) {
        
        // array = used to multiple value in single variable

        // String cars[] = {"Camaro", "Dodge", "Tesla", "BMW"};

        String cars[] = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Dodge";
        cars[2] = "Tesla";

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
