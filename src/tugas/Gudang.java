package tugas;

import java.io.*;
import java.util.ArrayList;

public class Gudang {
    private ArrayList<Barang> daftarBarang;

    public Gudang() {
        this.daftarBarang = new ArrayList<>();
    }

    // Method untuk menambah barang
    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    // Method untuk menampilkan semua barang
    public void tampilkanSemua() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Gudang kosong.");
            return;
        }
        for (Barang barang : daftarBarang) {
            barang.info();
        }
    }

    // Method untuk menghitung total nilai persediaan (harga * stok)
    public double totalNilai() {
        double total = 0;
        for (Barang barang : daftarBarang) {
            total += barang.getHarga() * barang.getStok();
        }
        return total;
    }

    // Method untuk menyimpan data ke berkas teks
    public void simpanKeBerkas(String namaBerkas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaBerkas))) {
            for (Barang barang : daftarBarang) {
                writer.write(barang.keBaris());
                writer.newLine();
            }
            System.out.println("Data berhasil disimpan ke berkas: " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data: " + e.getMessage());
        }
    }

    // Method untuk memuat data dari berkas teks
    public void muatDariBerkas(String namaBerkas) {
        daftarBarang.clear(); // Bersihkan list sebelum memuat data baru
        try (BufferedReader reader = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                // Memecah string berdasarkan tanda koma
                String[] data = baris.split(",");
                if (data.length == 3) {
                    String nama = data[0];
                    double harga = Double.parseDouble(data[1]);
                    int stok = Integer.parseInt(data[2]);
                    
                    Barang barang = new Barang(nama, harga, stok);
                    daftarBarang.add(barang);
                }
            }
            System.out.println("Data berhasil dimuat dari berkas: " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal memuat data: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Format data dalam berkas tidak valid: " + e.getMessage());
        }
    }
}