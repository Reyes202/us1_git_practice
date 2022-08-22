package day38_encapsulation;

import day38_encapsulation.Street.TrafficLight;

public class Driver {
    public static void main(String[] args) {
        TrafficLight light1 = new TrafficLight("red") ;
        System.out.println(light1.getColoor() );
        light1.setColor("green") ;
        System.out.println(light1.getColoor() );
    }
}
