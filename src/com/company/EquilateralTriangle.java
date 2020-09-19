package com.company;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        super(x1, y1, x2, y2, x3, y3);

    }

    public boolean check_equilateralism() {
        return (find_first_side() == find_second_side()) && (find_first_side() == find_third_side()) && (find_second_side() == find_third_side());
    }

}
