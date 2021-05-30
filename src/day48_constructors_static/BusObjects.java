package day48_constructors_static;


public class BusObjects {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new Driver("Abbas");
        bus.engine = new Engine();
        System.out.println(bus.toString());

        Bus metroBus = new Bus();
        metroBus.driver = new Driver("Aziz");
        metroBus.engine = new Engine();
        System.out.println(metroBus);

        //print Driver name of metroBus
        System.out.println(metroBus.driver.getName());

    }
}
