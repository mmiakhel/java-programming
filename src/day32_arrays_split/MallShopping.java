package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,    150.0,   9.99,     250.0 ,    439.50, 39.99};
        int[] itemIDs =   {12345 ,   12346,   12347,    12348,     12349,  12350};

        System.out.println("--------FIND THE INDEX OF 'GLOVES' in items array--------");
        //int index = 0;
        for(int i = 0; i < items.length; i++) {
             if(items[i].equals("Gloves")) {
                 System.out.println("Index of Gloves is: " + i);
                // index = i;
                 break;
             }
        }
       // System.out.println("Index of Gloves is: " + index);


        System.out.println("\n----------Set boolean to true if item is found----------");
        boolean ipadExists = false;
        for(int i = 0; i < items.length; i++) {  //looking for index so use for loop
            if(items[i].equalsIgnoreCase("iPad")) {
                ipadExists = true;
                break;
            }
        }
        System.out.println("iPadExists = " + ipadExists);

        //or
        for(String item : items) { //not looking for index so can use for each loop
            if(item.equalsIgnoreCase("iPade")) {
                ipadExists = true;
            }
        }
        System.out.println("iPadExists = " + ipadExists);
        if(ipadExists) {
            System.out.println("We bought the iPad!!!");
        }  else {
            System.out.println("We forgot the iPad!");
        }

        System.out.println("\n----------PRINT A REPORT OF EACH SHOPPING ITEM----------");
        /** //pseudocode
         * shoes - $99.99 - #12345
         * etc
         */

        for(int i = 0; i < items.length; i++) {
            System.out.println(items[i] + "\t - \t$" + prices[i] + "\t - \t#" + itemIDs[i]);

        }

        System.out.println("\n----------LOOK FOR 'JACKET' IN ITEMS AND PRINT ALL DETAILS----------");
        for(int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("jacket")) {
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break;
            }
        }




    }
}
