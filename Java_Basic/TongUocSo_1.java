/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Basic;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TongUocSo_1 {
    
    static int[] prime = new int[10000001];
    
    public static void sang(){
        for (int i = 1; i <= 10000000; i++){
            prime[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(10000000); i++){
            if (prime[i] == i){
                for (int j = i * i; j <= 10000000; j += i){
                    if (prime[j] == j){
                        prime[j] = i;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sang();
        long sum = 0;
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            while(n != 1){
                int tmp = prime[n];
                while(n % tmp == 0){
                    sum += tmp;
                    n /= tmp;
                }
            }
        }
        System.out.println(sum);
    }
}

/*
5 
7
9 
10 
13 
100
*/
