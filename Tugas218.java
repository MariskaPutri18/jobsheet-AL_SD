import java.util.Scanner;

public class Tugas218 {
    public static void main(String[] args) {
        int pilhan;
        Scanner sc = new Scanner(System.in);
        double s, v, t;
        do {
            System.out.println("Menu:");
            System.out.println("1. kecepatan");
            System.out.println("2. jarak ");
            System.out.println("3. waktu ");
            System.out.println("4. keluar ");
            System.out.print("masukkan pilhan Anda : ");
            pilhan = sc.nextInt();

            switch (pilhan) {
                case 1:
                    System.out.print("Masukkan jarak (s): ");
                    s = sc.nextDouble();
                    System.out.print("Masukkan waktu (t): ");
                    t = sc.nextDouble();
                    System.out.println("Kecepatan adalah " + hitungKecepatan(s, t));
                    break;
                case 2:
                    System.out.print("Masukkan kecepatan (v): ");
                    v = sc.nextDouble();
                    System.out.print("Masukkan waktu (t): ");
                    t = sc.nextDouble();
                    System.out.println("Jarak adalah " + hitungJarak(v, t));
                    break;
                case 3:
                    System.out.print("Masukkan jarak (s): ");
                    s = sc.nextDouble();
                    System.out.print("Masukkan kecepatan (v): ");
                    v = sc.nextDouble();
                    System.out.println("Waktu adalah " + hitungWaktu(s, v));
                    break;
                case 4:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Silahkan pilih kembali. Pilhan salah");
                    break;
            }

        } while ( pilhan!= 4);

     
       sc.close();
    }
        static double hitungJarak(double kecepatan, double waktu) {
            return kecepatan * waktu;
        }

        static double hitungKecepatan(double jarak, double waktu) {
            return jarak / waktu;
        }

        static double hitungWaktu(double jarak, double kecepatan) {
            return jarak / kecepatan;
    }
}
    
        
    


