import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nextNum = scanner.nextInt();
        while (nextNum != 0) {
            sum += nextNum;
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
            nextNum = scanner.nextInt();
        }
        System.out.println(sum);
    }
}