
import java.util.Scanner;

public class ExceptionExample {
   public static void main(String[] args) {
    new ExceptionExample();
   }


    public ExceptionExample() {
        Scanner scanner = new Scanner(System.in);
        
        
        
        int i = Integer.MAX_VALUE;
        
        while (i == Integer.MAX_VALUE) {
            System.out.println("Enter a number: ");
            String numberString = scanner.nextLine();
            try {
                i = Integer.parseInt(numberString);
            } catch (NumberFormatException e){
                
            }
        }
        
        System.out.println("You entered " + i);
        
        System.out.println("Enter a boolean: ");
        
        String booleanString = scanner.nextLine();
        boolean b = Boolean.parseBoolean(booleanString);
        System.out.println("You entered " + b);
    }
}