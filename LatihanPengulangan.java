package com.tutorial.kelasterbuka;
import java.util.Scanner;
public class LoopingSederhana { 
    public static void main(String[] args) {
        int nilaiAwal, nilaiAkhir, total;
        Scanner xcan = new Scanner(System.in);
        System.out.print("Masukkan Nilai Awal:");
        nilaiAwal = xcan.nextInt();
        System.out.print("Masukkan Nilai Akhir:");
        nilaiAkhir = xcan.nextInt();
//        Menggunakan Do-While
        /*total = 0;
          do {
            System.out.print(total+" ditambah dengan "+nilaiAwal);
            total = total + nilaiAwal;
            System.out.println(" menjadi "+total);
            nilaiAwal++;
        } while (nilaiAwal <= nilaiAkhir);
        */
//        Menggunakan For
        for (total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++) {
            System.out.print(total+" ditambah dengan "+nilaiAwal);
            total = total + nilaiAwal;
            System.out.println(" menjadi "+total);
        }
    }
}
