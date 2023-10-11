package org.example.controller;
import org.example.data.*;
import java.util.ArrayList;
import java.util.List;

public class Controller<D extends Drink>{
    private List<D> list = new ArrayList<>();
    public void createCofe(String name, int volume, int temp){
        Cofe cofe = new Cofe(name, volume, temp);
        addDrink((D) cofe);
    }
    public void createTie(String name, int volume, int temp){
        Tie tie = new Tie(name, volume, temp);
        addDrink((D) tie);
    }
    public void addDrink(D drink){
        list.add(drink);
    }
    public void removeDrink(int id){
        int index = 0;
        boolean check = true;
        for(D d: list){
            if(d.getId()==id){
                list.remove(get(index));
                check = false;
                break;
            }
            index++;
        }
        if(check)System.out.println("id не найден.");
    }
    public List<D> findDrink(String type){
        List<D> findList = new ArrayList<>();
        for(D d: list){
            if(d.getTypeDrink().equalsIgnoreCase(type)) findList.add(d);
        }
        if(findList.size()!=0) {
            System.out.println("Найдено - " + findList.size());
            return findList;
        }else {
            System.out.println("не найдено.");
            return null;
        }
    }
    public List<D> findDrink(String type, int volume, int temp){
        List<D> findList = new ArrayList<>();
        for(D d: list){
            if(d.getTypeDrink().equalsIgnoreCase(type) && d.getVolume()==volume && d.getTemp()==temp) findList.add(d);
        }
        if(findList.size()!=0) {
            System.out.println("Найдено - " + findList.size());
            return findList;
        }else {
            System.out.println("не найдено.");
            return null;
        }
    }
    public List<D> findDrink(int volume, int temp){
        List<D> findList = new ArrayList<>();
        for(D d: list){
            if(d.getVolume()==volume && d.getTemp()==temp) findList.add(d);
        }
        if(findList.size()!=0) {
            System.out.println("Найдено - " + findList.size());
            return findList;
        } else {
            System.out.println("не найдено.");
            return null;
        }
    }

    public D get(int index){
        return list.get(index);
    }

    @Override
    public String toString() {
        return  "\n" + list;
    }
}
