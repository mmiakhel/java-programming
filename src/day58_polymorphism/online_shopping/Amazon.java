package day58_polymorphism.online_shopping;

public class Amazon extends OnlineShopping implements Prime{

    @Override
    public void buy() {
        System.out.println("Buying items on amazon.com");
    }

    @Override
    public void sell() {
        System.out.println("Selling items on amazon.com");
    }

    @Override
    public void primeShipping() {
        System.out.println("Free 2 Day shipping for prime members");
    }
}
