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
public class SoPhuc {
    
    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public static SoPhuc Tong1(SoPhuc p1, SoPhuc p2){
        int a = p1.getX(), b = p1.getY();
        int c = p2.getX(), d = p2.getY();
        SoPhuc sum = new SoPhuc();
        sum.x = a*(a + c) - b*(b + d);
        sum.y = a*(b + d) + b*(a + c);
        return sum;
    }
    
    public static SoPhuc Tong2(SoPhuc p1, SoPhuc p2){
        int a = p1.getX(), b = p1.getY();
        int c = p2.getX(), d = p2.getY();
        SoPhuc sum = new SoPhuc();
        sum.x = (a + c) * (a + c) - (b + d) * (b + d);
        sum.y = 2*(a + c)*(b + d);
        return sum;
    }

    @Override
    public String toString() {
        return x + " + " + y + "i";
    }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            SoPhuc p1 = new SoPhuc();
            SoPhuc p2 = new SoPhuc();
            p1.x = sc.nextInt();
            p1.y = sc.nextInt();
            p2.x = sc.nextInt();
            p2.y = sc.nextInt();
            System.out.println(Tong1(p1, p2) + ", " + Tong2(p1, p2));
        }
    }
}

/*
3
1 2 3 4
2 3 4 5
1 -2 5 -6

-8 + 14i, -20 + 48i
-12 + 34i, -28 + 96i
-10 - 20i, -28 - 96i
*/
