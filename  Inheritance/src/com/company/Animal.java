package com.company;

public class Animal {
    //private int age;
    protected int age;
    protected boolean isDomestic = false;
    protected String bread;

    public Animal(){}

    public Animal (int a , boolean isD){
        this.age = a;
        this.isDomestic = isD;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
    public void move(){
        System.out.println("Animal moves");
    }
}
