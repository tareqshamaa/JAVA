package com.company;

public class Dog extends Animal {

    private String bread;
    private String name;

    public Dog(int a, boolean isD)
        {
            super(a,isD);
        }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void Birthday(){
        age+=1;
    }
@Override
    public void move(){
        System.out.println("Dog runs");
}
}

