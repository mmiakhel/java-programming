package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letter = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        //print
        for(char eachLetter : letter) {
            System.out.print(eachLetter + " ");
        }

        String sentence = new String(letter);
        System.out.print("\nsentence: " + sentence + "\n");

        String item = "wooden spoon";
        item.toCharArray();
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());
            //index            0          1       2        3        4           5
        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        //bananas - apples - kiwi - etc (2 ways (store into string or print in one line))
        String fruitStr = ""; //storing into a string
        for(String each : fruits) {
            fruitStr += each + "-";
           System.out.print(each + "-"); //problem comes with last index(how to remove the - after strawberry
        }
        System.out.println("\nfruitStr = " + fruitStr);


        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("|", languages));
        String joinedLanguages = String.join(" <> " , languages);
        System.out.println(joinedLanguages);





    }

}
