class Student {
    int rollno;
    String name;
    int marks;
}

public class Array {
    public static void main(String[] args) {

        // Jagged Array ka matlab basically hai ki bhai ismein kitne bhi columns present
        // ho sakte hain kisi particular row mein samjhe
        int jaggedArray[][] = new int[3][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[2];

        int twoDimensionalArray[][] = new int[3][4];
        int threeDimensionalArray[][][] = new int[3][4][5];

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (int) (Math.random() * 10);
            }
        }

        // Printing Jagged Array
        System.out.println("Printing Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }


        // Making Array of Objects
        // Is array mein kya hoga ki har ek place jo hai vo class type Student object ka reference hold kar raha hoga samjhe yaani ki actual object nahin hoga ye students[index] instead ye hoga object ka reference aur iski by default value hogi null samjhe  
        Student students[] = new Student[3];
        System.out.println("Printing Student Array i.e. Array of Objects: ");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Student A";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Student B";
        s2.marks = 67;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Student C";
        s3.marks = 97;


        // Assigning the real object's reference
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println("\nPrinting Student Array i.e. Array of Objects: ");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ":" + students[i].marks);
        }
    }
}
