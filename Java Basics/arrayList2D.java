import java.util.ArrayList;

public class arrayList2D {
    public static void main(String[] args) {

        // 2D Array List - a dynamic list of list
        //                 you can change the size of the list during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        
        ArrayList <String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donut");

        ArrayList <String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList <String> drinksList = new ArrayList<>();
        drinksList.add("soda");
        drinksList.add("coffee");
        
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(0).get(0));

        // for (ArrayList item : groceryList) {
        //     System.out.println(item);
        // }
     

    }
    
}
