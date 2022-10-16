/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */

class sinhVien{
    private String ma, ten, sdt, mail;

    public sinhVien(String ma, String ten, String sdt, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.mail = mail;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return ma + " " + ten;
    }
}

class deTai{
    private String ma, tenGV, tenDT;

    public deTai(String ma, String tenGV, String tenDT) {
        this.ma = ma;
        this.tenGV = tenGV;
        this.tenDT = tenDT;
    }

    public String getMa() {
        return ma;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getTenDT() {
        return tenDT;
    }

    @Override
    public String toString() {
        return tenDT + " " + tenGV;
    }
}

class nhiemVu{
    private String maSV, maDT, maHD;

    public nhiemVu(String maSV, String maDT, String maHD) {
        this.maSV = maSV;
        this.maDT = maDT;
        this.maHD = maHD;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getMaDT() {
        return maDT;
    }

    public String getMaHD() {
        return maHD;
    }
}

public class ThucTap1 {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DETAI.in"));
        Scanner sc3 = new Scanner(new File("HOIDONG.in"));
        
        ArrayList<sinhVien> list1 = new ArrayList<>();
        ArrayList<deTai> list2 = new ArrayList<>();
        ArrayList<nhiemVu> list3 = new ArrayList<>();
    
        int n = sc1.nextInt();
        sc1.nextLine();
        for(int i = 1; i <= n; ++i){
            String ma = sc1.nextLine();
            String ten = sc1.nextLine();
            String sdt = sc1.nextLine();
            String mail = sc1.nextLine();
            
            sinhVien tmp = new sinhVien(ma, ten, sdt, mail);
            list1.add(tmp);
        }
        
        int m = sc2.nextInt();
        sc2.nextLine();
        for(int i = 1; i <= m; ++i){
            String ma = String.format("DT%03d", i);
            String ten = sc2.nextLine();
            String dt = sc2.nextLine();
            
            deTai tmp = new deTai(ma, ten, dt);
            list2.add(tmp);
        }
        
        int k = sc3.nextInt();
        for(int i = 1; i <= k; ++i){
            String x = sc3.next();
            String y = sc3.next();
            String z = sc3.next();
            
            nhiemVu tmp = new nhiemVu(x.trim(), y.trim(), z.trim());
            list3.add(tmp);
        }
        
        Collections.sort(list1, new Comparator<sinhVien>(){
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(sinhVien it : list1){
            for(nhiemVu it1 : list3){
                for(deTai it2 : list2){
                    if(it.getMa().equals(it1.getMaSV()) && it1.getMaDT().equals(it2.getMa())){
                        System.out.println("DANH SACH HOI DONG " + it1.getMaHD().charAt(2) + ":");
                        System.out.println(it + " " + it2);
                        list1.remove(it);
                    }
                }
            }
        }
    }
}
