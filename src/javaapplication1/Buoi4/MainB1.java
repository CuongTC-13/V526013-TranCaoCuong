/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Buoi4;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author CUONG GT
 */
public class MainB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong nhan vien: ");
        int n = scanner.nextInt();
        
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        for(int i = 0; i < n;i++){
            System.out.println("\n Nhap thong tin nv: " + (i+1) + ":");
            NhanVien nv = new NhanVien();
            nv.nhap();
            dsNhanVien.add(nv);
        }
        if(!dsNhanVien.isEmpty()){
            int maxSnct = dsNhanVien.get(0).getSnct();
            for(NhanVien nv : dsNhanVien){
                if(nv.getSnct() > maxSnct){
                    maxSnct = nv.getSnct();
                }
            }
            System.out.println("\n Nhan vien co so nam ct nhieu nhat("+ maxSnct +" nam)");
            for (NhanVien nv : dsNhanVien){
                if(nv.getSnct() == maxSnct){
                    nv.xuat();
                }
            }
        }
        
        Collections.sort(dsNhanVien, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien nv1, NhanVien nv2){
                return Double.compare(nv2.tinhLuong(), nv1.tinhLuong());
            }
        });
        
        System.out.println("\n Nhan vien sau khi xep luong giam dan");
        for(NhanVien nv : dsNhanVien){
            nv.xuat();
        }
    }
}
