   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;

/**
2
KV2A002
Hoang THAnh tuan
5
6
5
KV3B123
 LY Thi   THU ha
8
6.5
7
1
 * @author ADMIN
 */
public class TuyenSinh {
    
    private String ma, ten, tinhTrang;
    float toan, ly, hoa, diemUuTien, tongDiem;

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getTinhTrang() {
        if(this.tongDiem + this.diemUuTien < 24) this.tinhTrang = "TRUOT";
        else this.tinhTrang = "TRUNG TUYEN";
        return this.tinhTrang;
    }

    public float getToan() {
        return toan;
    }

    public float getLy() {
        return ly;
    }

    public float getHoa() {
        return hoa;
    }

    public float getDiemUuTien() {
        String tmp = this.ma.substring(0, 3);
        if(null != tmp) switch (tmp) {
            case "KV1":
                this.diemUuTien = 0.5f;
                break;
            case "KV2":
                this.diemUuTien = 1.0f;
                break;
            case "KV3":
                this.diemUuTien = 2.5f;
                break;
            default:
                break;
        }
        return this.diemUuTien;
    }

    public float getTongDiem() {
        this.tongDiem = this.toan * 2 + this.ly + this.hoa;
        return this.tongDiem;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh ts = new TuyenSinh();
        ts.ma = sc.nextLine();
        ts.ten = sc.nextLine();
        ts.toan = sc.nextFloat();
        ts.ly = sc.nextFloat();
        ts.hoa = sc.nextFloat();
        
        System.out.print(ts.getMa() + " " + ts.getTen() + " ");
        
        float diem1 = ts.getDiemUuTien();
        int tmp1 = (int) diem1;
        if(diem1 - tmp1 > 0){
            System.out.printf("%.1f ", diem1);
        }
        else System.out.print(tmp1 + " ");
        
        float diem2 = ts.getTongDiem();
        int tmp2 = (int) diem2;
        if(diem2 - tmp2 > 0){
            System.out.printf("%.1f ", diem2);
        }
        else System.out.print(tmp2 + " ");
        
        System.out.println(ts.getTinhTrang());
    }
}
