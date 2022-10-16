/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;

/**
3
0 0 0 5 0 199
1 1 1 1 1 1
0 0 0 5 5 0
 * @author ADMIN
 */

class Point{
    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextFloat(), sc.nextFloat());
    }
    
    public float distance(Point o){
        return (float) Math.sqrt((x - o.x) * (x - o.x) + (y - o.y) * (y - o.y));
    }
}

class Triangle{
    private float ab, bc, ca;

    public Triangle(Point a, Point b, Point c) {
        this.ab = a.distance(b);
        this.bc = b.distance(c);
        this.ca = c.distance(a);
    }

    public boolean valid() {
        if(ab + bc > ca && ab + ca > bc && bc + ca > ab)
            return true;
        return false;
    }

    public String getPerimeter() {
        return String.format("%.3f", ab + bc + ca);
    }
}

public class J04019_LopTriangle_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if (!a.valid()) {
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
        }
    }
}
