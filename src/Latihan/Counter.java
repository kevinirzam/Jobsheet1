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
public class Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan batas perulangan : ");
        int batas = masuk.nextInt();
        int hasil = 0;
        for(int a=1;a<batas;a++){
            hasil+=a;
            System.out.println(hasil);}
            
        System.out.println("Total jumlah adalah : " + hasil);
        
        // TODO code application logic here
    }
    
}
