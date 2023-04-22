package tasks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Решение задания 1.
        System.out.println("Решение задания 1.");
        int number = Task_1.numGenerate();
        System.out.println("Сгененирована длина списка: " + number);
        System.out.print("Сгененирован список: ");
        List <Integer> list1 = Task_1.listGenerate(number);
        Task_1.printList(list1);
        System.out.println();
        System.out.print("Напечатан список, содержащий  нечетные числа : ");
        List <Integer> newList1 = Task_1.evenDelete(list1);
        Task_1.printList(newList1);
        System.out.println();
        System.out.println();

        //Решение задания 2.
        System.out.println("Решение задания 2.");
        int number_2 = Task_1.numGenerate();
        System.out.print("Сгененирован спискок: ");
        List<Integer> list_2 = Task_1.listGenerate(number_2);
        Task_1.printList(list_2);
        System.out.println();
        Task_1.printMin(list_2);
        System.out.println();
        Task_1.printMax(list_2);
        System.out.println();
        Task_1.average(list_2);
        System.out.println();

        //Решение задания 3.
        System.out.println("Решение задания 3.");
        List<String> planets = Task_2.planetsList();
        System.out.print("Планеты Солнечной системы по порядку: ");
        Task_2.planetsPrint((ArrayList<String>) planets);
        System.out.println();
        int listLen = Task_2.numGenlist();
        System.out.println("Сгенерированная длина нового списка: " + listLen);
        List<String> newList = Task_2.newPlanetsList((ArrayList<String>) planets,listLen);
        System.out.println("Новый список планет: ");
        Task_2.planetsPrint((ArrayList<String>) newList);
        System.out.println();
        System.out.println("Новый сортированный список планет для проверки: ");
        Task_2.planetsPrintSort((ArrayList<String>) newList);
        System.out.println();
        System.out.println("Количество повторений планет:");
        Task_2.planetsCounter((ArrayList<String>) planets, (ArrayList<String>)newList);
    }
}