package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) throws IOException {
        //Objek File hanyalah petunjuk, belum tentu ada di disk 
        File berkas = new File("laporan.txt");

        //Membuat berkas Laporan.txt
        if (berkas.createNewFile()){
            System.out.println("Berkas dibuat : " + berkas.getName());
        } else{
            System.out.println(berkas.getName() + "  Tidak ada");
        }
        
        //Memeriksa informasi berkas
        System.out.println("Apakah ada? : " + berkas.exists());
        System.out.println("Ukuran (byte) : " + berkas.length());
    }
}