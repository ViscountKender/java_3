package ru.gb.siyanov;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        String[] arr = {"aaa", "bbb", "ccc"};
        ArrayChanges <String> newArr = new ArrayChanges<>();
        System.out.println(newArr.convertingToArrayList(arr));
        newArr.elementReplacement(arr, 1, 2);
        //Задание 3.
        // вес фруктов
        final double orangeWeight = 1.5f;
        final double appleWeight = 1.0f;
        //Создаём две коробки с указанием типов помещаемых туда фруктов
        Box <Orange> orangeBox1 = new Box<>();
        Box <Apple> appleBox1 = new Box<>();
        //Заполняем коробки фруктами (в каждой коробке будет по 3 фрукта)
        //Причем нельзя положить яблоко в коробку для апельсинов
        for (int i = 0; i < 3 ; i++) {
            orangeBox1.addingFruitToBox(new Orange(orangeWeight));
            appleBox1.addingFruitToBox(new Apple(appleWeight));
        }
        //Считаем вес коробки
        System.out.println(orangeBox1.getWeight());
        System.out.println(appleBox1.getWeight());
        //Сравниваем 2 коробки
        System.out.println(orangeBox1.compare(appleBox1));


    }
}
