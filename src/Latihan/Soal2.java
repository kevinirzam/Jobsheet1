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
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan Nilai Celcius : ");
        float cel = masuk.nextInt();
        
        System.out.println("Fahrenheit : " +(((9/5)*cel)+32));
        System.out.println("Reamur : " +(cel*4/5));
        System.out.println("Kelvin : " +(cel+273));

    }
    
}
