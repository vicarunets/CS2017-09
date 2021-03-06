package by.it.sc04_evening_tue_thu.rumiantsau.lesson07;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception
    { Scanner sc = new Scanner(System.in);

        ArrayList<Integer> mainList = new ArrayList<Integer>();
        ArrayList<Integer> listMod2 = new ArrayList<Integer>();
        ArrayList<Integer> listMod3 = new ArrayList<Integer>();
        ArrayList<Integer> listRest = new ArrayList<Integer>();

        for (int i = 1; i <= 20; i++){
            mainList.add(sc.nextInt());
        }

        boolean isAdded;

        for (Integer value : mainList){
            isAdded = false;

            if (value % 2 == 0) {
                isAdded = true;
                listMod2.add(value);
            }
            if (value % 3 == 0) {
                isAdded = true;
                listMod3.add(value);
            }
            if (!isAdded) {
                listRest.add(value);
            }
        }

        printList(listMod3);
        printList(listMod2);
        printList(listRest);
    }


    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }

}
