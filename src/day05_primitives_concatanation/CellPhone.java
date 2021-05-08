package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args) {
        String brand = ("Samsung");
        String model = ("Galaxy s10+");
        String color = ("Silver");
        double price = 999.99;
        int storage = 64;
        boolean hasCamera = true;

       System.out.print(brand);
       System.out.println(model);
       //WITH MESSAGE
       System.out.println("Brand is " + brand);
       System.out.println("Model is " + model);
       System.out.println("Color is " + color);
       System.out.println("Price is $" + price);
       System.out.println("Storage is " + storage + "GB");
       System.out.println("Has camera? - " + hasCamera);
    }
}
