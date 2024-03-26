public class ContohForBiasa {
    public static void main(String[] args) {
        String Nama = "Baraccung";

        // for-each hanya cocok untuk data seperti array atau list oleh karena itu tidak bisa menggunakan for-each di sini 
        // Oleh karena itu, kita harus menggunakan for biasa untuk mendapatkan nama berdasarkan indeks
        for (int i = 0; i < Nama.length(); i++) {
            char nama = Nama.charAt(i);
            System.out.println("Karakter ke-" + (i + 1) + ": " + nama);
        }
    }
}