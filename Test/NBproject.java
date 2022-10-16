package test;

import java.io.*;
import java.util.*;

public class NBproject {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> vec = (ArrayList<Pair>)ois.readObject();
        ois.close();

        LinkedHashSet<Data> set = new LinkedHashSet<>();
        for (Pair x : vec) {
            if (x.getFirst() < x.getSecond()) {
                set.add(new Data(x.getFirst(), x.getSecond()));
            }
        }

        ArrayList<Data> res = new ArrayList<>();
        res.addAll(set);
        Collections.sort(res);
        for (Data d : res) System.out.println(d);
    }
}