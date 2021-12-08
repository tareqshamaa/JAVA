package com.company;

public class RunApp {

    public static void main(String[] args) {

        Dog bobby = new Dog( 5,true);
        bobby.setName("bobby");
        bobby.Birthday();
        System.out.println(bobby.getName()+bobby.getAge());
        bobby.move();

        Brid b1 = new Brid();
        b1.setBread("Robbin");
        b1.setAge(2);
        b1.setDomestic(false);

        b1.move();
    }
}
