import java.util.Scanner;
/**
 * ArrayRataNilai26Modif2
 */
public class ArrayRataNilai26Modif2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nilaiMhs= new int[10];
    double total = 0;
    double rata2;
    int mahasiswaLulus = 0;

    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i] = sc.nextInt();
    }
    for (int i = 0; i < nilaiMhs.length; i++) {
        total += nilaiMhs[i];
        if (nilaiMhs[i] > 70) {
            mahasiswaLulus++;
        }
    }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai ="+rata2);
        System.out.println("Banyaknya mahasiswa yang lulus :" + mahasiswaLulus);
        }
}