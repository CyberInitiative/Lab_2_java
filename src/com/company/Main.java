package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Triangle> triangles = new ArrayList<>();
        ArrayList<Equilateral_triangle> equilateral_triangles = new ArrayList<>();

        triangles.add(new Triangle(4, 4, 4, 4, -5, 0)); //not exist
        triangles.add(new Triangle(0, 5, 4, 0, -5, 0));
        triangles.add(new Triangle(0, 5, 0, 0, -2, 0));
        triangles.add(new Triangle(0, 5, 4, 0, -5, 0));
        triangles.add(new Triangle(0, 2, 4, 0, 0, -3));
        triangles.add(new Triangle(1, 1, 4, 4, 0, 0)); //not exist
        triangles.add(new Triangle(0, 5, 4, 0, -5, 0));

        triangles.removeIf(triangle -> !triangle.check_existence());
        System.out.println("The list of triangles: ");
        System.out.println(triangles);
        for (int i = 0; i < triangles.size(); i++) {
            Triangle currentTriangle = triangles.get(i);
            for (int j = i + 1; j < triangles.size(); j++) {
                if (currentTriangle.equals(triangles.get(j))) {
                    System.out.println("Triangle " + (i + 1) + " equals to triangle " + (j + 1));
                } //Отсчет идет на человеческий, то есть треугольник [0] для нас первый.
            }
        }

        equilateral_triangles.add(new Equilateral_triangle(-2, 3, 2, -3, -5.19615, -3.4641));
        equilateral_triangles.add(new Equilateral_triangle(-6, 0, 0, 0, -3, -5.19615));
        equilateral_triangles.add(new Equilateral_triangle(7, 4, 8, 0, 6, 0));

        equilateral_triangles.removeIf(equilateral_triangle -> !equilateral_triangle.check_existence());
        equilateral_triangles.removeIf(equilateral_triangle -> !equilateral_triangle.check_equilateralism());

        System.out.println("The list of equilateral triangles: ");

        System.out.println(equilateral_triangles);
        Equilateral_triangle equilateral_triangle = Collections.min(equilateral_triangles, Comparator.comparing(s -> s.find_median()));
        System.out.println("The lowest value among medians: " + equilateral_triangle.find_median());
    }
}