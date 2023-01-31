package org.example.Lesson4;

public class Triangle {
    public static void main(String[] args) {
        double a;
        a = TriangleArea(10, 10, 5);
        System.out.println("Площадь треугольника = " + a);
    }

    public static double TriangleArea( int sideA, int sideB, int sideC ) {
        double pp = (sideA + sideB + sideC) / 2.0;
        double result = Math.sqrt(pp * (pp - sideA) * (pp - sideB) * (pp - sideC));
        return result;
    }
    
}