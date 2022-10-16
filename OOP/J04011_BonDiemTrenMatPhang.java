/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;

/**
 * 3
 * 1 2 0
 * 2 3 0
 * 4 0 0
 * 0 0 0
 * 1 1 1
 * 2 2 2
 * 3 3 3
 * 4 4 4
 * 5 6 7
 * -8 -9 -10 12 19 0 3 1 5
 *
 * Lý thuyết:
 *
 * Bốn điểm A, B, C, D đồng phảng khi: các vector [AB, AC] . AD = 0 Cách tính:
 * Trong không gian Oxyz cho hai vecto a=(a1;a2;a3) và b=(b1;b2;b3). Tích có
 * hướng của hai vecto a và b, kí hiệu là [a, b], được xác định bởi: [a, b] =
 * (a2 * b3, a3 * b1 - a1 * b3, a1 * b2 - a2 * b1)
 *
 * @author ADMIN
 */
public class J04011_BonDiemTrenMatPhang {

    static class Point3D {

        private int x, y, z;

        public Point3D(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public static Point3D taoVecto(Point3D a, Point3D b) {
            return new Point3D(a.x - b.x, a.y - b.y, a.z - b.z);
        }

        public static Point3D tichCoHuong(Point3D a, Point3D b) {
            return new Point3D(b.z * a.y - b.y * a.z, a.z * b.x - a.x * b.z, a.x * b.y - b.x * a.y);
        }

        public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d) {
            Point3D v1 = taoVecto(b, a);
            Point3D v2 = taoVecto(c, a);
            Point3D v3 = taoVecto(d, a);
            Point3D t1 = tichCoHuong(v1, v2);
            if (t1.x * v3.x + t1.y * v3.y + t1.z * v3.z == 0) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if (Point3D.check(p1, p2, p3, p4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
