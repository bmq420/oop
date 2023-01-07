package com.lab8.exercise4.part1;
import java.util.*;

//Exercise 4.1. Comparable
public class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    @Override
    public int compareTo(Movie movie) {
        if (this.year < movie.year) {
            return -1;
        } else if (this.year == movie.year) {
            return 0;
        } else {
            return 1;
        }
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}

class ComparableTest {
    public static void sortByYear(List<Movie> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) >= 1) {
                    Movie temp = list.get(j);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);
        System.out.println("Movies after sorting: ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " "
                    + movie.getRating() + " " +
                    movie.getYear());
        }
    }
}