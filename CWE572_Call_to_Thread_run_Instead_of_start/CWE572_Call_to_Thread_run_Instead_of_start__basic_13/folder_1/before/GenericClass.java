public class GenericClass {
public void genericMethod () throws Throwable{
    if (IO.STATIC_FINAL_FIVE == 5) {
        IO.writeLine("bad() Main thread name is: " + Thread.currentThread().getName());
        Thread threadOne = new Thread() {

            public void run() {
                IO.writeLine("bad() In thread: " + Thread.currentThread().getName());
            }
        };
        threadOne.run();
        /* FLAW: Called Thread.run() instead of Thread.start() */
    }
}
}