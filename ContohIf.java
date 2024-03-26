public class ContohIf {
    public static void main(String[] args) {
        int angka = 10;

        if (angka > 5) {
            System.out.println("Angka melebihi 5");
        } else {
            System.out.println("Angka dibawah 5 atau 5");
        }
    }
}

public class ContohTandaTanya {
    public static void main(String[] args) {
        int angka = 10;

        // untuk mengetahui apakah angka tersebut lebih besar dari 5 menggunakan ?: 
        // Jika iya, maka hasilnyal "Angka melebihi 5", jika tidak, beri label "Angka dibawah 5 atau"
        String hasil = (angka > 5) ? "Angka melebihi 5" : "Angka dibawah 5 atau 5";

        // untuk menampilkan hasil 
        System.out.println(hasil);
    }
}