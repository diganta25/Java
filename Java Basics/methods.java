public class methods {
    public static void main(String[] args) {

        // method = a block of code that is executed whenever it is called upon
        String name = "Stro";
        int age = 21;
        hello(name, age);

        int x = 3;
        int y = 4;
        System.out.println(add(x, y));

    }

    static void hello(String x, int y) {
        System.out.println("Hello "+x);
        System.out.println("You are "+y+" years old");
    }

    static int add(int x, int y){
        return x+y;
    }
}
