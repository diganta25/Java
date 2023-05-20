Two ways to create thread :-
i) Create a sub class of Thread class (class_name extends Thread)

ii) Create a class which implements the Runnable interface (class_name implements Runnable)
    then take instance and pass it as a argument to the constructor of Thread class.
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1); 