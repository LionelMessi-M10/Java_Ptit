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
public class J04002_HinhChuNhat {
    private int dai, rong;
    private String mau;

    public int getDai() {
        return dai;
    }

    public int getRong() {
        return rong;
    }

    public String getMau() {
        return mau;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    
    public String chuanHoa(String s){
        String tmp = "";
        tmp += Character.toUpperCase(s.charAt(0));
        tmp += s.substring(1).toLowerCase();
        return tmp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        J04002_HinhChuNhat hcn = new J04002_HinhChuNhat();
        
        int d = sc.nextInt();
        int r = sc.nextInt();
        String color = sc.next();
        
        hcn.setDai(d);
        hcn.setRong(r);
        hcn.setMau(color);
        
        if(hcn.getDai() <= 0 || hcn.getRong() <= 0){
            System.out.println("INVALID");
        }
        else{
            System.out.println(((hcn.getDai() + hcn.getRong()) * 2) + " " + 
                    hcn.getDai() * hcn.getRong() + " " + hcn.chuanHoa(hcn.getMau()));
        }
    }
}
