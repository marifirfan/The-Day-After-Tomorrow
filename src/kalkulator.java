import java.util.Scanner;

/**
 * @implNote INI ADALAH PROGRAM UNTUK KALKULATOR SEDERHANA
 * @since 29/10/2023
 * @param kalkulator adalah kelas untuk menyimpan constructor
 * @param a          angka pertama
 * @param b          angka kedua
 * @return untuk mengembalikan value dari parameter(hasil pernjumlahan)
 */

public class kalkulator {

    public static int Penjumlahan(int a, int b) {
        return a + b;
    }

    public static int Pengurangan(int a, int b) {
        return a - b;
    }

    public static int Perkalian(int a, int b) {
        return a * b;
    }

    public static int Pembagian(int a, int b) {
        return a / b;
    }

    /**
     * 
     * @param main untuk menyimpan method dan kondisi
     * @param args argumen (tidak digunakan)
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // OBJEK INPUT

        System.out.println("masukan angka pertama : ");
        int a = input.nextInt(); // IMPLEMENTASI INPUT UNTUK variabel a

        System.out.println("masukan Operator (+,-,*,/)");
        String opsi = input.next(); // IMPLEMENTASI INPUT UNTUK variabel opsi

        System.out.println("masukan angka kedua : ");
        int b = input.nextInt();// IMPLEMENTASI INPUT UNTUK variabel b

        // KONDISI UNTUK OPSI PERHITUNGAN
        if (opsi.equals("+")) {
            System.out.println("hasil penjumlahan : " + Penjumlahan(a, b));
        } else if (opsi.equals("-")) {
            System.out.println("hasil pengurangan : " + Pengurangan(a, b));
        } else if (opsi.equals("*")) {
            System.out.println("Hasil perkalian : " + Perkalian(a, b));
        } else if (opsi.equals("/")) {
            System.out.println("Hasil pembagian : " + Pembagian(a, b));
        } else {
            System.out.println("opsi yang di masukan tidak tersedia");
        }
    }
}