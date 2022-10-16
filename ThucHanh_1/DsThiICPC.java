/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
2
BAV_MIS
Banking Academy of Vietnam
FTU Knights1
Foreign Trade University
6
Le Trung Toan
Team01
Nguyen Trinh Quoc Long
Team01
Giang Minh Tung
Team01
Nguyen Hang Giang
Team02
Nguyen Thanh Nhan
Team02
Nguyen Viet Duc
Team02
 * @author ADMIN
 */
public class DsThiICPC {
    static class Team{
        private String maTeam, tenTeam, tenTruong;

        public Team(String maTeam, String tenTeam, String tenTruong) {
            this.maTeam = maTeam;
            this.tenTeam = tenTeam;
            this.tenTruong = tenTruong;
        }

        public String getMaTeam() {
            return maTeam;
        }

        public String getTenTeam() {
            return tenTeam;
        }

        public String getTenTruong() {
            return tenTruong;
        }

        @Override
        public String toString() {
            return tenTeam + " " + tenTruong;
        }
    }
    
    static class sinhVien{
        private String maSV, ten, maTeam;

        public sinhVien(String maSV, String ten, String maTeam) {
            this.maSV = maSV;
            this.ten = ten;
            this.maTeam = maTeam;
        }

        public String getMaSV() {
            return maSV;
        }

        public String getTen() {
            return ten;
        }

        public String getMaTeam() {
            return maTeam;
        }

        @Override
        public String toString() {
            return maSV + " " + ten;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Team> list1 = new ArrayList<>();
        ArrayList<sinhVien> list2 = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; ++i){
            String ma = String.format("Team%02d", i);
            String ten = sc.nextLine();
            String truong = sc.nextLine();
            Team tmp = new Team(ma, ten, truong);
            list1.add(tmp);
        }
        
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= m; ++i){
            String ma = String.format("C%03d", i);
            String ten = sc.nextLine();
            String mt = sc.nextLine();
            
            sinhVien tmp = new sinhVien(ma, ten, mt);
            list2.add(tmp);
        }
        
        Collections.sort(list2, new Comparator<sinhVien>(){
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        
        for(sinhVien it : list2){
            for(Team it1 : list1){
                if(it.getMaTeam().equals(it1.getMaTeam())){
                    System.out.println(it + " " + it1);
                }
            }
        }
    }
}
