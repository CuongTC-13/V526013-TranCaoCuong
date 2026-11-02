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
public class nguoi {
    protected String hoTen;
    protected int tuoi;

    public nguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public nguoi() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        this.tuoi = scanner.nextInt();
    }
}
