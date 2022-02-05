import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2;
        boolean res = true;
        if (num1 != 0) {
            num2 = scanner.nextInt();
            while (num2 != 0 && res) {
                if (num1 < num2) {
                    while (num2 != 0) {
                        if (num1 > num2) {
                            res = false;
                        }
                        num1 = num2;
                        num2 = scanner.nextInt();
                    }
                } else if (num1 > num2) {
                    while (num2 != 0) {
                        if (num2 > num1) {
                            res = false;
                        }
                        num1 = num2;
                        num2 = scanner.nextInt();
                    }
                } else {
                    num2 = scanner.nextInt();
                    continue;
                }
            }
            System.out.println(res);
        } else {
            System.out.println(!res);
        }
    }
}
