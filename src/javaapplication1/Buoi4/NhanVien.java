/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.Buoi4;
import java.util.Scanner;
/**
 *
 * @author CUONG GT
 */
public class NhanVien extends nguoi{
    protected int snct; // Số năm công tác
    protected double hsl; // Hệ số lương

    public NhanVien(int snct, double hsl) {
        this.snct = snct;
        this.hsl = hsl;
    }

    public NhanVien() {
    }

    public int getSnct() {
        return snct;
    }

    public double getHsl() {
        return hsl;
    }

    public void setSnct(int snct) {
        this.snct = snct;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nam cong tac: ");
        this.snct = scanner.nextInt();
        System.out.print("Nhap he so luong: ");
        this.hsl = scanner.nextDouble();
    }
    
    public double tinhLuong(){
        double lcb = 1.5;
        double phuCap = 0.2 * snct;
        return ((lcb * hsl) + phuCap);
    }
    public void xuat(){
        System.out.print("Ho ten:" + hoTen +", tuoi:" + tuoi);
        System.out.printf("So nam cong tac: %.2f, Luong: %.2f\n", snct, hsl, tinhLuong());
    }
}
