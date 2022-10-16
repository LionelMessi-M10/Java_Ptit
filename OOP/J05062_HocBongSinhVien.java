/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
3 2
Nguyen Van Nam
3.59 75
Tran Hong Ngoc
3.61 90
Do Van An
3.22 90
 * @author ADMIN
 */

class SinhVien{
    private String ten;
    private float TBC, RL;

    public SinhVien(String ten, float TBC, float RL) {
        this.ten = ten;
        this.TBC = TBC;
        this.RL = RL;
    }

    public float getRL() {
        return RL;
    }

    public String getTen() {
        return ten;
    }

    public float getTBC() {
        return TBC;
    }

    public String Xep_hang() {
        if (TBC >= 3.6 && RL >= 90) {
            return "XUATSAC";
        }
        if (TBC >= 3.2 && RL >= 80) {
            return "GIOI";
        }
        if (TBC >= 2.5 && RL >= 70) {
            return "KHA";
        }
        return "KHONG";
    }
}

public class J05062_HocBongSinhVien {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<SinhVien> list = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String name = sc.nextLine();
            float gpa = sc.nextFloat();
            float rl = sc.nextFloat();
            
            SinhVien tmp = new SinhVien(name, gpa, rl);
            list.add(tmp);
        }
        
        ArrayList<Float> diemTB = new ArrayList<>();
        
        for(SinhVien it : list){
            diemTB.add(it.getTBC());
        }
        
        Collections.sort(diemTB, Collections.reverseOrder());
        
        float check = 0;
        int count = 0;
        
        for(float x : diemTB){
            ++count;
            if(count == m){
                check = x;
            }
        }
        
        for(SinhVien it : list){
            if(it.getTBC() >= check){
                System.out.println(it.getTen() + ": " + it.Xep_hang());
            }
            else{
                System.out.println(it.getTen() + ": KHONG");
            }
        }
    }
}
