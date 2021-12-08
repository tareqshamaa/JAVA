package com.company;

import javax.swing.*;

public class Brid extends Animal {
    public Brid() {
    }

    @Override
    public void move() {
        JOptionPane.showMessageDialog(null,"Brid Flies");
    }
}
