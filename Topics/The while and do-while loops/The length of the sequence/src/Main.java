import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int count = -1;
        do {
            num = scanner.nextInt();
            ++count;
        } while (num != 0);
        System.out.println(count);
    }
}