package ru.mirea.practice.u23k1158;

import java.util.List;

public abstract class Test {
    public static void main(String[] args) {

        String[] stringArray = {"Я", "люблю", "есть"};
        List<String> stringList = ArrayToListConverter.convertArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        String element = ArrayElementRetriever.getElementAtIndex(stringArray, 1); // получаем 'banana'
        System.out.println("Элемент по индексу 1: " + element);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = ArrayToListConverter.convertArrayToList(intArray);
        System.out.println("Список чисел: " + intList);

        Integer num = ArrayElementRetriever.getElementAtIndex(intArray, 3); // получаем '4'
        System.out.println("Элемент по индексу 3: " + num);
    }
}
