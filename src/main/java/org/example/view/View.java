package org.example.view;
import org.example.controller.Controller;
import org.example.data.Cofe;


public class View {
    private Controller contr = new Controller();
    public void loadDrings(){
        contr.createCofe("Капучино", 200, 70);
        contr.createCofe("Капучино", 300, 70);
        contr.createCofe("Капучино", 500, 70);
        contr.createTie("Черный", 200, 70);
        contr.createTie("Черный", 300, 70);
        contr.createTie("Черный", 500, 70);
        contr.createCofe("Латте", 200, 80);
        contr.createCofe("Латте", 300, 80);
        contr.createTie("Зеленый", 200, 60);
        contr.createCofe("Американо", 300, 70);
        contr.createCofe("Американо", 300, 80);
        contr.createCofe("Американо", 300, 90);
        contr.createTie("Малиновый", 300, 90);
        contr.createTie("Малиновый", 500, 90);
        contr.createCofe("Черный", 200, 80);
        contr.createTie("Белый слон", 500, 90);
        contr.createCofe("Эспрессо", 200, 70);
        contr.createCofe("Эспрессо", 200, 80);
        contr.createCofe("Эспрессо", 300, 90);
        contr.createTie("с бергамотом", 300, 80);
        System.out.println("|Напитки загружены|\n" + "-".repeat(30));
    }
    public void printInfo(){
        System.out.println("Напитки в наличии\n" + "-".repeat(30));
        System.out.println(contr);
    }
    public void findDrink(String txt){
        System.out.println(contr.findDrink(txt));
    }
    public void findDrink(String txt, int volume, int temp){
        System.out.println(contr.findDrink(txt, volume, temp));
    }
    public void findDrink(int volume, int temp){
        System.out.println(contr.findDrink(volume, temp));
    }
    public void removeDrink(int id){
        contr.removeDrink(id);
        System.out.println("Напиток с id " + id + " удален.");

    }

}
