import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);


        // Stream yaani ki jaise paani ki stream mein ek baar ek jagah par jis paani ko chhua use dobara nahin chhoo sakte haina vaise hi yahan ek baar stream ko use kiya to phir dobara use nahin kar sakte hain samjhe 
        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(result);




        // Method Reference
        List<String> names = Arrays.asList("Harsh", "Harsh Kumar");
        List<String> allCapsNames = names.stream()
                                        .map(String::toUpperCase)
                                        // Ye dono tarike se likha ja sakta hai yaani ki agar lambda function mein sirf ek function call ho raha ho to simply aise ham log Method Reference ka use kar sakte hain
                                        // .map(n -> n.toUpperCase())
                                        .toList();

        // Ye Optional Class ki help se ham log NullPointerException se bach sakte hain yaani ki agar to value mili to thik nahin to Optional Type ban jayega aur koi error nahin aayega par agar ham log fallback methods jaise orElse() type cheejein use karen to hi samjhe
        Optional<String> fullName = allCapsNames.stream()
                                        .filter(n -> n.contains("HARSH KUMAR"))
                                        .findFirst();
        
        System.out.println("Full name found is: " + fullName.orElse("Harsh Kumar"));
    }
}
