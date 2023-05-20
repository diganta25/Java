import java.util.Scanner;

public class nestedLoop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nested loops = a loop inside of a loop

        System.out.println("Enter # of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        int columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        String symbol = scanner.next();

        for(int i=1;i<= rows;i++){
            for(int j=1;j<= columns;j++){
                System.out.print(symbol+" ");
            }
            System.out.println();
        
        }
    }
}