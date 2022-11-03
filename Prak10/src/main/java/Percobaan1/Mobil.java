/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Percobaan1;

/**
 *
 * @author Kayla Nahda Muadzah
 */
public class Mobil {
    String merk, warna;
    int tahunproduksi;

    public void maju() {
        int kec = 10;
        System.out.println("MObil maju sejauh" + kec + " meter ");
    }
    
    public void mundur() {
        int kec = 5;
        System.out.println("MObil mundur sejauh" + kec + " meter ");
    }
}
