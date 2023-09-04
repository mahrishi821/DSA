import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        
        switch (fruit) {
            case "Mango":
                System.out.println("Kings of Fruit");
                break;
                
            case "Apple":
                System.out.println("A sweet fruit");
                break;
                
            case "Orange":
                System.out.println("Small fruit");
                break;
                
            default:
                System.out.println("You entered wrong fruit");
        }
    }
}
