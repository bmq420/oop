package com.lab8.exercise2;
import java.util.*;

//Exercise 2: Exercise on Sets
public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<Integer>();
        for (int i : first) {
            for (int j : second) {
                if (i == j) {
                    result.add(j);
                }
            }
        }
        return result;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for (int i : first) {
            result.add(i);
        }
        for (int j : second) {
            result.add(j);
        }
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = first;
        result.retainAll(second);
        return result;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = first;
        result.addAll(second);
        return result;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> result = new ArrayList<>();
        result.addAll(source);
        return result;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        List<Integer> listWithDup = source;
        List<Integer> listWithoutDup = new ArrayList<>(new LinkedHashSet<>(listWithDup));
        return listWithoutDup;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> result = new ArrayList<>();
        for (int i : source) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static String firstRecurringCharacter(String s) {
        ArrayList<Character> check = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!check.contains(s.charAt(i))) {
                check.add(s.charAt(i));
            } else {
                return String.valueOf(s.charAt(i));
            }
        }
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> result = new HashSet<>();
        ArrayList<Character> check = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!check.contains(s.charAt(i))) {
                check.add(s.charAt(i));
            } else {
                result.add(s.charAt(i));
            }
        }
        return result;
    }

    public static Integer[] toArray(Set<Integer> source) {
        int arrayLength = source.size();
        Integer[] array = new Integer[arrayLength];
        int index = 0;
        for (int i : source) {
            array[index++] = i;
        }
        return array;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.ceiling(value);
    }

    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>(Arrays.asList(1, 2, 9, 4, 4, 4, 5));
        Set<Integer> second = new HashSet<>(Arrays.asList(1, 2, 3, 9, 10));
        System.out.print("Intersection manual: " + intersectionManual(first, second));
        System.out.print("\nUnion manual: " + unionManual(first, second));
        System.out.print("\nIntersection using function: " + intersection(first, second));
        System.out.print("\nUnion using function: " + union(first, second));

        List<Integer> list = toList(first);
        System.out.print("\nTo list: ");
        print(list);

        List<Integer> list2 = removeDuplicates(list);
        System.out.print("\nRemove duplicates: ");
        print(list2);

        List<Integer> list3 = removeDuplicatesManual(list);
        System.out.print("\nRemove duplicates manual: ");
        print(list3);

        System.out.print("\nFirst recurring character: " + firstRecurringCharacter("abaco"));

        System.out.println("\nAll recurring character: " + allRecurringChars("mamma"));
    }

    public static void print(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
