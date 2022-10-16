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
1
3*x^8 + 7*x^2 + 4*x^0
11*x^6 + 9*x^2 + 2*x^1
* 
1
3*x^8 + 7*x^2 + 4*x^0
11*x^6 + 9*x^2 + 2*x^1 + 3*x^0
 * @author ADMIN
 */
public class J05063_TongDaThuc {
    
    static class DaThuc{
        private String s;

        public DaThuc(String s) {
            this.s = s;
        }

        public DaThuc() {
        }

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }
        
        public String sum(String a, String b){
            String ans = "";
            int idx1 = 0, idx2 = 0, idx3 = 0, idx4 = 0;
            for(int i = 0; i < a.length(); ++i){
                if(a.charAt(i) == '*') idx1 = i;
                else if(a.charAt(i) == '^') idx2 = i;
            }
            
            for(int i = 0; i < b.length(); ++i){
                if(b.charAt(i) == '*') idx3 = i;
                else if(b.charAt(i) == '^') idx4 = i;
            }
            
            ans += Integer.toString((Integer.parseInt(a.substring(0, idx1)) + Integer.parseInt(b.substring(0, idx3))));
            ans += "*x^";
            ans += Integer.toString((Integer.parseInt(a.substring(idx2 + 1))));
            return ans;
        }
        
        public int bac(String s){
            int idx = 0;
            for(int i = 0; i < s.length(); ++i){
                if(s.charAt(i) == '^') idx = i;
            }
            return Integer.parseInt(s.substring(idx + 1));
        }
        
        public DaThuc cong(DaThuc another){
            String[] x = this.s.split("\\s+");
            String[] y = another.getS().split("\\s+");
            DaThuc tong = new DaThuc();
            String res = "";
            
            ArrayList<String> list = new ArrayList<>();
            
            for(int i = 0; i < x.length; ++i){
                if(!"+".equals(x[i])){
                    list.add(x[i]);
                }
            }
            
            for(int i = 0; i < y.length; ++i){
                if(!"+".equals(y[i])) list.add(y[i]);
            }
            
            Collections.sort(list, new Comparator<String>(){
                @Override
                public int compare(String o1, String o2) {
                    return bac(o2) - bac(o1);
                }
            });
            
            res = list.get(0);
            String tmp = "";
            
            for(int i = 1; i < list.size(); ++i){
                if(bac(list.get(i)) == bac(list.get(i - 1))){
                    res = sum(res, list.get(i));
                }
                else{
                    if(i != list.size()) res += " + ";
                    tmp += res;
                    res = list.get(i);
                }
            }
            tmp += res;
            tong.setS(tmp);
            return tong;
        }

        @Override
        public String toString() {
            return s;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
    }
}
