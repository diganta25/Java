import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // ArrayList = 	a resizable array. 
		//				Elements can be added and removed after compilation phase
		//				store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hotdog");
        food.add("hamburger");

        food.set(0, "sushi");
        food.remove(1);
        food.clear();

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

        // for (String item : food) {       //for each loop
        //     System.out.println(item);
        // }
    }
    
}
