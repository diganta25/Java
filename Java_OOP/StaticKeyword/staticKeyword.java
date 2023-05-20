package Java_OOP.StaticKeyword;

public class staticKeyword {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member

        Friend friend1 = new Friend("Simon");
        Friend friend2 = new Friend("Kyle");
        Friend friend3 = new Friend("MacTavish");
        

        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();

        
   
    }
    
}
