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
 *
 * @author ADMIN
 */
public class J05011_TinhGio {

    static class time {

        private String ma, ten, start, finish;

        public String getTen() {
            return ten;
        }

        public String getStart() {
            return start;
        }

        public String getFinish() {
            return finish;
        }

        public time(String ma, String ten, String start, String finish) {
            this.ma = ma;
            this.ten = ten;
            this.start = start;
            this.finish = finish;
        }

        public static int chuyen(String s) {
            int ans = 0;
            for (int i = 0; i < s.length(); ++i) {
                ans = ans * 10 + (s.charAt(i) - '0');
            }
            return ans;
        }

        public int time(String a, String b) {
            int ans = 0;

            int h1 = chuyen(a.substring(0, 2));
            int h2 = chuyen(b.substring(0, 2));
            int m1 = chuyen(a.substring(3));
            int m2 = chuyen(b.substring(3));

            if (m1 > m2) {
                ans = (h2 - 1 - h1) * 60 + (m2 + 60 - m1);
            } else {
                ans = (h2 - h1) * 60 + (m2 - m1);
            }
            return ans;
        }

        public String playGame(String a, String b) {

            int h1 = chuyen(a.substring(0, 2));
            int h2 = chuyen(b.substring(0, 2));
            int m1 = chuyen(a.substring(3));
            int m2 = chuyen(b.substring(3));

            if (m1 > m2) {
                return (h2 - 1 - h1) + " gio " + (m2 + 60 - m1) + " phut";
            }
            return (h2 - h1) + " gio " + (m2 - m1) + " phut";
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + this.playGame(start, finish);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<time> arr = new ArrayList<>();
        
        int n  = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; ++i){
            String m = sc.nextLine();
            String t = sc.nextLine();
            String st = sc.nextLine();
            String fi = sc.nextLine();
            time tmp = new time(m, t, st, fi);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<time>(){
            @Override
            public int compare(time o1, time o2) {
                return o2.time(o2.getStart(), o2.getFinish()) - o1.time(o1.getStart(), o1.getFinish());
            }
        });
        
        for(time it : arr){
            System.out.println(it);
        }
    }
}
