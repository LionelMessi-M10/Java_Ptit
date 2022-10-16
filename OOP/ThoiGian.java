/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
3
11 20 20
14 20 14
11 15 12
 */
public class ThoiGian {
    
    private int gio, phut, giay;

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }

    public int getGiay() {
        return giay;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThoiGian> arr = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; ++i){
            ThoiGian tmp = new ThoiGian();
            tmp.gio = sc.nextInt();
            tmp.phut = sc.nextInt();
            tmp.giay = sc.nextInt();
            arr.add(tmp);
        }
        Collections.sort(arr, new Comparator<ThoiGian>(){
            @Override
            public int compare(ThoiGian o1, ThoiGian o2) {
                if(o1.getGio() != o2.getGio()){
                    return o1.getGio() - o2.getGio();
                }
                else{
                    if(o1.getPhut() != o2.getPhut()){
                        return o1.getPhut() - o2.getPhut();
                    }
                    else return o1.getGiay() - o2.getGiay();
                }
            }            
        });
        
        for(ThoiGian x : arr){
            System.out.println(x.getGio() + " " + x.getPhut() + " " + x.getGiay());
        }
    }
}
