package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,black cat, red car";
        for(int i = 0; i < list.length() - 2; i++){
            System.out.println(list.substring(i, i+3));
            if (list.substring(i, i+3).equals("cat") || list.substring(i, i+3).equals("car")) {
                System.out.println("Cat or car found");
            }
        }

        for(int i = 0; i < list.length() - 2; i++){
            String part = (list.substring(i, i+3));
            System.out.println("part = " + part);
            if (part.equals("car") || part.equals("cat")) {
                System.out.println("Cat or car found");
            }
        }




        //using substring print first 3 letters
//        int i = 0;
//        System.out.println(list.substring(i, i+3));
//        i++;
//        System.out.println(list.substring(i, i+3));
//        i++;
//        System.out.println(list.substring(i, i+3));
//        i++;
//        System.out.println(list.substring(i, i+3));
//        i++;
//        System.out.println(list.substring(i, i+3));
//        i++;
//        System.out.println(list.substring(i, i+3));
//        i++;
//        System.out.println(list.substring(i, i+3));
//        i++;
//        System.out.println(list.substring(i, i+3));
//        System.out.println(list.substring(3, 6));
//        System.out.println(list.substring(4, 7));
//        System.out.println(list.substring(5, 8));
//        System.out.println(list.substring(6, 9));
    }
}
