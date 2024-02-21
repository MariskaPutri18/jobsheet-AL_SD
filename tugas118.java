import java.util.Scanner;
public class tugas118 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', },
            {'M', 'a', 'l', 'a', 'n', 'g'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        System.out.print("Masukkan kode plat nomor: ");
        String inputKode = sc.nextLine();

        int indexKode = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (inputKode.charAt(0) == KODE[i]) {
                indexKode = i;
                break;
            }
        }
        if (indexKode == -1) {
            System.out.println("Kode plat nomor tidak ditemukan!");
        } else {

            System.out.print("Nama kota: ");
            for (int j = 0; j < KOTA[indexKode].length; j++) {
                System.out.print(KOTA[indexKode][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
