/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07059_DanhSachCaThi {
    
    static class CaThi{
        private String ma, ngayThi, gioThi, phongThi;

        public CaThi(String ma, String ngayThi, String gioThi, String phongThi) {
            this.ma = ma;
            this.ngayThi = ngayThi;
            this.gioThi = gioThi;
            this.phongThi = phongThi;
        }

        public String getNgayThi() {
            return ngayThi;
        }

        public String getMa() {
            return ma;
        }

        public String getGioThi() {
            return gioThi;
        }
        
        public int gio(){
            return Integer.parseInt(gioThi.substring(0, 2));
        }
        
        public String chuyen(){
            String ans = "";
            String[] a = ngayThi.split("/");
            ans += a[2] + a[1] + a[0];
            return ans;
        }

        @Override
        public String toString() {
            return ma + " " + ngayThi + " " + gioThi + " " + phongThi;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        
        ArrayList<CaThi> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String m = String.format("C%03d", i);
            String nt = sc.next();
            String gt = sc.next();
            String pt = sc.next();
            CaThi tmp = new CaThi(m, nt, gt, pt);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<CaThi>(){
            @Override
            public int compare(CaThi o1, CaThi o2) {
                if(!o1.chuyen().equals(o2.chuyen())){
                    return o1.chuyen().compareTo(o2.chuyen());
                }
                else{
                    if(o1.gio() != o2.gio()){
                        return o1.getGioThi().compareTo(o2.getGioThi());
                    }
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for(CaThi it : arr){
            System.out.println(it);
        }
    }
}
