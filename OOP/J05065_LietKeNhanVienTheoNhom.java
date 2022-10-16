/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
6
GD08001 Nguyen Kim Loan
TP05002 Hoang Thanh Tuan
TP05001 Tran Binh Nguyen
PP06002 Phan Trung Tuan
PP06001 Tran Quoc Huy
NV04003 Vo Van Lan
2
TP
PP
 * @author ADMIN
 */
public class J05065_LietKeNhanVienTheoNhom {
    
    static class NhanVien{
        private String ma, ten, chuc;

        public NhanVien(String ma, String ten, String chuc) {
            this.ma = ma;
            this.ten = ten;
            this.chuc = chuc;
        }

        public String getChuc() {
            return chuc;
        }

        public void setChuc(String chuc) {
            this.chuc = chuc;
        }
        
        public String heSoLuong(){
            return ma.substring(2, 4);
        }
        
        public String soHieu(){
            return ma.substring(4);
        }

        @Override
        public String toString() {
            return ten.trim() + " " + chuc + " " + soHieu() + " " + heSoLuong();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<NhanVien> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        int gd = 1, tp = 1, pp = 1;
        
        for(int i = 1; i <= n; ++i){
            String m = sc.next();
            String t = sc.nextLine();
            
            NhanVien it = new NhanVien(m, t, m.substring(0, 2));
            
            if("GD".equals(it.getChuc()) && gd <= 1) ++gd;
            else if("GD".equals(it.getChuc()) && gd > 1){
                it.setChuc("NV");
            }
            
            else if("TP".equals(it.getChuc()) && tp <= 3) ++tp;
            else if("TP".equals(it.getChuc()) && tp > 3){
                it.setChuc("NV");
            }
            
            else if("PP".equals(it.getChuc()) && pp <= 3) ++pp;
            else if("PP".equals(it.getChuc()) && pp > 3){
                it.setChuc("NV");
            }
            
            arr.add(it);
        }
        
        
        Collections.sort(arr, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if(!o1.heSoLuong().equals(o2.heSoLuong())){
                    return o2.heSoLuong().compareTo(o1.heSoLuong());
                }
                return o1.soHieu().compareTo(o2.soHieu());
            }            
        });
        
        
        int q = sc.nextInt();
        while(q-- > 0){
            String check = sc.next();
            for(NhanVien it : arr){
                if(it.getChuc().equals(check)){
                    System.out.println(it);
                }
            }
            System.out.println("");
        }
    }
}
