package bagian1.berkas;

import java.io.File;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        // Mengubah nama folder menjadi "arsip"
        String namaDir = "arsip"; 
        File dir = new File(namaDir);
        
        // Memeriksa struktur kondisi berdasarkan return value mkdir()
        if (dir.mkdir()) {
            System.out.println("Selesai! Folder '" + namaDir + "' berhasil dibuat.");
        } else {
            System.out.println("Gagal! Folder '" + namaDir + "' sudah ada atau gagal dibuat.");
        }
    }
}