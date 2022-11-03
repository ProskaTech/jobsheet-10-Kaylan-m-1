/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SKS;

import java.util.Scanner;
/**
 *
 * @author Kayla Nahda Muadzah
 */
public class DataMahasiswa {
    String nama, smstr;
    int nim, ip;
    
    public void inputdata(){
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Nama Mahasiswa\t: ");
    nama = input.nextLine();
    System.out.print("Masukkan NIM\t: ");
    nim = input.nextInt();
    System.out.print("Masukkan Semester\t: ");
    smstr = input.nextLine();
    System.out.print("Masukkan IP Semester ini\t: ");
    ip = input.nextInt();
}

}
