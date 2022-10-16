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
public class SinhVien {
    
    private String ten, Lop, ngaySinh;
    private int diem;

    public int getDiem() {
        return diem;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return Lop;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public SinhVien() {
    }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        sv.ten = sc.nextLine();
        sv.Lop = sc.next();
        sv.ngaySinh = sc.next();
        sv.diem = sc.nextInt();
        String s = sv.getNgaySinh();

        if(s.charAt(0) != '0') s = "0" + s;
        String tmp = "";
        if(s.length() == 10) tmp += s;
        else{
            tmp += s.substring(0, 3) + "0" + s.substring(3);
        }
        
        System.out.print("B20DCCN001" + " " + sv.getTen() + " " + sv.getLop() + " " + tmp + " ");
        System.out.printf("%.2f", 1f*sv.getDiem());
    }
}
