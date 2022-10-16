/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011
 * @author ADMIN
 */
public class J05006_DanhSachDoiTuongNhanVien {
    static class NhanVien{
        private String ma, ten, gioiTinh, ngaySinh, diaChi, maThue, ngayKy;

        public NhanVien(String ma, String ten, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKy) {
            this.ma = ma;
            this.ten = ten;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
            this.maThue = maThue;
            this.ngayKy = ngayKy;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + gioiTinh + " " + ngaySinh + " " + diaChi + " "
                    + maThue + " " + ngayKy;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<NhanVien> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; ++i){
            String m = "000" + String.format("%02d", i);
            String ten = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String dc = sc.nextLine();
            String mt = sc.nextLine();
            String nk = sc.nextLine();
            NhanVien tmp = new NhanVien(m, ten, gt, ns, dc, mt, nk);
            arr.add(tmp);
        }
        
        for(NhanVien it : arr){
            System.out.println(it);
        }
    }
}
