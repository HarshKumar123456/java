import java.util.*;

public class Strings { 

    public static void main(String[] args) {
        System.out.println("Namaste Duniya!");

        // String jo hai vo ek object hota hai samjhe

        // String ko define karne ke bahut se tarike hain jaise ki 

        String naamDoubleQuoteTarika = "pahla";
        String naamObjectTarika = new String("doosra");
        String naamAnotherStringTarika = new String(naamObjectTarika);
        String naamUsingOperatorTarika = naamDoubleQuoteTarika + naamObjectTarika;

        
        String naamUsingOperatorTarikaPartDoosra = naamDoubleQuoteTarika + " Maja Aaya";


        System.out.println(naamDoubleQuoteTarika);
        System.out.println(naamObjectTarika);
        System.out.println(naamAnotherStringTarika);
        System.out.println(naamUsingOperatorTarika);
        System.out.println(naamUsingOperatorTarikaPartDoosra);


        // String ko store karne ke liye JVM kya karta hai ki bhai ek String Constant Pool Create karta hai jo ki store karta hai strings ko hi sirf aur sirf samjhe 
        // Ab JVM kya karta hai ki bhai sabse pahle yo check karta hai ki bhai agar to pahle se jo bhi string aap banana chah rahe hon agar vo String Contant Pool mein exists karta hai to phir usi ka reference return kardo else nayi string bana do using literals of that string jisko store karna ho aur return kardo uska reference
        // Aur iska matlab ye bhi hai ki jaise agar do yaa do se adhik variables jinki value same hai vo log same memory ko hi refer kar rahe honge isse memory wastage nahin hoti par agar yahin par agar isko new keyword ke saath banaya jaye to phir heap mein store hoga aur nayi memory hi assign ki jayegi chahe content same hi kyon na ho 


        // Strings jo hain vo immutable hoti hain yaani ki ek baar banane ke baad changes nahin kar sakte hain aur aisa isliye kyonki baaki references bhi ho sakte hain na is same string memory ko point karte huye aur agar change kar diya to un references ko unexpected changes milenge jo ki sahi nahin hai : ) 

        // Different different constructors String ke dwara jo provide kiye gaye hain 
        char charArray[] = {'h', 'a', 'r', 's', 'h'};
        String emptyConstructorSeBaniString = new String();
        String ekStringKoParameterLekarBanaConstructorSeBaniString = new String("Main Ek String Hoon Bhai :)");
        String ekCharArrayKoParameterLekarBanaConstructorSeBaniString = new String(charArray);


        System.out.println("Empty Constructor Se bani String: " + emptyConstructorSeBaniString);
        System.out.println("Ek String ko parameter lekar Constructor se bani String: " + ekStringKoParameterLekarBanaConstructorSeBaniString);
        System.out.println("Ek char array ko parameter lekar Constructor se bani String: " + ekCharArrayKoParameterLekarBanaConstructorSeBaniString);


        System.out.println("Lo Bhai ab dekho StringBuffer ka kamaal dekho ismein kya kya hove hai....");
        StringBuffer stringKaBufferHaiYo = new StringBuffer();
        int capacityOfStringBuffer = stringKaBufferHaiYo.capacity();
        System.out.println("Abhi dekho at starting kitni capacity hai apni StringBuffer ki: " + capacityOfStringBuffer);
        stringKaBufferHaiYo.append(ekCharArrayKoParameterLekarBanaConstructorSeBaniString + " " + ekCharArrayKoParameterLekarBanaConstructorSeBaniString + " " + ekCharArrayKoParameterLekarBanaConstructorSeBaniString + " " + ekCharArrayKoParameterLekarBanaConstructorSeBaniString );
        capacityOfStringBuffer = stringKaBufferHaiYo.capacity();
        System.out.println("Abhi dekho after appending the string kitni capacity hai apni StringBuffer ki: " + capacityOfStringBuffer);
        System.out.println(stringKaBufferHaiYo.toString());


    };


};