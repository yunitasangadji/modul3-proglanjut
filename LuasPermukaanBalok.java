import java.util.Scanner;

    public class LuasPermukaanBalok {
        public static void main(String[] args) {
            // Membuat objek Scanner untuk menerima input dari pengguna
            Scanner input = new Scanner(System.in);

            // Meminta pengguna untuk memasukkan panjang, lebar, dan tinggi balok
            System.out.print("Masukkan panjang balok: ");
            double panjang = input.nextDouble();

            System.out.print("Masukkan lebar balok: ");
            double lebar = input.nextDouble();

            System.out.print("Masukkan tinggi balok: ");
            double tinggi = input.nextDouble();
            input.close();

            // Menghitung luas permukaan balok
            double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

            // Menampilkan hasil
            System.out.println("Luas permukaan balok adalah: " + luasPermukaan);
        }
    }
