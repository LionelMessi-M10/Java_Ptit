/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class SinhVien_1 {
    
    private String ma, ten, lop, ngaySinh;
    private double diem;

    public String getMa() {
        this.ma = "";
        return this.ma;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public double getDiem() {
        return diem;
    }

    public SinhVien_1(String ma, String ten, String lop, String ngaySinh, double diem) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.diem = diem;
    }
    
    public String chuanHoa(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + chuanHoa(ngaySinh) + " " + String.format("%.2f", diem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<SinhVien_1> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; ++i){
            String ma = "B20DCCN" + String.format("%03d", i);
            sc.nextLine();
            String t = sc.nextLine();
            String l = sc.nextLine();
            String ns = sc.nextLine();
            double d = sc.nextDouble();
            SinhVien_1 tmp = new SinhVien_1(ma, t, l, ns, d);
            arr.add(tmp);
        }
        
        for(SinhVien_1 it : arr){
            System.out.println(it);
        }
        
    }
}

/*
1
Nguyen Van An
D20CQCN01-B
2/12/2002
3.19
*/
