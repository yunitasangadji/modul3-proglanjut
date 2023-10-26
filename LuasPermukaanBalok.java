import java.util.Scanner;

    public class LuasPermukaanBalok {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan panjang balok: ");
            double panjang = input.nextDouble();

            System.out.print("Masukkan lebar balok: ");
            double lebar = input.nextDouble();

            System.out.print("Masukkan tinggi balok: ");
            double tinggi = input.nextDouble();
            input.close();
            double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
            System.out.println("Luas permukaan balok adalah: " + luasPermukaan);
            
        }
    }
Modul Tiga
