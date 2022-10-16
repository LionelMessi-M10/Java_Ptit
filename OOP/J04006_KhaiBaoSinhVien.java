/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J04006_KhaiBaoSinhVien {
    private String ten, ma, ngaySinh;
    private double gpa;
    
    public String chuanHoa(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "B20DCCN001 " + ten + " " + ma + " " + chuanHoa(ngaySinh) + " "
                + String.format("%.2f", gpa);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        J04006_KhaiBaoSinhVien sv = new J04006_KhaiBaoSinhVien();
        sv.ten = sc.nextLine();
        sv.ma = sc.nextLine();
        sv.ngaySinh = sc.nextLine();
        sv.gpa = sc.nextDouble();
        System.out.println(sv);
    }
}
