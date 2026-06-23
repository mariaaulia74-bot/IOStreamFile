package bagian2.bacatulis;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri3 {
    public static void main(String[] args) {
        String namaFile = "hari.txt";
        int jumlahBaris = 0;

        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaFile))) {
            // Melakukan perulangan sambil menghitung baris
            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }
            
            System.out.println("--- Analisis Berkas ---");
            System.out.println("Jumlah total baris di dalam berkas '" + namaFile + "' adalah: " + jumlahBaris + " baris.");
            
        } catch (IOException e) {
            System.out.println("Gagal membaca berkas: " + e.getMessage());
        }
    }
}