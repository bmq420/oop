package com.lab8.exercise1;
import java.util.*;

//Exercise 1: Exercise on Lists
public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        if (list.contains(666)) {
            list.remove(list.indexOf(666));
        }
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            result.add(i * i);
        }
        return result;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        if (target == null) {
            return;
        }

        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 666, 5));
        insertFirst(list, 10);
        System.out.print("Insert first: ");
        print(list);

        insertLast(list, 20);
        System.out.print("\nInsert last: ");
        print(list);

        replace(list, 666);
        System.out.print("\nReplace value: ");
        print(list);

        removeThird(list);
        System.out.print("\nRemove third: ");
        print(list);

        removeEvil(list);
        System.out.print("\nRemove evil: ");
        print(list);

        System.out.print("\nGenerate square: ");
        print(generateSquare());

        System.out.print("\nContains: " + contains(list, 666));

        ArrayList<Integer> list2 = new ArrayList<>();
        copy(list, list2);
        System.out.print("\nCopy list: ");
        print(list2);

        reverse(list2);
        System.out.print("\nReverse using library: ");
        print(list2);

        reverseManual(list);
        System.out.print("\nReverse manual: ");
        print(list);

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        insertBeginningEnd(linkedList, 10);
        System.out.print("\nInsert beginning and end: ");
        print(linkedList);
    }

    public static void print(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
