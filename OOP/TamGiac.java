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
public class TamGiac {
    
    private double x, y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public static double distance(TamGiac a, TamGiac b){
        double k1 = 1f * (a.getX() - b.getX()) * (a.getX() - b.getX());
        double k2 = 1f * (a.getY() - b.getY()) * (a.getY() - b.getY());
        return Math.sqrt(k1 + k2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            TamGiac p1 = new TamGiac();
            TamGiac p2 = new TamGiac();
            TamGiac p3 = new TamGiac();
            p1.x = sc.nextDouble(); p1.y = sc.nextDouble();
            p2.x = sc.nextDouble(); p2.y = sc.nextDouble();
            p3.x = sc.nextDouble(); p3.y = sc.nextDouble();
            double c1 = distance(p1, p2);
            double c2 = distance(p2, p3);
            double c3 = distance(p1, p3);
            double chuVi = distance(p1, p2) + distance(p2, p3) + distance(p1, p3);
            if(c1 <= 0 || c2 <= 0 || c3 <= 0 || (c1 + c2) <= c3 || (c1 + c3) <= c2 || (c2 + c3) <= c1){
                System.out.println("INVALID");
            }
            else System.out.printf("%.3f\n", chuVi);
        }
    }
}
