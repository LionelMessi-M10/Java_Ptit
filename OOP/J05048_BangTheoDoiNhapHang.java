/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
3
A001Y
1000
B012N
2500
B003Y
4582
 * @author ADMIN
 */
public class J05048_BangTheoDoiNhapHang {

    static class bangTheoDoi {

        private String ma;
        private int soLuong;
        
        public long xuatHang(){
            long ans = 0;
            if(this.ma.charAt(0) == 'A'){
                ans = (long) (Math.round((1.0 * soLuong * 60 / 100)) + 0.5);
            }
            else if(this.ma.charAt(0) == 'B') 
                ans = (long) (Math.round((1.0 * soLuong * 70 / 100)) + 0.5);
            return ans;
        }
        
        public long donGia(){
            long ans = 0;
            if(this.ma.charAt(this.ma.length() - 1) == 'Y'){
                ans = 110000;
            }
            else if(this.ma.charAt(this.ma.length() - 1) == 'N'){
                ans = 135000;
            }
            return ans;
        }
        
        public long tien(){
            return 1l * xuatHang() * donGia();
        }
        
        public long thue(){
            int idx = this.ma.length() - 1;
            
            if(this.ma.charAt(0) == 'A' && this.ma.charAt(idx) == 'Y'){
                return (long) (tien() * 8 / 100);
            }
            else if(this.ma.charAt(0) == 'A' && this.ma.charAt(idx) == 'N'){
                return (long) (tien() * 11 / 100);
            }
            else if(this.ma.charAt(0) == 'B' && this.ma.charAt(idx) == 'Y'){
                return (long) (tien() * 17 / 100);
            }
            return (long) (tien() * 22 / 100);
        }

        public bangTheoDoi(String ma, int soLuong) {
            this.ma = ma;
            this.soLuong = soLuong;
        }

        @Override
        public String toString() {
            return ma + " " + soLuong + " " + xuatHang() + " " + donGia() 
                    + " " + tien() + " " + thue();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<bangTheoDoi> arr = new ArrayList<>();
        
        long n = sc.nextInt();
        for(long i = 1; i <= n; ++i){
            sc.nextLine();
            String m = sc.nextLine();
            int sl = sc.nextInt();
            
            bangTheoDoi tmp = new bangTheoDoi(m, sl);
            arr.add(tmp);
        }
        
        for(bangTheoDoi it : arr){
            System.out.println(it);
        }
    }
}
