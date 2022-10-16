/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
2
MUL1320
Nhap mon da phuong tien
Bai tap lon + Van dap truc tuyen
BAS1203
Giai tich 1
Thi viet + Van dap truc tuyen
 */
public class J07058_DanhSachMonThi {

    static class MonThi {

        String ma, ten, hinThucThi;

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }

        public String getHinhThucThi() {
            return hinThucThi;
        }

        public MonThi(String ma, String ten, String hinThucThi) {
            this.ma = ma;
            this.ten = ten;
            this.hinThucThi = hinThucThi;
        }

        @Override
        public String toString() {
            return this.ma + " " + this.ten + " " + this.hinThucThi;
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("MONHOC.in"));
        
        ArrayList<MonThi> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= n; ++i){
            while(sc.hasNext()){
                String m = sc.nextLine();
                String t = sc.nextLine();
                String ht = sc.nextLine();
                
                MonThi tmp = new MonThi(m, t, ht);
                arr.add(tmp);
            }
        }

        Collections.sort(arr, new Comparator<MonThi>() {
            @Override
            public int compare(MonThi o1, MonThi o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });

        for (MonThi it : arr) {
            System.out.println(it);
        }
    }
}
