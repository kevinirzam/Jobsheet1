/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class PilihanMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);
        int pilihan=9;
        do{
            System.out.println("\nMenu Luas Bangun");
            System.out.println("1. Menghitung Luas Persegi");
            System.out.println("2. Menghitung Luas Persegi Panjang");
            System.out.print("3. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = masuk.nextInt();
        }while(pilihan!=3);
    }
    
}
