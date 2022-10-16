/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class KiemTraChiaHet {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SONGUYEN.IN"));
        
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            BigInteger n = new BigInteger(s);

            BigInteger x = (new BigInteger("7"));
            BigInteger y = (new BigInteger("13"));
            
            if(n.remainder(x) == BigInteger.ZERO && n.remainder(y) == BigInteger.ZERO){
                System.out.println("Both");
            }
            else if(n.remainder(x) == BigInteger.ZERO){
                System.out.println("Div 7");
            }
            else if(n.remainder(y) == BigInteger.ZERO){
                System.out.println("Div 13");
            }
            else System.out.println("None");
        }
    }
}
