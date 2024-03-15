import java.util.Scanner;

public class Aplikasiperpus {
    public static void main(String[] args) {

// kamu sedang mengembangkan sebuah aplikasi untuk sistem pendapatan perpustakaan di sebuah sekolah
// aplikasi tersebut membutuhkan fitur untuk mengklasifikasikan usia pembaca buku berdasarkan kategori yang di tentukan
// dan memberikan rekomendasi jenis buku yang sesuai.

// kategorinya adalah
// anak-anak(usia <=12 tahun); rekomendasikan buku cerita
// remaja (usia 13 hingga 17 tahun) rekomendasikan buku petualangan.
// dewasa (usia >= 18 tahun); rekomendasikan buu non-fiksi
// dengan menggunakan struktur pengkondisian nested if else. tulislah kode java yang meminta usia pembaca sebagai input,
// dan menampilkan kategori beserta rekomendasi buku yang sesuai

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan usia anda");
        int usia = scanner.nextInt();
        if (usia <= 12) {
            System.out.println("anak-anak");
            System.out.println("Buku cerita");
        } else if (usia >= 13 && usia <= 17) {
            System.out.println("Remaja");
            System.out.println("Buku petualangan");
        } else if (usia >= 18) {
            System.out.println("Dewasa");
            System.out.println("Buku non-fiksi");
        }
    }
}


