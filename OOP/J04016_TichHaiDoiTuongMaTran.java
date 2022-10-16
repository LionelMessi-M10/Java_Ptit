/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
3 4 3
1 2 3 4
4 2 3 1
2 4 1 3
1 1 1
2 2 2
3 3 3
4 4 4
 * @author ADMIN
 */

class Matrix {

    private int n, m;
    private int[][] a = new int[1001][1001];

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        a = new int[n][m];
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix mt2){
        Matrix mtTich = new Matrix(n, mt2.m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mt2.m; j++) {
                mtTich.a[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    mtTich.a[i][j] += a[i][k] * mt2.a[k][j];
                }
            }
        }
        return mtTich;
    }

    @Override
    public String toString() {
        ArrayList<String> res = new ArrayList<>();
        for(int i = 0; i < n; ++i){
            String tmp = "";
            for(int j = 0; j < m; ++j){
                tmp += Integer.toString(a[i][j]);
                tmp += " ";
            }
            tmp = tmp.trim();
            res.add(tmp);
        }
        for(int i = 0; i < res.size(); ++i){
            System.out.println(res.get(i));
        }
        return "";
    }

}

public class J04016_TichHaiDoiTuongMaTran {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n, m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m, p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
