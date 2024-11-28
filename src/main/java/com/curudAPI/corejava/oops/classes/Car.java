package org.example.corejava.oops.classes;

public class Car {
    private String model;
    private int year;
    public Car(){}
    public Car(String model,int year){
        this.model=model;
        this.year=year;

    }
    public void display(){
        System.out.println("Model:"+model+"And"+"Year:"+year);
    }

    public static void main(String[] args) {
        Car car=new Car("Tesla",2098);
        car.display();
    }
}
