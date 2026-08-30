class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}





class BandookKiGoli implements Runnable {

    @Override
    public void run() {
        System.out.println("Main Hoon Bandook ki Goli yaani ki Runnable aur Thread hai Bandook to bandook chalane ke liye jaise goli ko usmein daalna padta hai vaise hi Thread ke constructor mein Runnable ko daalkar chalaya ja sakta hai samjhe");
        
    }
    
}




class Counter
{
	int count;
	// Race Condition se bachane ke liye synchronized keyword ka use kiya hai
	public synchronized void increment()
	{
		count++;
	}
}



public class Threads {
    // Hamne throws keyword ka use karke Ducking Exception ko perform kiya hai yahan par mast samjhe
    public static void main(String[] args) throws InterruptedException {

        A a = new A();
        B b = new B();


        // Ye priority se ham control nahin kar rahen hain bas suggest kar rahe hain ki agar conflict ho hi jaye to priority kisko deni hai samjhe
        a.setPriority(Thread.MAX_PRIORITY);

        a.start();

        try {
            Thread.sleep(40);
        } catch (Exception e) {
            System.out.println("Bhaiya kuchh to hua hai jo nahin hona chahiye tha...." + e);
        }

        b.start();



        // Ye join se ham log deliberately wait kar rahe hain ki pahle ye khatam ho jayen phir aage ki process chalu ki jaye
        a.join();
        b.join();



        // Runnable Interface ke saath wala Thread
        Thread bandook = new Thread(new BandookKiGoli());
        bandook.start();



        // Runnable Interface ko ek aur tarike se use kar sakte hain
        Counter counterObjectReference = new Counter();
        Thread first = new Thread( () -> {
            for (int number = 0; number < 10000; number++) {
                counterObjectReference.increment();
            }
        });


        Thread second = new Thread( () -> {
            for (int number = 0; number < 10000; number++) {
                counterObjectReference.increment();
            }
        });

        

        first.start();
        second.start();


        first.join();
        second.join();


        System.out.println("After finishing increment by both the threads value of the count is: " + counterObjectReference.count);


        

    }
}
