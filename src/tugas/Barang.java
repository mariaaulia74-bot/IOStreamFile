package tugas;

public class Barang {
    private String nama;
    private double harga;
    private int stok;

    // Constructor
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Method untuk format penyimpanan ke berkas (menggunakan pemisah koma)
    public String keBaris() {
        return nama + "," + harga + "," + stok;
    }

    // Method untuk menampilkan informasi barang
    public void info() {
        System.out.printf("- %-15s | Harga: Rp%-10.2f | Stok: %d%n", nama, harga, stok);
    }
}