package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println(1000 > 100);
        System.out.println(985.44 < 98547.8);
        System.out.println(6 >= 4);
        System.out.println(3 <= 3);
        System.out.println(-4 != 3);

        int a = 100;
        int b = 200;
        System.out.println(a == b);  //false
        System.out.println(a > b);   //false
        System.out.println(a < b);   //true
        System.out.println(a >= b);  //false
        System.out.println(a <= b);  //true
        System.out.println(a != b);  //true

        boolean result = 5 == 5;
        System.out.println("result = " + result);

        result = 33 > 44;
        System.out.println("result = " + result);

        result = 88 < 99;
        System.out.println("result = " + result);

        result  = 10 >= 10;
        System.out.println("result = " + result);

        result = 123 <= 1234;
        System.out.println("result = " + result);

        result = 2 != 2;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city =="Baku");

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);

        checkName = name != "Kuzzat";
        System.out.println("checkName = " + checkName);

        int age = 66;
        boolean seniorCitizen = age > 65;
        System.out.println("Is senior citizen? - " + seniorCitizen);
    }
}
