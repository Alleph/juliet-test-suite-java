public class GenericClass {
public void genericMethod () throws Throwable{
    switch(8) {
        case 7:
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
            break;
        default:
            int zeroOrOne = (new SecureRandom()).nextInt(2);
            boolean isZero = false;
            if ((isZero = (zeroOrOne == 0)) == true) /* FIX: correct assignment */
            {
                IO.writeLine("zeroOrOne is 0");
            }
            IO.writeLine("isZero is: " + isZero);
            break;
    }
}
}