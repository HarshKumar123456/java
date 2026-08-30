class YeBasAiseHiException extends Exception {
    public YeBasAiseHiException(String string) {
        super(string);
    }
}

public class CustomException {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                // throw new Exception("I don't want to do print zero");
                throw new YeBasAiseHiException("I don't want to do print zero");
        }

        catch (ArithmeticException e) {
            j = 18 / i;
            System.out.println("that is default output" + e);

            // System.out.println("Cannot divide by zero");
        }

        catch (Exception e) {

            System.out.println("Something went wrong." + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
