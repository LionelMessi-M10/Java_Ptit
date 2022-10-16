/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
10
Dong Anh
07:30
08:00
60
Cau Giay
07:45
08:12
50
Soc Son
08:00
09:15
78
Dong Anh
18:50
20:00
88
Cau Giay
19:01
20:00
77
Soc Son
19:06
20:21
66
Dong Anh
21:00
21:40
49
Cau Giay
21:50
22:20
68
Dong Anh
22:15
23:45
30
Cau Giay
22:50
23:45
35
 * @author ADMIN
 */
public class J05019_LuongMuaTrungBinh {
    
    static class LuongMua{
        private String maTram, tenTram, batDau, ketThuc;
        private int luongMuaDo;
        private float time;

        public LuongMua(String maTram, String tenTram, String batDau, String ketThuc, int luongMuaDo) {
            this.maTram = maTram;
            this.tenTram = tenTram;
            this.batDau = batDau;
            this.ketThuc = ketThuc;
            this.luongMuaDo = luongMuaDo;
        }

        public String getMaTram() {
            return maTram;
        }

        public String getTenTram() {
            return tenTram;
        }

        public String getBatDau() {
            return batDau;
        }

        public String getKetThuc() {
            return ketThuc;
        }

        public int getLuongMuaDo() {
            return luongMuaDo;
        }

        public void setMaTram(String maTram) {
            this.maTram = maTram;
        }

        public void setTenTram(String tenTram) {
            this.tenTram = tenTram;
        }

        public void setBatDau(String batDau) {
            this.batDau = batDau;
        }

        public void setKetThuc(String ketThuc) {
            this.ketThuc = ketThuc;
        }

        public void setLuongMuaDo(int luongMuaDo) {
            this.luongMuaDo += luongMuaDo;
        }
        
        public float thoiGian(String a, String b){
            String[] x = a.split(":");
            String[] y = b.split(":");
            float sum = 0;
            sum += 1.0 * (Integer.parseInt(y[0]) - Integer.parseInt(x[0]));
            sum += 1.0 * (Integer.parseInt(y[1]) - Integer.parseInt(x[1])) / 60;
            return sum;
        }

        public void setTime(float time) {
            this.time += time;
        }
        
        public float trungBinh(){
            return (float) ((1.0 * luongMuaDo / time) / 100.0) * 100;
        }

        public float getTime() {
            return time;
        }

        @Override
        public String toString() {
            return maTram + " " + tenTram + " " + String.format("%.2f", trungBinh());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<LuongMua> arr = new ArrayList<>();
        
        int cnt = 1;
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String ma = String.format("T%02d", cnt);
            sc.nextLine();
            String ten = sc.nextLine();
            String start = sc.nextLine();
            String finish = sc.nextLine();
            int lm = sc.nextInt();
            
            LuongMua tmp = new LuongMua(ma, ten, start, finish, lm);
            tmp.setTime(tmp.thoiGian(tmp.getBatDau(), tmp.getKetThuc()));
            
            if(arr.isEmpty()) {
                arr.add(tmp);
                ++cnt;
            }
            
            else{
                boolean ok = false;
                
                for(LuongMua it : arr){
                    if(it.getTenTram().equals(tmp.getTenTram())){
                        ok = true;
                        it.setLuongMuaDo(tmp.getLuongMuaDo());
                        it.setTime(tmp.getTime());
                        break;
                    }
                }
                
                if(!ok){
                    arr.add(tmp);
                    ++cnt;
                }
            }
        }
        
        for(LuongMua it : arr){
            System.out.println(it);
        }
    }
}
