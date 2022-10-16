/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File_VanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author ADMIN
 */
public class LietKeTuKhacNhau {
    
    static class WordSet{
        private File file;

        public WordSet(String s) {
            file = new File(s);
        }

        @Override
        public String toString() {
            TreeSet<String> set = new TreeSet<>();
            try {
                Scanner sc = new Scanner(file);
                while(sc.hasNext()){
                    String tmp = sc.nextLine();
                    tmp = tmp.toLowerCase();
                    String[] a = tmp.split("\\s+");
                    for(int i = 0; i < a.length; ++i){
                        set.add(a[i]);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LietKeTuKhacNhau.class.getName()).log(Level.SEVERE, null, ex);
            }
            String ans = "";
            for(String it : set){
                ans += it + "\n";
            }
            return ans;
        }
    }
    
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
