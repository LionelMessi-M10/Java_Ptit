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
public class NhanVien {
    private String ten, gioiTinh, ngaySinh, diaChi, maThue, ngayKy;

    public String getTen() {
        return ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getMaThue() {
        return maThue;
    }

    public String getNgayKy() {
        return ngayKy;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        nv.ten = sc.nextLine();
        nv.gioiTinh = sc.next();
        nv.ngaySinh = sc.next();
        sc.nextLine();
        nv.diaChi = sc.nextLine();
        nv.maThue = sc.next();
        nv.ngayKy = sc.next();
        System.out.println("00001 " + nv.ten + " " + nv.getGioiTinh() + " " + nv.getNgaySinh() + " " + nv.getDiaChi() + " " + nv.getMaThue() + " " + nv.getNgayKy());
    }
}
