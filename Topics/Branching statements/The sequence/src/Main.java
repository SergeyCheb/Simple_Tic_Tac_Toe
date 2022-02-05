import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int currentPrint = 1;
        for (int i = 0; i < amount;) {
            for (int j = 0; j < currentPrint; ++j, ++i) {
                if (i == amount) {
                    break;
                }
                System.out.print(currentPrint + " ");
            }
            ++currentPrint;
        }
    }
}