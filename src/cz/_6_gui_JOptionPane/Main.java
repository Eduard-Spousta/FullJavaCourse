package cz._6_gui_JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        //basic pannel to input
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        //show input dialog works for string -> to store to int it is necessary to convert it from String to int
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");


    }
}
