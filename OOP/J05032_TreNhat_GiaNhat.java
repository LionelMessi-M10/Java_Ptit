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
public class J05032_TreNhat_GiaNhat {
    static class Person{
        private String ten, ngaySinh;

        public String getTen() {
            return ten;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }
        
        public String chuyen(String s){
            String[] a = s.split("/");
            return a[2] + a[1] + a[0];
        }

        public Person(String ten, String ngaySinh) {
            this.ten = ten;
            this.ngaySinh = ngaySinh;
        }

        @Override
        public String toString() {
            return ten;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Person> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        
        while(n-- > 0){
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            
            Person tmp = new Person(a[0], a[1]);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o2.chuyen(o2.getNgaySinh()).compareTo(o1.chuyen(o1.getNgaySinh()));
            }
        });
        
        System.out.println(arr.get(0).getTen());
        System.out.println(arr.get(arr.size()-1).getTen());
    }
}
