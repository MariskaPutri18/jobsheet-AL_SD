import java.util.Scanner;

public class fungsi18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] namaBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        int[] stockAwalCabang1 = { 10, 6, 2, 5 };
        int[] stockAwalCabang2 = { 8, 4, 3, 7 };
        int[] stockAwalCabang3 = { 2, 10, 10, 5 };
        int[] stockAwalCabang4 = { 5, 7, 12, 9 };
        int[] hargaBunga = { 75000, 50000, 60000, 10000 };
        int[] penguranganStockCabang4 = { -1, -2, 0, -5 };

        int[] totalPendapatanCabang1 = hitungPendapatan(namaBunga, stockAwalCabang1, hargaBunga);
        int[] totalPendapatanCabang2 = hitungPendapatan(namaBunga, stockAwalCabang2, hargaBunga);
        int[] totalPendapatanCabang3 = hitungPendapatan(namaBunga, stockAwalCabang3, hargaBunga);
        int[] totalPendapatanCabang4 = hitungPendapatan(namaBunga, stockAwalCabang4, hargaBunga);
        
        for (int i = 0; i < namaBunga.length; i++) {
            System.out.printf("\nCabang %d:\n", i+1);
            System.out.printf("Pendapatan %s: Rp%d\n", namaBunga[i], totalPendapatanCabang1[i]);
            System.out.printf("Pendapatan %s: Rp%d\n", namaBunga[i], totalPendapatanCabang2[i]);
            System.out.printf("Pendapatan %s: Rp%d\n", namaBunga[i], totalPendapatanCabang3[i]);
            System.out.printf("Pendapatan %s: Rp%d\n", namaBunga[i], totalPendapatanCabang4[i]);
            System.out.printf("Total Pendapatan Cabang %d: Rp%d\n", i+1, totalPendapatanCabang1[4] + totalPendapatanCabang2[4] + totalPendapatanCabang3[4] + totalPendapatanCabang4[4]);
        }
        int[] totalStockCabang4 = hitungStock(stockAwalCabang4, penguranganStockCabang4);
        System.out.println("\nTotal Stock Royal Garden 4:");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-10s | %-10s |\n", "Nama Bunga", "Stock Awal", "Total Stock");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < namaBunga.length; i++) {
            System.out.printf("| %-10s | %-10d | %-10d |\n", namaBunga[i], stockAwalCabang4[i], totalStockCabang4[i]);
        }
        System.out.println("----------------------------------------------------------------------------------");

        input.close();
    }

    static int[] hitungPendapatan(String[] namaBunga, int[] stockAwal, int[] hargaBunga) {
        int[] totalTerjual = new int[namaBunga.length];
        int[] pendapatan = new int[namaBunga.length + 1];
        int totalPendapatan = 0;
        for (int i = 0; i < namaBunga.length; i++) {
            totalTerjual[i] = stockAwal[i];
        }
        for (int i = 0; i < namaBunga.length; i++) {
            pendapatan[i] = totalTerjual[i] * hargaBunga[i];
            totalPendapatan += pendapatan[i];
        }

        pendapatan[4] = totalPendapatan;
        return pendapatan;
    }

    static int[] hitungStock(int[] stockAwal, int[] penguranganStock) {
        int[] totalStock = new int[stockAwal.length]; 

        for (int i = 0; i < stockAwal.length; i++) {
            totalStock[i] = stockAwal[i] + penguranganStock[i];
        }

        return totalStock;
    }
}
