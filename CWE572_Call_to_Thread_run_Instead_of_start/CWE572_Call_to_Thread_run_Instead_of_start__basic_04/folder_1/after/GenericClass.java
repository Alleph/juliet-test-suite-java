public class GenericClass {
public void genericMethod () throws Throwable{
    if (PRIVATE_STATIC_FINAL_TRUE) {
        IO.writeLine("good() Main thread name is: " + Thread.currentThread().getName());
        Thread threadTwo = new Thread() {

            public void run() {
                IO.writeLine("good() In thread: " + Thread.currentThread().getName());
            }
        };
        threadTwo.start();
        /* FIX: Correctly called Thread.start() */
    }
}
}