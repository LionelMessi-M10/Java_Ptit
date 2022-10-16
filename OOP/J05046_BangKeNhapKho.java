/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
 * @author ADMIN
 */
public class J05046_BangKeNhapKho {

    static class LoHang {
    private String ma, ten, maH;
    private long slg, donGia, tongTien, chietKhau, thanhTien;

    public LoHang(String ten, long slg, long donGia) {
        this.ten = ten;
        this.slg = slg;
        this.donGia = donGia;
        this.ma = maLo(ten);
        this.tongTien = slg * donGia;
        this.chietKhau = tienChietKhau();
        this.thanhTien = tongTien - chietKhau;
        this.maH = maLo(ten);
    }

    public String getMaH() {
        return maH;
    }

    public void setMa(int ma) {
        this.ma = this.ma + String.format("%02d", ma);
    }

    private String maLo(String s){
        String tmp[] = s.split(" ");
        String res = "" + tmp[0].toUpperCase().charAt(0) + tmp[1].toUpperCase().charAt(0);
        return res;
    }

    private long tienChietKhau(){
        if(slg > 10) return tongTien / 100 * 5;
        if(slg <= 10 && slg >= 8) return tongTien / 100 * 2;
        if(slg < 8 && slg >= 5) return tongTien / 100 * 1;
        return 0;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + chietKhau + " " + thanhTien;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<LoHang> ds = new ArrayList<>();
        LoHang lh = new LoHang(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
        lh.setMa(1);
        ds.add(lh);
        while (t-- > 1){
            lh = new LoHang(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            int a = 1;
            for(int i = 0; i < ds.size(); i++){
                if(lh.getMaH().equals(ds.get(i).getMaH())){
                    a++;
                }
            }
            lh.setMa(a);
            ds.add(lh);
        }
        for(LoHang l: ds){
            System.out.println(l);
        }
    }
}
