/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;

/**
2
3
0 0
1 0
0 1
4
0 0
2 0
2 2
0 2
 * @author ADMIN
 */
public class J05008_DienTichDaGiac {
    static class ToaDo{
        private double a, b;

        public ToaDo() {
        }

        public ToaDo(double a, double b) {
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ToaDo[] a = new ToaDo[n];
            
            for(int i = 0; i < n; ++i){
                a[i] = new ToaDo(sc.nextDouble(), sc.nextDouble());
            }
            
            double sum = 0;
            --n;
            for(int i = 0; i < n; ++i){
                sum += (a[i].getA() * a[i+1].getB() - a[i].getB() * a[i+1].getA());
            }
            
            sum += (a[n].getA() * a[0].getB() - a[n].getB() * a[0].getA());
            
            System.out.printf("%.3f\n", sum / 2);
        }
    }
}
