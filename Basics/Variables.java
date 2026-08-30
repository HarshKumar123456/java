public class Variables {

    // Member Yaa Instance Variables

    // Ye sabhi member yaa instance variables accessible hote hain methods, constructors and blocks in the class samjhe yaani ki is Variables class ke dwara inko access kiya ja sakta hai
    // Ye jo Instance variables hote hain inmein default values hoti hain jaise int ke liye 0 aur Boolean ke liye false aur String ke liye null aur float ke liye 0.0 type samjhe
    int variableWithoutInitialValue;
    int variableWithInitialValue = 100;
    private int variableWithoutInitialValueAndPrivate;
    private int variableWithInitialValueAndPrivate = 100;



    // Class Yaa Static Variables 

    // Ye basically class ka variable hota hai instance ka nahin iska matlab ki iski value sabhi instances of the class ke liye same hogi samjhe aur isko constructor aur method ke bahar declare karte hain jaise Member Yaa Instance Variables ko declare karte hain 
    // Aur ye program ke start hone ke saath bante hain aur program ke khatam hone ke saath hi khatam ho jate hain 
    // Aur inmein default value 0 hoti hai int ke liye 
    // Boolean ke liye default value false hoti hai 
    // Object references ke liye default value null hoti hai
    // Values kabhi bhi assign kar sakte hain at the time of initialization, constructor ke andar samjhe
    // Bina object create kare hi access kar sakte hain isko aur vahi safe method rahta hai nahin to anamoly ke chances badh jate hain agar instance se access karne ki koshish ki jaye to samjhe 
    // Access karne ka syntax will be <ClassName>.<VariableName>
    // Yahan ke liye Variables.variableOfClass samjhe
    public static int variableOfClass = 100;



    // Parameters 

    // Are bhai simply jo functions mein pass kiye jaye vahi to parameters hote hain jaise ye String[] args
    public static void main(String[] args) {

        // Local Variables 

        // Unlike C++ ismein koi bhi garbage value nahin aa jayegi apneaap we have to give value either at the time of initialization or before use samjhe
        // Aur inmein apne access modifiers bhi nahin aayenge obvious si baat hai kyonki ye class ki state nahin hain samjhe

        int localVariableWithoutValue;

        localVariableWithoutValue = 100;

        System.out.println("Namaste Duniya! " + localVariableWithoutValue);


    }
}
