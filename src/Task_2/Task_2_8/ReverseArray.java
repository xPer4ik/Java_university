package Task_2.Task_2_8;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {

    public static void reversing(ArrayList<String>list){ // метод меняет элементы списка в обратном порядке
        String w;
            int listSize = list.size();
            for(int i=0; i < listSize/2;i++){
                w = list.get(i);
                list.set(i,list.get(listSize-i-1));
                list.set(listSize-i-1,w);
            }

    }
    public static void main(String [] args){  // основания функция
        ArrayList<String>list = new ArrayList<>();
        System.out.println("Введите количество чисел:");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int count = scanner.nextInt();
        for(int i = 0; i < count; i++){ // добавление элементов  массов
            list.add(scanner2.nextLine());
        }
        reversing(list); // вызов метода
        System.out.println(list); // вывод массива



    }
}
