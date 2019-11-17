package com.java.awt.examples;
import java.awt.*;
public class TestGridLayout {
  public static void main(String[] args){
    Frame f = new Frame("TestGridLayout");
    f.setSize(200,200);
    f.setLayout(new GridLayout(2,3));
    f.add(new Button("Button 1"));
    f.add(new Button("Button 2"));
    f.add(new Button("Button 3"));
    f.add(new Button("Button 4"));
    f.add(new Button("Button 5"));

    f.setVisible(true);
  }
}