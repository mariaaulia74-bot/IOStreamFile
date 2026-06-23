package bagian3.kontak;

public class Kontak {
    // Atribut: data yang dimiliki setiap kontak
    private String nama;
    private String nomor;
    private String email; // Tambahan atribut email (Soal No. 2)
    
    // Constructor yang diperbarui (Soal No. 2)
    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }
    
    // Getter
    public String getNama() {
        return nama;
    }
    
    public String getNomor() {
        return nomor;
    }

    public String getEmail() { // Tambahan getter email (Soal No. 2)
        return email;
    }
    
    // Mengubah objek menjadi satu baris teks dengan format 3 bagian (Soal No. 2)
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }
    
    // Mengembalikan keterangan kontak dengan email (Soal No. 2)
    public String info() {
        return nama + " - " + nomor + " (" + email + ")";
    }
}