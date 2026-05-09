package org.example.constructor;

public class AppTest {
    public static void main(String[] args) {
        App appObj = new App();
        System.out.println(appObj.x);
        App appObj1 = new App(30);
        System.out.println(appObj1.x);

    }
}
