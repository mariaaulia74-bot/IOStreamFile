// Nama: MARIA AULIA
// NPM: 2410010491

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        String namaBerkas = "barang.txt";

        // 1. Menyimpan dan menampilkan daftar kategori dalam Array String tetap
        String[] kategori = {"Elektronik", "Pakaian", "Makanan & Minuman", "Alat Tulis"};
        System.out.println("=== DAFTAR KATEGORI TOKO ===");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". " + kategori[i]);
        }
        System.out.println("-------------------------------------------------");

        // 2. Membuat objek Gudang pertama dan menambah minimal 5 barang
        Gudang gudangSatu = new Gudang();
        gudangSatu.tambahBarang(new Barang("Laptop Asus", 8500000, 5));
        gudangSatu.tambahBarang(new Barang("Mouse Wireless", 150000, 15));
        gudangSatu.tambahBarang(new Barang("Kemeja Polos", 125000, 20));
        gudangSatu.tambahBarang(new Barang("Kopi Susu", 15000, 50));
        gudangSatu.tambahBarang(new Barang("Buku Tulis A5", 6000, 100));

        // 3. Menyimpan data gudang pertama ke berkas teks
        System.out.println("\n[Sistem] Menyimpan data awal ke berkas...");
        gudangSatu.simpanKeBerkas(namaBerkas);
        System.out.println("-------------------------------------------------");

        // 4. Membuat objek Gudang baru untuk membuktikan data tersimpan (Load Test)
        System.out.println("\n[Sistem] Membuat objek Gudang baru dan memuat data...");
        Gudang gudangBaru = new Gudang();
        gudangBaru.muatDariBerkas(namaBerkas);

        // 5. Menampilkan data yang dimuat dari berkas beserta total nilai persediaannya
        System.out.println("\n=== DATA BARANG DI GUDANG BARU ===");
        gudangBaru.tampilkanSemua();
        System.out.println("-------------------------------------------------");
        System.out.printf("TOTAL NILAI PERSEDIAAN: RpFormat%.2f%n", gudangBaru.totalNilai());
        System.out.println("=================================================");
    }
}