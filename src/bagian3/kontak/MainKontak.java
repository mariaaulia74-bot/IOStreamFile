package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        // 1. Membuat objek dan menambahkan data (dengan email baru)
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@mail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@mail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@mail.com"));
        
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        
        System.out.println("\n--- UJI COBA METHOD CARI (Soal 1) ---");
        buku.cariKontak("Budi");  // Harusnya ketemu
        buku.cariKontak("Dedi");  // Harusnya tidak ketemu
        
        System.out.println("\n--- UJI COBA METHOD HAPUS (Soal 3) ---");
        buku.hapusKontak("Andi"); // Menghapus Andi dan autosave
        
        System.out.println("\n--- UJI MEMBACA BERKAS BARU ---");
        // Objek baru untuk membuktikan data di file txt sudah ter-update otomatis
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua(); // Andi harusnya sudah tidak ada di list ini
        System.out.println("Jumlah kontak sekarang: " + bukuLain.jumlahKontak());
    }
}