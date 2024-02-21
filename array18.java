import java.util.Scanner;

public class array18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] namaMK = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"};
        double[] nilaiAngka = new double[namaMK.length];
        double[] sks = new double[namaMK.length];
        double[] nilaisetara = new double[namaMK.length];
        double totalNilai = 0;
        double totalSks = 0;

        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
            System.out.print("Masukkan SKS untuk MK " + namaMK[i] + ": ");
            sks[i] = input.nextDouble();
        }
        for (int i = 0; i < namaMK.length; i++) {
            if (nilaiAngka[i] >= 85) {
                nilaisetara[i] = 4.0;
            } else if (nilaiAngka[i] >= 80) {
                nilaisetara[i] = 3.5;
            } else if (nilaiAngka[i] >= 75) {
                nilaisetara[i] = 3.0;
            } else if (nilaiAngka[i] >= 70) {
                nilaisetara[i] = 2.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaisetara[i] = 2.0;
            } else {
                nilaisetara[i] = 0.0;
            }
        }
        for (int i = 0; i < namaMK.length; i++) {
            totalNilai +=  nilaisetara[i] * sks[i];
            totalSks += sks[i];
        }
        double ip = totalNilai / totalSks;
        System.out.print(" Total sks :" + totalSks);
        
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("| %-30s | %-10s | %-10s | %-10s | %-10s |\n", "MK", "Nilai Angka", "SKS", "Nilai Huruf", "Bobot Nilai");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < namaMK.length; i++) {
            String nilaiHuruf;
            if (nilaisetara[i] == 4.0) {
                nilaiHuruf = "A";
            } else if (nilaisetara[i] == 3.5) {
                nilaiHuruf = "A-";
            } else if (nilaisetara[i] == 3.0) {
                nilaiHuruf = "B+";
            } else if (nilaisetara[i] == 2.5) {
                nilaiHuruf = "B";
            } else if (nilaisetara[i] == 2.0) {
                nilaiHuruf = "C+";
            } else {
                nilaiHuruf = "E";
            }
            System.out.printf("| %-30s | %-10.2f | %-10.2f | %-10s | %-10.2f |\n", namaMK[i], nilaiAngka[i], sks[i], nilaiHuruf, nilaisetara[i]);
        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("\nIP: %.2f\n", ip);
    }
}
