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
public class GiaoVien {
    
    private String ma, ten;
    private int luongCoBan, phuCap, thuNhap, heSo;

    public int getHeSo() {
        String tmp = this.ma.substring(2);
        this.heSo = 0;
        for(int i = 0; i < tmp.length(); ++i){
            this.heSo = this.heSo * 10 + (tmp.charAt(i) - '0');
        }
        return heSo;
    }

    public int getPhuCap() {
        String tmp = this.ma.substring(0, 2);
        if(null != tmp) switch (tmp) {
            case "HT":
                this.phuCap = 2000000;
                break;
            case "HP":
                this.phuCap = 900000;
                break;
            case "GV":
                this.phuCap = 500000;
                break;
            default:
                break;
        }
        return this.phuCap;
    }

    public int getThuNhap() {
        this.thuNhap = this.luongCoBan * (this.heSo) + this.phuCap;
        return this.thuNhap;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }
    
    /*
HP04
Tran Quoc Huy
1578000
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien a = new GiaoVien();
        a.ma = sc.next();
        sc.nextLine();
        a.ten = sc.nextLine();
        a.luongCoBan = sc.nextInt();
        System.out.println(a.getMa() + " " + a.getTen() + " " + a.getHeSo() + " " + a.getPhuCap() + " " + a.getThuNhap());
    }
}
