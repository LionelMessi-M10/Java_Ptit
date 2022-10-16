/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Point {

    public static Double distance(Point p, Point p1) {
        Double k1 = 1f * (p1.getX() - p.getX()) * (p1.getX() - p.getX());
        Double k2 = 1f * (p1.getY() - p.getY()) * (p1.getY() - p.getY());
        return 1f * Math.sqrt(k1 + k2);
    }

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private Point() {

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point p = new Point();
            Point p1 = new Point();
            p.x = sc.nextDouble();
            p.y = sc.nextDouble();
            p1.x = sc.nextDouble();
            p1.y = sc.nextDouble();
            System.out.printf("%.4f\n", distance(p, p1));
        }
    }

}
