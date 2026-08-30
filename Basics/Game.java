class Tekken3 {

    // Static varaibles ko sirf static block mein hi access kiya ja sakta hai aisa
    // bilkul nahin hai but it is good practice always ki static wale mein ho karen
    // taaki confusion na ho
    static int timeToComplete = 10;

    // Ye instance variable hai laadle samjhe
    String message = "Welcome to Tekken 3 Game";

    static {
        System.out.println(
                "Ye Tekken3 ka static block hai ye ek hi Baar Call hoga chahe jitne bhi objects bana lo aur ye call hoga class ke JVM ke classLoader mein load hote hi aur classLoader mein class ko load kiya jata hai JVM ke dwara objects banane se pahle samjhe aur agar object nahin banaye kisi class ke to JVM load bhi nahin karta us untouched class ko samjhe");
        System.out.println();
    }

    Tekken3() {
        System.out.println(
                "Ye Tekken3 ka default constructor hai aur ye jab jab bhi object banaoge tab tab call hoga samjhe");
    }

    static void timeRemaining() {
        System.out.println(
                "Ye Tekken3 ka static method hai jo bina kisi object ko banaye bhi call kiya ja sakta hai samjhe");
        System.out.println("Time to complete this game is: " + timeToComplete);
    }

    // Static methods ke andar object ki cheejen kuchh is tarah use kar sakte hain
    // kyonki this keyword work nahin karta ismein kyonki ye static methods kisi
    // object se attached nahin hote hain isliye inhe explicitly object reference
    // pass karna hota hai
    static void timeRemaining(Tekken3 game) {
        System.out.println("Time to complete this game is: " + timeToComplete);
        game.welcome();
    }

    void welcome() {
        // Ye Static variable ko instance method mein access nahin karna chahiye
        System.out.println("Welcome...." + timeToComplete);
    }

}

public class Game {


    // Ye jo throws keyword haina iski vajah se hamen try catch vagairah karke handle nahin karna pada exception ko but iska matlab hai ki ab hamari jagah is function ko call karne wale function ko hi ise handle karna padega aur main() mein ye karna is not good practice par is tarah try catch se bachne yaa yoon kahen ki exception handling se bachne ko hi Ducking Exception kaha jata hai samjhe
    public static void main(String[] args) throws ClassNotFoundException {

        // Ye class ko explicitly classloader se load karane ke liye Use hota hai
        // Aur iska matlab ye hai ki apna jo classloader hota hai JVM ke andar vo isko
        // load kar lega mast aur class ke load hote hi kya hota hai static block run ho
        // jata hai samjhe
        Class.forName("Tekken3");

        Tekken3 game1 = new Tekken3();
        Tekken3 game2 = new Tekken3();

        // Ye dekho anonymous object ka najara
        (new Tekken3()).welcome();

        game1.welcome();

        if (game1.equals(game2)) {
            System.out.println("Ye game1.equals(game2) false hoga kyonki do alag alag object references hain samjhe");
            System.out
                    .println("The equals method implements an \"equivalence relation\" on non-null object references.");
        }

        // Ye lines uncomment karne par game1.message.equals(game2.message) will return false
        // game1.message = "Hello";
        // game2.message = "Hi";

        if (game1.message.equals(game2.message)) {
            System.out
                    .println("The equals method implements an \"equivalence relation\" on non-null object references.");
        }

    }

}
