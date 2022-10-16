/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
2
KV2A002
Hoang Thanh Tuan
5
6
5
KV2B123
Ly Thi Thu Ha
8
6.5
7
 * @author ADMIN
 */
public class J05057_BangDiemTuyenSinh {
    
    static class bangDiem{
        private String ma, ten;
        private double toan, ly, hoa;

        public bangDiem(String ma, String ten, double toan, double ly, double hoa) {
            this.ma = ma;
            this.ten = ten;
            this.toan = toan;
            this.ly = ly;
            this.hoa = hoa;
        }
        
        public double tongDiem(){
            return toan * 2 + ly + hoa;
        }
        
        public double uuTien(){
            String check = ma.substring(0, 3);
            if("KV1".equals(check)) return 0.5;
            else if("KV2".equals(check)){
                return 1.0;
            }
            return 2.5;
        }
        
        public String trangThai(){
            double diemThi = tongDiem() + uuTien();
            if(diemThi < 24){
                return "TRUOT";
            }
            return "TRUNG TUYEN";
        }

        @Override
        public String toString() {
            String ans = ma + " " + ten + " ";
            if(uuTien() - (int)(uuTien()) == 0){
                ans += Integer.toString((int)(uuTien())) + " ";
            }
            else ans += String.format("%.1f", uuTien()) + " ";
            
            if(tongDiem() - (int)(tongDiem()) == 0){
                ans += Integer.toString((int)(tongDiem()));
            }
            else ans += String.format("%.1f", tongDiem());
            return ans + " " + trangThai();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<bangDiem> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            sc.nextLine();
            String m = sc.nextLine();
            String t = sc.nextLine();
            double diemToan = sc.nextDouble();
            double diemLy = sc.nextDouble();
            double diemHoa = sc.nextDouble();
            
            bangDiem tmp = new bangDiem(m, t, diemToan, diemLy, diemHoa);
            arr.add(tmp);
        }
        
        for(bangDiem it : arr){
            System.out.println(it);
        }
    }
}
