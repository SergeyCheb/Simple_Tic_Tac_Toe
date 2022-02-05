import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        double sum = (double) m;
        int year = 0;
        while (sum < (double) k) {
            sum += sum * (double) p / 100;
            ++year;
        }
        System.out.println(year);
    }
}