/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
8
e2 e4
a1 b2
b2 c3
a1 h8
a1 h7
h8 a1
b1 c3
f6 f6
 * @author ADMIN
 */
public class J08029_QuanMa {
    
    static class Cap{
        private int fi, se;

        public Cap() {
        }

        public Cap(int fi, int se) {
            this.fi = fi;
            this.se = se;
        }

        public int getFi() {
            return fi;
        }

        public int getSe() {
            return se;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Cap other = (Cap) obj;
            if (this.fi != other.fi) {
                return false;
            }
            return this.se == other.se;
        }
    }
    
    static int dx[] = { -2, -2, 2, 2, -1, -1, 1, 1};
    static int dy[] = {1, -1, -1, 1, 2, -2, -2, 2};
    
    public static int BFS(Cap st, Cap en){
        int[][] f = new int[10][10];
        
        Cap fr = new Cap();
        Queue<Cap> q = new LinkedList<>();
        q.add(st);
        f[st.getFi()][st.getSe()] = 1;
        while(!q.isEmpty()){
            fr = q.poll();
            for(int i = 0; i < 8; ++i){
                if (fr.getFi() + dx[i] <= 8 && fr.getFi() + dx[i] >= 1 && fr.getSe() + dy[i] <= 8 && 
                        fr.getSe() + dy[i] >= 1 && f[fr.getFi() + dx[i]][fr.getSe() + dy[i]] != 1)
		{
                    if (fr.getFi() + dx[i] == en.getFi() && fr.getSe() + dy[i] == en.getSe())
                    return f[fr.fi][fr.se];
                    f[fr.getFi() + dx[i]][fr.getSe() + dy[i]] = f[fr.getFi()][fr.getSe()] + 1;
                    q.add(new Cap(fr.getFi() + dx[i], fr.getSe() + dy[i]));
		}
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            String st = sc.next();
            String en = sc.next();
            
            Cap start = new Cap(st.charAt(0) - 'a' + 1, st.charAt(1) - '0');
            Cap end = new Cap(en.charAt(0) - 'a' + 1, en.charAt(1) - '0');
            
            if(start.equals(end)){
                System.out.println(0);
            }
            else System.out.println(BFS(start, end));
        }
        
    }
}
