import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrStr;
        String str = scanner.nextLine();
        arrStr = str.split(" ");
        boolean res = true;
        for (int i = 0; i < arrStr.length - 1; ++i) {
            res = arrStr[i].compareTo(arrStr[i + 1]) <= 0 ? true : false;
            if (!res) {
                break;
            }
        }
        System.out.println(res);
    }
}