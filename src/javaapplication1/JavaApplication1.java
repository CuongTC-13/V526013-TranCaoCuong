/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author CUONG GT
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HinhTron ht1 = new HinhTron(1, 1, 3.5);
        HinhTron ht2 = new HinhTron();
        System.out.println(ht1);
        System.out.println("Dien tich hinh tron 1 la:" + ht1.dienTich());
        if(ht1.dienTich() > ht2.dienTich()){
            //System.out.println("Hinh tron 1 co dien tich lon hon")
        }
        
    }
    
}
