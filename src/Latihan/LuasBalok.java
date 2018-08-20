/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author WINDOWS 10
 */
public class LuasBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p,l,t;
        p=5;
        l=10;
        t=5;
        System.out.print("Nilai Panjang Balok : "+p);
        System.out.print("Nilai Lebar Balok : "+l);
        System.out.print("Nilai Tinggi Balok : "+t);
        System.out.print("===============================");
        System.out.print("Menghitung Luas Permukaan Balok");
        System.out.print("===============================");
        System.out.println("Luas Permukaan Balok :"+((2*p*l)+(2*l*t)+(2*p*t)));

        
    }
    
}
