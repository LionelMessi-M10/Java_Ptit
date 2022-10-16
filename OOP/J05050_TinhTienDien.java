/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
3
KD
400
555
NN
58
400
CN
150
700
 * @author ADMIN
 */
public class J05050_TinhTienDien {
    
    static class tienDien{
        private String ma, loaiSD;
        private int chiSoCu, ChiSoMoi;

        public tienDien(String ma, String loaiSD, int chiSoCu, int ChiSoMoi) {
            this.ma = ma;
            this.loaiSD = loaiSD;
            this.chiSoCu = chiSoCu;
            this.ChiSoMoi = ChiSoMoi;
        }

        public int heSo(){
            if("KD".equals(loaiSD)) return 3;
            else if("NN".equals(loaiSD)) return 5;
            else if("TT".equals(loaiSD)) return 4;
            return 2;
        }
        
        public long thanhTien(){
            return 1l * (ChiSoMoi - chiSoCu) * heSo() * 550;
        }
        
        public long phuTroi(){
            int check = ChiSoMoi - chiSoCu;
            if(check < 50) return 0;
            else if(check >= 50 && check <= 100){
                return Math.round(1.0 * thanhTien() * 35/100);
            }
            return thanhTien();
        }
        
        public long tongTien(){
            return phuTroi() + thanhTien();
        }

        @Override
        public String toString() {
            return ma + " " + heSo() + " " + thanhTien() + " " + phuTroi()
                    + " " + tongTien();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<tienDien> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String m = String.format("KH%02d", i);
            String lsd = sc.next();
            int csc = sc.nextInt();
            int csm = sc.nextInt();
            
            tienDien tmp = new tienDien(m, lsd, csc, csm);
            arr.add(tmp);
        }
        
        for(tienDien it : arr){
            System.out.println(it);
        }
    }
}
