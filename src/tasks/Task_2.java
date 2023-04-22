package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task_2 {
/*
3. Заполнить список названиями планет Солнечной системы
в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
  */

    //Метод генерирует список планет
    protected static List<String> planetsList(){
        List<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Pluto");
        return planets;
    }

    //Метод печатает список планет
    protected static void planetsPrint (ArrayList<String> list){
        for (String str : list){
            System.out.print(str + ", ");
        }
    }

    //Метод генерирует случайную длину списка
    protected static int numGenlist(){
        Random random = new Random();
        int num = random.nextInt(9, 50);
        return num;
    }

    //Метод генерирует случайное число - номер планеты
    protected static int numGen(){
        Random random = new Random();
        int num = random.nextInt(0, 9);
        return num;
    }

    protected static List<String> newPlanetsList(ArrayList<String> list, int num){
        List<String> newListPlanets = new ArrayList<>();
        for (int i = 0; i < num; i++){
            newListPlanets.add(list.get(numGen()));
        }
        return newListPlanets;
    }

    protected static void planetsCounter(ArrayList<String> list, ArrayList<String> newList){

        for (int j = 0; j < list.size(); j++) {
            int s = 0;
            for (int i = 0; i < newList.size(); i++) {
                if (list.get(j).equals(newList.get(i))){
                    s++;
                }
            }
            System.out.println(list.get(j) + " = " + s);
        }
    }

    protected static void planetsPrintSort (ArrayList<String> list){
        Collections.sort(list);
        for (String str : list){
            System.out.print(str + ", ");
        }
    }



}
