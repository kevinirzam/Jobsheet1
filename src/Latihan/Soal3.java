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
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("Masukkan data diri anda");
        System.out.print("Nama              :");
        String nama=masuk.next();
        System.out.print("NIS               :");
        int nis=masuk.nextInt();
        System.out.print("Tempat Lahir      :");
        String tempatLa=masuk.next();
        System.out.print("Tanggal Lahir     :");
        String tanggalLa=masuk.next();
        System.out.print("Jenis kelamin     :");
        String jk=masuk.next();
        System.out.print("Alamat di malang  :");
        String alamat=masuk.next();
        System.out.print("Motto hidup       :");
        String motto=masuk.next();
        
        
        System.out.println();
        System.out.println("Hasil data diri");
        System.out.println("Nama              :" + nama);
        System.out.println("Nama              :" + nama);
        System.out.println("NIS               :" + nis);
        System.out.println("Tempat Lahir      :" + tempatLa);
        System.out.println("Tanggal Lahir     :" + tanggalLa);
        System.out.println("Jenis kelamin     :" + jk);
        System.out.println("Alamat di malang  :" + alamat);
        System.out.println("Motto hidup       :" + motto);
        
        
        
        // TODO code application logic here
    }
    
}
