import java.util.Scanner;

public class TUGAS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jmlElemen = sc.nextInt();

        int[] nilai = new int[jmlElemen];

        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            nilai[i] = sc.nextInt();
        }
        int nilaiTinggi = nilai[0];
        for (int i = 1; i < jmlElemen; i++) {
            if (nilai[i] > nilaiTinggi) {
                nilaiTinggi = nilai[i];
            }
        }
        int nilaiRendah = nilai[0];
        for (int i = 1; i < jmlElemen; i++) {
            if (nilai[i] < nilaiRendah) {
                nilaiRendah = nilai[i];
            }
        }
        int total = 0;
        for (int i = 0; i < jmlElemen; i++) {
            total += nilai[i];
        }
        float rataRata = (float) total / jmlElemen;

        System.out.println("Nilai tertinggi: " + nilaiTinggi);
        System.out.println("Nilai terendah: " + nilaiRendah);
        System.out.println("Rata-rata: " + rataRata);
    }
}
