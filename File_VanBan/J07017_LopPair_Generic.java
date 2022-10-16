/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J07017_LopPair_Generic {
    
    static class Pair<K, V> {

        private K key;
        private V val;

        public Pair(K key, V val) {
            this.key = key;
            this.val = val;
        }

        public boolean isPrime() {
            int tmpK = Integer.parseInt(String.valueOf(key));
            int tmpV = Integer.parseInt(String.valueOf(val));
            if (tmpK < 2 || tmpV < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(tmpK); i++) {
                if (tmpK % i == 0) {
                    return false;
                }
            }
            for (int i = 2; i <= Math.sqrt(tmpV); i++) {
                if (tmpV % i == 0) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public String toString() {
            return key + " " + val;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
