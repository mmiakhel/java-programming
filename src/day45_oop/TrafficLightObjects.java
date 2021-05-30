package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red"; -->NOT THIS way today
        //we will assign/update the value of color using a method of the class
        trafficLight.changeColor("red");
        //System.out.println(trafficLight.color); DIRECT access to variable. NOT RECOMMENDED
        //call method to access the variable:
        trafficLight.showColor();

        //change color to green and display it
        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("brown");
        trafficLight2.showColor();
    }
}
