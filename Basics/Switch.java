import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int day = 1;
        System.out.println("Please enter the day no. from 1 to 7 (inclusive): ");
        day = Integer.parseInt(sc.next());
        System.out.println("You entered the day no. : " + day);

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                
            default:
                System.out.println("Oops! Seems like Invalid Day no.... " + day);
                break;
        }


        sc.close();

    }
}
