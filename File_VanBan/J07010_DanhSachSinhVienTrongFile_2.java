/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07010_DanhSachSinhVienTrongFile_2 {

    static class SinhVien {

        private String ten, lop, ngaySinh;
        private double gpa;

        public SinhVien(String ten, String lop, String ngaySinh, double gpa) {
            this.ten = ten;
            this.lop = lop;
            this.ngaySinh = ngaySinh;
            this.gpa = gpa;
        }

        // 02/2/2002 -> 
        public String chuanHoa(String s) {
            StringBuilder sb = new StringBuilder(s);
            if (sb.charAt(1) == '/') {
                sb.insert(0, '0');
            }
            if (sb.charAt(4) == '/') {
                sb.insert(3, '0');
            }
            return sb.toString();
        }

        @Override
        public String toString() {
            return ten + " " + lop + " " + chuanHoa(ngaySinh) + " " + String.format("%.2f", gpa);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));

        ArrayList<SinhVien> arr = new ArrayList<>();

        int t = sc.nextInt();
        while (t-- > 0) {
            while (sc.hasNext()) {
                sc.nextLine();
                SinhVien tmp = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
                arr.add(tmp);
            }
        }

        for (int i = 0; i < arr.size(); ++i) {
            System.out.println(String.format("B20DCCN%03d", i + 1) + " " + arr.get(i));
        }
    }
}
