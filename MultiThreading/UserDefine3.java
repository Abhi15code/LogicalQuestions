package MultiThreading;

abstract class abs{
    public abs(int ab){
        System.out.println("this is one parameters constructor");
    }
    


}

public class UserDefine3 {

    public static void main(String[] args) // Define the main method
    {

        // Create a simple Thread by
        // implementing Runnable interface
        Thread t1 = new Thread(new Runnable() { // Create a new thread by implementing the Runnable interface
            public void run() // Define the run method
            {
                try {
                    // Try to make the thread sleep for -10
                    // milliseconds
                    Thread.sleep(100); // Attempt to make the thread sleep for a negative time
                } catch (InterruptedException e) { // Handle InterruptedException
                    e.printStackTrace(); // Print stack trace for the exception
                }
                System.out.println( // Print a message
                        "Welcome To GeeksforGeeks!");
            }
        });

        // Name the thread as "Test Thread"
        t1.setName("Test Thread");

        // Start the thread
        t1.start(); // Start the thread
    }
}
