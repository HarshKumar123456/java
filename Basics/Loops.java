public class Loops {
    public static void main(String[] args) {

        for (int index = 0; index < 10; index++) {
            System.out.println("In for loop.... " + index);
        }

        int index = 0;
        while (index < 10) {
            System.out.println("In while loop.... " + index);
            index++;
        }

        index = 0;
        do {
            System.out.println("In do-while loop.... " + index);
            index++;
        } while (index < 10);

        int nums[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int number : nums) {
            System.out.println("In enhanced for loop.... " + number);
        }

        for (int number : nums) {
            System.out.println("In foreach loop.... " + number);
        }

    }
}
