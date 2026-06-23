package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        String namaFile = "hari.txt";

        // 1. Menambahkan (append) 2 nama hari baru
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaFile, true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
            System.out.println("2 nama hari baru berhasil ditambahkan.\n");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        // 2. Menampilkan seluruh isi berkas setelah di-append
        System.out.println("--- Isi Berkas Terbaru ---");
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}