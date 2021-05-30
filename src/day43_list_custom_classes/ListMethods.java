package day43_list_custom_classes;
import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println(getDays().get(0)); //get the first index of the arrayList. can perform other methods this way
        System.out.println("getDays().size() = "+ getDays().size());
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");
        //System.out.println(dayNames);

        //removeIf method - java 8 -> accepts lambda - and easy to remove without oop
        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("dayNames after removeIf = " + dayNames);

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size = " + nums.size());
        System.out.println("num = " + nums);
        nums.removeIf(n -> n < 90); //remove nums less than 90
        System.out.println("nums = " + nums);

    }
    public static List<String> getDays() {
        //2 ways to do it:
        //shortcut like below
        //List<String> days = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday, Thursday, Friday, " +
               // "Saturday, Sunday"));

        //the long way
        List<String> days = new ArrayList<>();
        days.add("Monday"); days.add("Tuesday"); days.add("Wednesday"); days.add("Thursday");
        days.add("Friday"); days.add("Saturday"); days.add("Sunday");
        return days;
    }

    /**
     *getRandomList
     * param: int size
     * return List<Integer>
     *     generate random numbers (0-100) the count of size, and assign to List then return
     */

    public static List<Integer> getRandomList(int size) {
        Random random = new Random(); //create new Random object
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            //step to prevent duplicates if needed
//            int n = random.nextInt(101);
//            if(!list.contains(n)) {
//                nums.add(n);
//            }
            list.add(random.nextInt(101)); //generate random number with limit 0-100 and add to list
        }
        return list;

    }

}
