package OfficeHours.Practice_03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {

        byte b = 10;
        short s = b;
        byte b2 = (byte) s; //short does not fit into byte directly so have to do it like this

        double d = 5.3;
        int i = (short)d; //short fits into int so that is why it will work

        float f = 3.54f;

    }
}
