package Multithreading;

public class multithreading {
    public static void main(String[] args) throws InterruptedException {
        
        // multithreading - process of executing multiple threads simultaneously
        //                  Helps maximum utilization of CPU
        //                  Threads are independent, they don't affect the execution of other threads
        //                  An exception in one thread will not interrupt other threads
        //                  useful for serving multiple clients, multiplayer games, or other mutually independent tasks. 

    	// Create a subclass of Thread
    	MyThread thread1 = new MyThread();
    	  
    	//or 
    	
    	//implement Runnable interface and pass instance as an argument to Thread() 
    	MyRunnable runnable1 = new MyRunnable();
    	Thread thread2 = new Thread(runnable1);
        
        // thread1.setDaemon(true);
        // thread2.setDaemon(true);

        thread1.start();
        // thread1.join(3000);   //calling thread (ex.main) waits until the specified thread dies or for x milliseconds
        thread2.start();

        System.out.println(1/0);
        
    }
    
}
