package ru.gb.siyanov;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    List<T> fruitBox = new ArrayList<>();

    public void addingFruitToBox(T fruit){
        fruitBox.add(fruit);
    }

    public double getWeight(){
        double summ = 0.0F;
        for (int i = 0; i < fruitBox.size(); i++) {
            summ = fruitBox.get(i).getWeight() + summ;
        }
        return summ;
    }
    public boolean compare(Box <?> anyBox){


        return true;
    }
    public void PourFruitAnotherBox(){

    }
}
