/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.*;

/**
 * 6
 * GD08001 Nguyen Kim Loan TP05002 Hoang Thanh Tuan TP05001 Tran Binh Nguyen
 * PP06002 Phan Trung Tuan PP06004 Tran Quoc Huy NV04003 Vo Van Lan 2 OA aN
 *
 * @author ADMIN
 */
class NhanVien {

    private String code, name, position, soHieu, bacLuong;

    public NhanVien(String code, String name) {
        this.code = code;
        this.position = code.substring(0, 2);
        this.soHieu = soHieu();
        this.bacLuong = bacLuong();
        
        if (position.equals("GD") && Integer.parseInt(soHieu) > 1) {
            this.position = "NV";
        }
        if (position.equals("TP") && Integer.parseInt(soHieu) > 3) {
            this.position = "NV";
        }
        if (position.equals("PP") && Integer.parseInt(soHieu) > 3) {
            this.position = "NV";
        }

        this.code = this.position + code.substring(2);
        this.name = name;
    }

    public String soHieu() {
        return this.code.substring(4);
    }

    public String bacLuong() {
        return this.code.substring(2, 4);
    }

    public boolean check(String x) {
        return this.name.toLowerCase().contains(x.toLowerCase());
    }

    @Override
    public String toString() {
        return this.name + " " + this.position + " " + soHieu() + " " + bacLuong();
    }
}

public class J05066_TimKiemNhanVienTheoTen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());
        
        LinkedList<NhanVien> lst = new LinkedList<>();
        while (t-- > 0) {
            String inp = sc.nextLine();
            String[] arr = inp.split("\\s+", 2);
            lst.add(new NhanVien(arr[0], arr[1]));
        }
        
        Collections.sort(lst, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                int b1 = Integer.parseInt(o1.bacLuong());
                int b2 = Integer.parseInt(o2.bacLuong());
                if (b1 != b2) {
                    return b2 - b1;
                } 
                else {
                    b1 = Integer.parseInt(o1.soHieu());
                    b2 = Integer.parseInt(o2.soHieu());
                    return b1 - b2;
                }
            }
        });

        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String x = sc.nextLine();
            for (NhanVien z : lst) {
                if (z.check(x)) {
                    System.out.println(z);
                }
            }
            System.out.println();
        }
    }
}
