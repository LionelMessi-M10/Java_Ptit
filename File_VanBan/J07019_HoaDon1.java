/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */

class SanPham {

    protected String code, name;
    protected int unit1, unit2;

    public SanPham(String code, String name, int unit1, int unit2) {
        this.code = code;
        this.name = name;
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    public int getUnit1() {
        return unit1;
    }

    public int getUnit2() {
        return unit2;
    }
}

class HoaDon {

    private String code, tenSanPham;
    private int amount, cost;
    private static int stt = 0;

    public HoaDon() {
    }

    public HoaDon(String code, int amount) {
        stt++;
        this.code = code + "-" + String.format("%03d", stt);
        this.amount = amount;
    }

    public int getType() {
        return (int) code.charAt(2) - 48;
    }

    public void mapSanPham(ArrayList<SanPham> lst) {
        int x = getType();
        for (SanPham sp : lst) {
            if (sp.code.equals(this.code.substring(0, 2))) {
                this.tenSanPham = sp.name;
                if (x == 1) {
                    cost = sp.unit1;
                } else {
                    cost = sp.unit2;
                }
            }
        }
    }

    public long thanhTien() {
        return amount * cost;
    }

    public long giamGia() {
        if (amount >= 150) {
            return (long)Math.round(thanhTien() / 100.0 * 50);
        }
        if (amount >= 100) {
            return (long)Math.round(thanhTien() / 100.0 * 30);
        }
        if(amount >= 50) return (long)Math.round(thanhTien() / 100.0 * 15);
        return 0;
    }

    @Override
    public String toString() {
        return code + " " + tenSanPham + " " + giamGia() + " " + (thanhTien() - giamGia());
    }
}


public class J07019_HoaDon1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        Scanner sc1 = new Scanner(new File("DATA2.in"));

        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> lstSanPham = new ArrayList<>();
        while (t-- > 0) {
            SanPham sp = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            lstSanPham.add(sp);
        }
        t = Integer.parseInt(sc1.nextLine());
        while (t-- > 0) {
            HoaDon x = new HoaDon(sc1.next(), sc1.nextInt());
            x.mapSanPham(lstSanPham);
            System.out.println(x);
        }
    }
}
