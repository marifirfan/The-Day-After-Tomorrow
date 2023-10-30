import java.util.Scanner;

public class lusa {
    /**
     * @implNote INI ADALAH PROGRAM UNTUK MENENTUKAN HARI LUSA SETELAH HARI SEKARANG
     * @since 29/10/2023
     * @param calculateLusa konstruktor nya
     * @param option        variabel untuk menyimpan value opsi
     * @return pilihan hari lusa
     */
    public static int calculateLusa(int option) {
        int pilih = option + 2;

        // kondisi untuk kasus hari 1(senin) - minggu(7)
        if (pilih > 7) {
            pilih = pilih % 7;
        }

        return pilih;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // membuat objek scanner baru

        System.out.print("1. Senin ... 7. Minggu");
        System.out.print("Sekarang hari [1-7] : ");

        int option = input.nextInt(); // input value untuk option

        int pilih = calculateLusa(option); // mengambil value pilih dari konstruktor

        String hari = "";

        switch (pilih) {
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;
            default:
                break;
        }

        System.out.print("Lusa adalah hari : " + hari); // output
    }
}
