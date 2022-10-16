/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class J07084_ThoiGianOnlineLienTuc {
    static class ThoiGian{
        private String ten, batDau, keThuc;

        public ThoiGian(String ten, String batDau, String keThuc) {
            this.ten = ten;
            this.batDau = batDau;
            this.keThuc = keThuc;
        }

        public String getTen() {
            return ten;
        }
        
        public long thoiGianHoc(){
            long ans = 0;
            
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            
            try {
                Date d1 = date.parse(batDau);
                Date d2 = date.parse(keThuc);
                
                long start = d1.getTime();
                long finish = d2.getTime();
                
                ans = Math.round(1l * (finish - start) / (60 * 1000));
            } catch (ParseException ex) {
                Logger.getLogger(J07084_ThoiGianOnlineLienTuc.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return ans;
        }

        @Override
        public String toString() {
            return ten + " " + thoiGianHoc();
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        
        ArrayList<ThoiGian> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= n; ++i){
            String t = sc.nextLine();
            String bd = sc.nextLine();
            String kt = sc.nextLine();
            
            ThoiGian tmp = new ThoiGian(t, bd, kt);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<ThoiGian>(){
            @Override
            public int compare(ThoiGian o1, ThoiGian o2) {
                if(o2.thoiGianHoc() != o1.thoiGianHoc()){
                    if(o2.thoiGianHoc() - o1.thoiGianHoc() > 0){
                        return 1;
                    }
                    else return -1;
                }
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        
        for(ThoiGian it : arr){
            System.out.println(it);
        }
    }
}
