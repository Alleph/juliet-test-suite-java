public class GenericClass {
public void genericMethod () throws Throwable{
    if (privateTrue) {
        int zeroOrOne = (new SecureRandom()).nextInt(2);
        boolean isZero = (zeroOrOne == 0);
        if (isZero = true) /* FLAW: should be == and INCIDENTIAL CWE 571 Expression Is Always True */
        {
            IO.writeLine("zeroOrOne is 0");
        }
        IO.writeLine("isZero is: " + isZero);
    }
}
}