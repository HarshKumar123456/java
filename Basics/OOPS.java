
// Ismein dekho Method Overloading karke dikhaya gaya hai
class Calculator {
    public int add(int first, int second) {
        return first + second;
    }

    public int add(int first, int second, int third) {
        return first + second + third;
    }

    public double add(double first, int second) {
        return first + second;
    }

    public double add(double first, double second) {
        return first + second;
    }
}

// Ye abstract class hoti hai jo ki mast apna abstract or non abstract functions
// rakh sakti hai
abstract class AnimatedCharacters {

    // Abstract functions mein kya hota hai ki body nahin hoti hai
    abstract void move();

    // Non abstract functions mein kya hota ki body hoti hai
    void walk() {
        System.out.println("Walking....");
    } 

}



// Dekho interface mein kya hota hai ki saare ke saare functions abstract aur public hote hian even mention bhi na karen to bhi
interface CuteCharacters {
    // Ye kar sakte hain but of no use to kahe ke liye karna
    private void kidFriendly() {
        System.out.println("Private Method which tells this character is kid friendly....");
    }

    // Ye Error dega kyonki by default saare function abstract public hote hain samjhe
    // public void feelsLike() {
    //     System.out.println("It gives feeling like living your childhood....");
    // }

    void feelsLike();
}

// Ye dekho bhai Getters Setters ka example
class Cartoon extends AnimatedCharacters implements CuteCharacters {

    // Agar abstract class ko inherit yaa java ki language mein kahein to extends
    // kiya to sabhi abstract functions ko implement yaani ki override karke body
    // likhna combulsory hai kya bote to combulsory samjhe yaa samjhaun
    @Override
    void move() {
        System.out.println("Cartoon is moving....");

    }

     @Override
    public void feelsLike() {
        System.out.println("It gives feeling like living your childhood....");
    }

    private int age;
    private int height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void speak() {
        System.out.println("Speaking....");
    }

   
}

// Ye dekho ismein Inheritance aur Override kaise karte hain ek function ko ye
// bataya gaya hai
class Paul extends Cartoon {
    public int health;

    @Override
    public void speak() {
        System.out.println("Bhai main Paul Hoon....");
    }

    public void fight() {
        System.out.println("Bhai Paul hoon to kya ladta hi rahoonga....");
    }

}

public class OOPS {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Dekho Method Overloading
        // Just like C++ Samjhe Laadle :)
        // O Paaji kade has bhi liya karo :)
        System.out.println("Dekho Method Overloading....");
        System.out.println("Dekho ye: int add(int, int): " + calc.add(1, 2));
        System.out.println("Dekho ye: int add(double, int): " + calc.add(10.0, 2));
        System.out.println("Dekho ye: int add(int, int, int): " + calc.add(1, 2, 3));
        System.out.println("Dekho ye: double add(double, int): " + calc.add(10.0, 2));
        System.out.println("Dekho ye: double add(double, double): " + calc.add(10.0, 20.0));

        // Dekho ye Dynamic Method Dispatch
        System.out.println("Dekho ye Dynamic Method Dispatch....");
        Cartoon cartoon = new Paul();
        cartoon.speak(); // Ye wali line se print hoga Paul class ka implemented version
        // Agar C++ hoti to aisa nahin hota jis class ka pointer variable hai usi class
        // ka function call hota samjhe

        // Ab ye dekho mast implementation of the Abstract & Anonymous Inner Class
        // Anonymous Inner class ka matlab yahi hai ki agar sirf ek baar ke liye apne ko implementation badalna ho us class ke methods ka to faltu mein ek aur nayi class banao phir extends karke override karo functions ko isse achcha yahin par ek implementation likh do 
        // Ab kyonki AnimatedCharacters ek abstract class hai to ye kahlayegi kya Abstract & Anonymous Inner Class samjhe 
        AnimatedCharacters character = new AnimatedCharacters() {
            void move() {
                System.out.println("Animated Character is moving....");
            }
        };
        character.move();

    }
}