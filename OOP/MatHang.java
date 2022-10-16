/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MatHang {
    
    private String ma, ten, donVi;
    private int giaMua, giaBan, loiNhuan;

    public MatHang() {
        this.ma = "";
    }

    public String getMa() {
        return ma;
    }

    public int getLoiNhuan() {
        this.loiNhuan = this.giaBan - this.giaMua;
        return loiNhuan;
    }

    public String getTen() {
        return ten;
    }

    public String getDonVi() {
        return donVi;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; ++i){
            MatHang tmp = new MatHang();
            sc.nextLine();
            if((i + 1) < 10) tmp.ma += "MH00" + (char)((i + 1) + '0');
            else if((i + 1) >= 10 && (i + 1) <= 40){
                int x = (i + 1);
                while(x != 0){
                    tmp.ma = (char)((x) % 10 + '0') + tmp.ma;
                    x /= 10;
                }
                tmp.ma = "MH0" + tmp.ma;
            }
            tmp.ten = sc.nextLine();
            tmp.donVi = sc.nextLine();
            tmp.giaMua = sc.nextInt();
            tmp.giaBan = sc.nextInt();
            arr.add(tmp);
        }
        Collections.sort(arr, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if(o1.getLoiNhuan() != o2.getLoiNhuan()){
                    return o2.getLoiNhuan() - o1.getLoiNhuan();
                }
                String x = o1.getMa();
                String y = o2.getMa();
                int k1 = 0, k2 = 0;
                for(int i = 2; i < x.length(); ++i) k1 = k1 * 10 + (x.charAt(i) - '0');
                for(int i = 2; i < y.length(); ++i) k2 = k2 * 10 + (y.charAt(i) - '0');
                return k1 - k2;
            }
        });
        for(MatHang it : arr){
            System.out.println(it.getMa() + " " + it.getTen() + " " + it.getDonVi() + " " + it.getGiaMua() + " " 
                                                                                          + it.getGiaBan() + " " + it.getLoiNhuan());
        }
    }
}
