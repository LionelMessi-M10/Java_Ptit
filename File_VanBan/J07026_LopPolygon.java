/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07026_LopPolygon {
    
    static class Point{
        private double a, b;

        public Point(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }
    }
    
    static class Polygon{
        private Point[] a;

        public Polygon(Point[] a) {
            this.a = a;
        }
        
        public String getArea(){
            int n = this.a.length;
            double sum = 0;
            --n;
            for(int i = 0; i < n; ++i){
                sum += (a[i].getA() * a[i+1].getB() - a[i].getB() * a[i+1].getA());
            }
            
            sum += (a[n].getA() * a[0].getB() - a[n].getB() * a[0].getA());
            
            return String.format("%.3f", sum / 2);
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("POLYGON.in"));
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            Point p[] = new Point[n];
            for(int i = 0; i < n; i++){
                p[i] = new Point(in.nextInt(),in.nextInt());
            }
            Polygon poly = new Polygon(p);
            System.out.println(poly.getArea());
        }
    }
}
