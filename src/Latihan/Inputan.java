/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;
public class Inputan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        int a,b;
        System.out.print("Masukkan Nilai A : ");
        a = masukkan.nextInt();
        System.out.print("Masukkan Nilai B : ");
        b = masukkan.nextInt();
        System.out.println();
        System.out.println("Nilai Variabel yang ada pada program : ");
        System.out.println("a : "+ a);
        System.out.println("b : "+b);
    }
    
}
