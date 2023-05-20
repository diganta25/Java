package Java_OOP.ConstructorOverloading;

public class Pizza {

    String bread;
    String sauce;
    String cheeze;
    String topping;

    
	Pizza(){
		
	}
	
	Pizza(String bread){
		
		this.bread = bread;
	}
	
	Pizza(String bread,String sauce){
		
		this.bread = bread;
		this.sauce = sauce;
	}
	
	Pizza(String bread,String sauce,String cheeze){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheeze = cheeze;
	}

    Pizza(String bread, String sauce, String cheeze, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheeze = cheeze;
        this.topping = topping;
    }
}
