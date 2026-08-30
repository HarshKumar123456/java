// Ye to normally proper sirf abstract methods ke liye use hota hai
interface NormalInterfaceKaPrakar {
    // Ismein kya hai ki bhai kitne bhi functions ho sakte hain
}


// Iska Use Lambda functions vagairah ke liye hota hai
@FunctionalInterface
interface FunctionalInterfaceKaPrakar {
    // Ismein kya hai ki bhai sirf ek hi function ho sakta hai
    void speak();
}


// Iska use Serialize, Deserialize vagairah type cheejein karne mein hota hai
interface MarkerInterfaceKaPrakar {
    // Ismein kya hai ki bhai ek bhi function nahin hota hai
}




public class Interface {

    public static void main(String[] args) {
        // FunctionalInterfaceKaPrakar f = new FunctionalInterfaceKaPrakar() {
        //     @Override
        //     public void speak() {
        //         System.out.println("Main Functional Interface hoon....");
        //     }
        // };

        // f.speak();

        // Ab dekho kyonki functional interface mein ek hi function hota hai to new se lekar function ke signature tak to same hi rahne wala hai scene to kahe ke liye extra mehnat karna bhai samjhe yaani ki instead of writing those obvious things compiler ne diya hamein lambda function likhne ka mauka ab ye kya hota hai ye to aap jab dekhoge to janoge aur janoge to samjhoge na :)

        // Is tarah ke tarike se karne ka ek fayda aur hai ki extra class file nahin banti hai to file space aur call stack thoda sa bach jata hai to performance improvements ke liye daala gaya hai lambda function wala scene samjhe 
        FunctionalInterfaceKaPrakar f1 = () -> System.out.println("Main Functional Interface hoon....");

        f1.speak();




    }
}
