package Zadanie_Funkcja.Generyki;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  /*  public static <E> void printArray(E[] inArray) {
        for (E value : inArray) {
            System.out.println(value);
        }
    }

    public static <E> void printList(List<E> myList) {
        for (E value : myList) {
            System.out.println(value);
        }
    }

    public static <E> void printDoubleList(List<E> yourList) {
        for (E value : yourList) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        //Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doublesArray = {1.2, 3.4, 5.6, 45.4, 33.3};
        Character[] charArray = {'d', 'e', 'w', 'r'};
//Wywołanie zbioru


        List<Integer> intList = new ArrayList<Integer>();
        //intList.add(3);
        //intList.add(21);
        // intList.add(34);


        List<String> stringList = new ArrayList<String>();
        stringList.add("kloko");
        stringList.add("ewrewrw");
        stringList.add("wewe");

        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(343.3434);
        doubleList.add(3.3434);
        doubleList.add(33.34);
        int liczba = 3;
        for(int i = 0; i<=liczba; i++){
            int q;

            System.out.println("Podaj element: " + i);
            Scanner in = new Scanner(System.in);
            q = in.nextInt();
            intList.add(q);
        }
        printDoubleList(intList);
        printArray(intArray);
        //ywołanie listy
        printList(stringList);
        printDoubleList(doubleList);
        printArray(intArray);
        printArray(doublesArray);
        printArray(charArray);  */


    Box b1 = new Box();

    b1.setT(new Integer(10));

    b1.setT(new String("TEST"));

}
