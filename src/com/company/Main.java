package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int number = 0;
        ArrayList<String> wordsA = new ArrayList<>(5);
        while (number != 5) {
            Scanner scanner = new Scanner(System.in);
            wordsA.add(scanner.nextLine());
            number += 1;
        }
        Iterator it = wordsA.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("------------");





        ArrayList<String> wordsB = new ArrayList(5);
        number = 0;
        while (number != 5) {
            Scanner scanner = new Scanner(System.in);
            wordsB.add(scanner.nextLine());
            number += 1;
        }
        System.out.println("-------------");
        it = wordsB.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
       Collections.reverse(wordsB);



        ArrayList<String> wordsC = new ArrayList<>();
        Iterator iteratorA = wordsA.iterator();
        Iterator iteratorB = wordsB.iterator();
        while(iteratorA.hasNext() || iteratorB.hasNext()){
            wordsC.add((String) iteratorA.next());
            wordsC.add((String) iteratorB.next());
        }

        it = wordsC.iterator();
        System.out.println("------List C------");
        while (it.hasNext()){
            System.out.println(it.next());
        }





        sortStringListByLength(wordsC);

    }
    private static void sortStringListByLength(ArrayList<String> list) {
        System.out.println("-- sorting list by length --");
        Collections.sort(list, Comparator.comparing(String::length));
        list.forEach(System.out::println);
    }
}
