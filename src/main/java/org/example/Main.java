package org.example;
import org.example.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        view.loadDrings();
        System.out.println();
        view.printInfo();
        view.findDrink("кофе");
        view.findDrink(300, 80);
        view.findDrink("чай", 200, 70);
        view.removeDrink(5);
        view.removeDrink(10);
        view.removeDrink(17);
        System.out.println();
        view.printInfo();

    }
}