public class GenericClass {
public void genericMethod () throws Throwable{
    if (IO.STATIC_FINAL_FIVE != 5) {
        /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
        IO.writeLine("Benign, fixed string");
    } else {
        Cookie cookie = new Cookie("SecretMessage", "test");
        /* FIX: Set the max age to a negative value, so that it will only persist until the browser is shutdown */
        cookie.setMaxAge(-1);
    }
}
}