import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int i = 0;
        long fact = 1;
        while (fact <= num) {
            ++i;
            fact *= i;
        }
        System.out.println(i);
    }
}
