package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_1 {

    /*
1. Пусть дан произвольный список целых чисел, удалить из него четные числа
2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
   Collections.max()
   */

    //Метод генерирует случайное число
    protected static int numGenerate(){
        int num = (int) (Math.random() * 100);
        return num;
    }

    //Метод генерирует лист
    protected static ArrayList<Integer> listGenerate(int num){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++){
            list.add(numGenerate());
        }
        return (ArrayList<Integer>) list;
    }

    //Метод удаляет из листа четные числа
    protected static ArrayList<Integer> evenDelete(List<Integer> list){
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 != 0){
                newList.add(list.get(i));
            }
        }
        return (ArrayList<Integer>) newList;
    }

    //Метод печатает список
    protected static void printList(List<Integer> list) {
        for (int num : list){
            System.out.print(num + " ");
        }
    }

    //Метод выводит минимальное число в списке
    protected static void printMin(List<Integer> list){
        System.out.print("Миниальное число в списке: " + Collections.min(list));
    }

    //Метод выводит максимальное число в списке
    protected static void printMax(List<Integer> list){
        System.out.print("Максимальне число в списке: " + Collections.max(list));
    }

    //Метод выводит среднееарифметическое
    protected static void average(List<Integer> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
        }
        double average = sum / list.size();
        System.out.println("Среднее арифметическое = " + average);
        System.out.printf("Среднее арифметическое форматированное = %.2f %n", average);
    }

}


