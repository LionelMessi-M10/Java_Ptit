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
public class TinhCong {
    
    private String ten, chucVu;
    private int luongCoBan, ngayCong, phuCap, thuong, thuNhap;

    public String getTen() {
        return ten;
    }

    public String getChucVu() {
        return chucVu;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public int getNgayCong() {
        return ngayCong;
    }

    public int getPhuCap() {
        if(null != this.chucVu) switch (this.chucVu) {
            case "GD":
                this.phuCap = 250000;
                break;
            case "PGD":
                this.phuCap = 200000;
                break;
            case "TP":
                this.phuCap = 180000;
                break;
            case "NV":
                this.phuCap = 150000;
                break;
            default:
                break;
        }
        return this.phuCap;
    }

    public int getThuong() {
        if(this.ngayCong >= 25) this.thuong = this.luongCoBan * this.ngayCong * 20 / 100;
        else if(this.ngayCong >= 22 && this.ngayCong < 25){
            this.thuong = this.luongCoBan * this.ngayCong * 10 / 100;
        }
        return this.thuong;
    }

    public int getThuNhap() {
        this.thuNhap = this.luongCoBan * this.ngayCong + this.phuCap + this.thuong;
        return this.thuNhap;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TinhCong nv = new TinhCong();
        nv.ten = sc.nextLine();
        nv.luongCoBan = sc.nextInt();
        nv.ngayCong = sc.nextInt();
        sc.nextLine();
        nv.chucVu = sc.nextLine();
        System.out.println("NV01 " + nv.ten + " " + nv.getLuongCoBan() * nv.getNgayCong() + " " + nv.getThuong() + " " + nv.getPhuCap() + " " + nv.getThuNhap());
    }
}
