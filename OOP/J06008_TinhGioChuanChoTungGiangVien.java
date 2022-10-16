/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */

class MonHoc {
	protected String code, name;

	public MonHoc(String code, String name) {
		this.code = code;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

class GiangVien {
	protected String code, name;

	public GiangVien(String code, String name) {
		this.code = code;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

class HocPhan {
	private String code;
	private GiangVien gv;
//	private LinkedList<MonHoc> lstmh = new LinkedList<>();
	private LinkedHashMap<MonHoc, Double> lstMonHoc = new LinkedHashMap<>();
	private double sumTime = 0;

	public HocPhan() {

	}

	public HocPhan(String code, String codeMonHoc, double time, ArrayList<MonHoc> lstMonHoc,
			ArrayList<GiangVien> lstGiangVien) {
		this.code = code;
		gv = mapGiangVien(lstGiangVien, code);
		this.lstMonHoc.put(mapMonHoc(lstMonHoc, codeMonHoc), time);
		sumTime = time;
	}

	public void themHocPhan(String codeMonHoc, double time, ArrayList<MonHoc> lstMonHoc) {
		this.lstMonHoc.put(mapMonHoc(lstMonHoc, codeMonHoc), time);
		sumTime += time;
	}

	public GiangVien mapGiangVien(ArrayList<GiangVien> lst, String codeGiangVien) {
		for (GiangVien x : lst) {
			if (x.code.equals(codeGiangVien)) {
				return x;
			}
		}
		return null;
	}

	public MonHoc mapMonHoc(ArrayList<MonHoc> lst, String codeMonHoc) {
		for (MonHoc x : lst) {
			if (x.code.equals(codeMonHoc)) {
				return x;
			}
		}
		return null;
	}

	public String getCode() {
		return code;
	}
	public String getNameGiangVien() {
		return this.gv.name;
	}
	public double getSumTime() {
		return sumTime;
	}
	public void showHocPhan() {
		for(Map.Entry<MonHoc, Double> entry : lstMonHoc.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	@Override
	public String toString() {
		return gv.name + " " + String.format("%.2f", sumTime);
	}
}

public class J06008_TinhGioChuanChoTungGiangVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> lstMonHoc = new ArrayList<>();
        while (t-- > 0) {
            String code = sc.next();
            String name = sc.nextLine();
            MonHoc mh = new MonHoc(code, name);
            lstMonHoc.add(mh);
        }
        t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> lstGiangVien = new ArrayList<>();
        while (t-- > 0) {
            String code = sc.next();
            String name = sc.nextLine();
            GiangVien gv = new GiangVien(code, name);
            lstGiangVien.add(gv);
        }
        t = Integer.parseInt(sc.nextLine());
        LinkedList<HocPhan> lstHocPhan = new LinkedList<>();
        while (t-- > 0) {
            String code = sc.next(), codeMonHoc = sc.next();
            double time = sc.nextDouble();
            int ok = 0;
            for (HocPhan x : lstHocPhan) {
                if (x.getCode().equals(code)) {
                    ok = 1;
                    x.themHocPhan(codeMonHoc, time, lstMonHoc);
                }
            }
            if (ok == 0) {
                HocPhan hp = new HocPhan(code, codeMonHoc, time, lstMonHoc, lstGiangVien);
                lstHocPhan.add(hp);
            }
        }
        String gvCanTim = sc.next();
        HocPhan canTim = null;
        for (HocPhan x : lstHocPhan) {
            if (x.getCode().equals(gvCanTim)) {
                canTim = x;
            }
        }
        System.out.println("Giang vien: " + canTim.getNameGiangVien());
        canTim.showHocPhan();
        System.out.println("Tong: " + String.format("%.2f", canTim.getSumTime()));

        sc.close();
    }
}
