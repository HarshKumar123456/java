import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        // Ye Scanner Object jo hai vo input vagairah lene ke kaam aayega samjhe
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator here are the operations available choose one operation and then input the operands to perform the operation on the operands (Sorry for the long text :) ): ");
        System.out.println("1 for +");
        System.out.println("2 for -");
        System.out.println("3 for /");
        System.out.println("4 for *");
        System.out.println("Please Enter the operation you want to perform: ");


        int operatorChoiceInput = sc.nextInt();

        System.out.println("Please Enter the two operands: ");
        double firstOperand = sc.nextDouble();
        double secondOperand = sc.nextDouble();
        double result = 0;

        if(operatorChoiceInput == 1) {
            result = add(firstOperand, secondOperand);
        }        
        else if(operatorChoiceInput == 2) {
            result = subtract(firstOperand, secondOperand);
        }
        else if(operatorChoiceInput == 3) {
            result = divide(firstOperand, secondOperand);
        }
        else if(operatorChoiceInput == 4){
            result = multiply(firstOperand, secondOperand);
        }
        else{
            System.out.println("Sorry !!  You have given the invalid operation as input.");
        }

        System.out.println("Result of the Operation is: " + result );

        sc.close();

    }


    public static double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public static double subtract(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public static double divide(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    public static double multiply(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

};