package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri3 {
    public static void main(String[] args) {
        // 1. Membuat objek File dengan nama "sementara.txt"
        File berkas = new File("sementara.txt");

        try {
            // 2. Membuat berkas fisik di harddisk
            if (berkas.createNewFile()) {
                System.out.println("Berkas 'sementara.txt' berhasil dibuat.");
            } else {
                System.out.println("Berkas 'sementara.txt' sudah ada.");
            }

            // 3. Menampilkan status keberadaan berkas SEBELUM dihapus
            System.out.println("Status keberadaan berkas sebelum dihapus: " + berkas.exists());

            System.out.println("--- Menghapus Berkas ---");

            // 4. Menghapus berkas menggunakan method delete()
            if (berkas.delete()) {
                System.out.println("Berkas berhasil dihapus.");
            } else {
                System.out.println("Berkas gagal dihapus.");
            }

            // 5. Menampilkan status keberadaan berkas SESUDAH dihapus
            System.out.println("Status keberadaan berkas sesudah dihapus: " + berkas.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan penanganan file: " + e.getMessage());
        }
    }
}