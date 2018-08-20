/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;
public class Kondisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan Nilai PBO : ");
        nilai = masuk.nextInt();
        if(nilai>=70&&nilai<=100)System.out.print("Siswa Lulus");
        if(nilai<70)System.out.print("Siswa Tidak Lulus");  
    }
    
}
