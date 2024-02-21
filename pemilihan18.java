import java.util.Scanner;

public class pemilihan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double nilaiUas, nilaiTugas, nilaiKuis, nilaiUts;

        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("==========================");

        System.out.print("Masukkan Nilai tugas (0-100) =");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis (0-100) =");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Niali UTS (0-100) =");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS (0-100) =");
        nilaiUas = sc.nextDouble();

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUts < 0 || nilaiUts > 100 || nilaiUas < 0 || nilaiUas > 100) {
            System.out.println("==========================");
            System.out.println("Nilai Tidak Valid");
            return;
        }

        double nilaiAkhir = nilaiTugas * 0.2 + nilaiKuis * 0.2 + nilaiUts* 0.3 + nilaiUas*0.3 ;
        
        String nilaiHuruf = "";
         if (nilaiAkhir>80) {
            nilaiHuruf = "A";
         } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";  
         } else if (nilaiAkhir>65) {
            nilaiHuruf = "B";
         }else if (nilaiAkhir>60) {
            nilaiHuruf = "C+";
         }else if (nilaiAkhir>50) {
            nilaiHuruf = "C";
         }else if (nilaiAkhir>39){
            nilaiHuruf = "D";
         }else if ( nilaiAkhir <= 39){
            nilaiHuruf = "E";
         }
         System.out.println("==========================");
         System.out.println("Nilai akhir: " + nilaiAkhir);
         System.out.println("Nilai huruf: " + nilaiHuruf);
         System.out.println("==========================");

         if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
             System.out.println("Keterangan: Maaf Anda Tidak Lulus");
         } else {
             System.out.println("Keterangan: TIDAK Selamat Anda dinyatakan LuLus");
         }
sc.close();

    }
}