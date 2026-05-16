package org.example.polymorphism.ui_polymorphism;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(int w, int h){
        super.setTitle("First Frame");
        super.setSize(900, 300);
        super.setVisible(true);
        super.setSize(w,h);
    }
    MyFrame(){
        super.setTitle("First Frame");
        super.setSize(900, 300);
        super.setVisible(true);
    }
    @Override
    public void setSize(int width, int height){
        super.setSize(800, 700);
    }

    public static void main(String[] args) {
        MyFrame frame = new  MyFrame();
        MyFrame fr2 = new MyFrame(400, 300);
    }

}
