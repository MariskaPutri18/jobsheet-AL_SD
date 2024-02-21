import java.util.Scanner;

public class perulangan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = sc.nextLine();

        int n = Integer.parseInt(nim.substring(Math.max(0, nim.length() - 2)));
        System.out.println("n =" + n);
        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }
        sc.close();
    }
}

