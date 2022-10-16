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
public class DienTichHinhTronNgoaiTiep {
    
    private double x, y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public static double distance(DienTichHinhTronNgoaiTiep a, DienTichHinhTronNgoaiTiep b){
        double k1 = 1f * (a.getX() - b.getX()) * (a.getX() - b.getX());
        double k2 = 1f * (a.getY() - b.getY()) * (a.getY() - b.getY());
        return Math.sqrt(k1 + k2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            DienTichHinhTronNgoaiTiep p1 = new DienTichHinhTronNgoaiTiep();
            DienTichHinhTronNgoaiTiep p2 = new DienTichHinhTronNgoaiTiep();
            DienTichHinhTronNgoaiTiep p3 = new DienTichHinhTronNgoaiTiep();
            p1.x = sc.nextDouble(); p1.y = sc.nextDouble();
            p2.x = sc.nextDouble(); p2.y = sc.nextDouble();
            p3.x = sc.nextDouble(); p3.y = sc.nextDouble();
            double a = distance(p1, p2);
            double b = distance(p2, p3);
            double c = distance(p1, p3);
            if(a <= 0 || b <= 0 || c <= 0 || (a + b) <= c || (a + c) <= b || (b + c) <= a){
                System.out.println("INVALID");
            }
            else
                System.out.printf("%.3f\n", Math.PI * (1f * a * b * c)
                        /(Math.sqrt(1f * (a + b + c) * (a + b - c) * (b + c - a) * (c + a - b))) * (1f * a * b * c)
                        /(Math.sqrt(1f * (a + b + c) * (a + b - c) * (b + c - a) * (c + a - b))));
        }
    }
}
