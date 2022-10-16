/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Basic;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class HinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f, g, h;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();
        
        int x, y, z, t;
        
        if(a < e) x = a;
        else x = e;
        
        if(b < f) y = b;
        else y = f;
        
        if (c < g) z = g;
        else z = c;
        
        if (d < h) t = h;
	else t = d;
        
        int u;
	if (z - x > t - y) u = z - x;
	else u = t - y;
        
        System.out.println(u * u);
    }
}
