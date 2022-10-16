/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
2
53
Da Nang
3000
64
Vung Tau
1000
3
064-824531 11:20 11:22
8293567 09:07 09:15
053-823532 12:00 12:05
 * @author ADMIN
 */
public class J05071_TinhCuocDienThoaiCoDinh_1 {
    
    static class ThanhPho{
        private String maVung, ten;
        private int giaCuoc;

        public ThanhPho(String maVung, String ten, int giaCuoc) {
            this.maVung = maVung;
            this.ten = ten;
            this.giaCuoc = giaCuoc;
        }

        public String getMaVung() {
            return maVung;
        }

        public String getTen() {
            return ten;
        }

        public int getGiaCuoc() {
            return giaCuoc;
        }
    }
    
    static class ThongTin{
        private String soThueBao, tinh;
        private int soPhut, giaCuoc;

        public ThongTin() {
        }

        public void setSoThueBao(String soThueBao) {
            this.soThueBao = soThueBao;
        }

        public void setTinh(String tinh) {
            this.tinh = tinh;
        }

        public void setSoPhut(int soPhut) {
            this.soPhut = soPhut;
        }

        public void setGiaCuoc(int giaCuoc) {
            this.giaCuoc = giaCuoc;
        }
    }
    
    public static int thoiGian(String a, String b){
        String[] x = a.split(":");
        String[] y = b.split(":");
        int sum = 0;
        sum += (Integer.parseInt(y[0]) - Integer.parseInt(x[0])) * 60;
        sum += (Integer.parseInt(y[1]) - Integer.parseInt(x[1]));
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<ThanhPho> list1 = new ArrayList<>();
        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int gia = sc.nextInt();
            
            ThanhPho tmp = new ThanhPho(ma, ten, gia);
            list1.add(tmp);
        }
        
        int m = sc.nextInt();
        
        for(int i = 1; i <= m; ++i){
            String maCuoc = sc.next();
            String start = sc.next();
            String finish = sc.next();
            System.out.print(maCuoc + " ");
            if(maCuoc.charAt(0) != '0'){
                System.out.print("Noi mang ");
                int soPhut = (int) Math.ceil(1.0 * thoiGian(start, finish) / 3);
                System.out.println(soPhut+ " " + (800 * soPhut));
            }
            else{
                int soPhut = thoiGian(start, finish);
                for(ThanhPho it : list1){
                    if(it.getMaVung().equals(maCuoc.substring(1, 3))){
                        System.out.println(it.getTen() + " " + soPhut + " " + it.getGiaCuoc() * soPhut);
                        break;
                    }
                }
            }
        }
    }
}
