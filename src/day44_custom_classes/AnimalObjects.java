package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat(); //matches empty eat method
        animal.eat("grass"); //matches overloading eat method
        animal.speak();

        //create new Animal object-->cheetahObj
        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah"; //assign cheetah to type
        System.out.println(cheetahObj.type);
        cheetahObj.eat();
        cheetahObj.eat("meat");
        cheetahObj.speak();


    }
}
