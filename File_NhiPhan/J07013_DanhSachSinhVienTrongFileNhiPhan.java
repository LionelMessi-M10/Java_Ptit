/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_NhiPhan;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class J07013_DanhSachSinhVienTrongFileNhiPhan {

    static class SinhVien implements Serializable {

        private String code, name, className;
        private double gpa;
        private Date birthday;

        public SinhVien(int code, String name, String className, Date birthday, double gpa) {
            this.code = "B20DCCN" + String.format("%03d", code);
            this.name = name;
            this.className = className;
            this.gpa = gpa;
            this.birthday = birthday;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public String getClassName() {
            return className;
        }

        public double getGpa() {
            return gpa;
        }

        public Date getBirthday() {
            return birthday;
        }

        @Override
        public String toString() {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            return code + " " + name + " " + className + " " + df.format(birthday) + " " + String.format("%.2f", gpa);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String url = "SV.in";
        FileInputStream fis = new FileInputStream(url);
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            ArrayList<SinhVien> lst = new ArrayList<>();
            lst = (ArrayList<SinhVien>) ois.readObject();
            int d = 1;
            for (SinhVien x : lst) {
                
                System.out.println(x);
            }
        }
    }
}
