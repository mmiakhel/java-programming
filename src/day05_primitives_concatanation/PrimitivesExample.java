package day05_primitives_concatanation;

public class PrimitivesExample {
    public static void main(String[] args){
       //*****WHOLE NUMBERS/INTEGER TYPES****
        byte byteValue = 100;
        //short shortValue = 33000; ->will not work cuz value greater than the range
        short shortValue = 32000;
        int intValue = 2123543122;
        long longValue = 345345464545645L; //add L or l at the end to indicate it is long and not int
        //****DECIMAL NUMBERS/FLOATING POINT TYPES****
        float floatValue = 2345.55F; //add F or f at the end
        double doubleValue = 3834534.342; //adding D or d at end is optional (usually don't put it)
        //****CHARACTER TYPE****
        char charValue = 'a';
        //*****BOOLEAN****
        boolean booleanValue = true;

        //PRINT VARIABLE VALUES
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);


    }
}
