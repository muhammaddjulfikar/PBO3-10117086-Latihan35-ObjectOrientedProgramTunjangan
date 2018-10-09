/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan35.objectorientedprogramtunjangan;

import java.util.Scanner;

/**
 *
 * @author Lenovo NAMA : RD Muhammad Djulfikar BU 
 * KELAS               : IF3 
 * NIM                 : 10117086
 * DESKRIPSI PROGRAM   program tentang tunjangan: 
 */
public class PBO310117086Latihan35ObjectOrientedProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Karyawan kar = new Karyawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) :");
        kar.status = scn.next();

        kar.HasilHitung(kar.status, kar.gajiPokok);

    }

}
