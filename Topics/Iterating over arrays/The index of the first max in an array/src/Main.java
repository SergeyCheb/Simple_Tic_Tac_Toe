import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] initArr = new int[size];
        for (int i = 0; i < size; ++i) {
            initArr[i] = scanner.nextInt();
        }
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = initArr[i];
        }
        Arrays.sort(arr);
        int index = 0;
        for (; index < size; ++index) {
            if (initArr[index] == arr[size - 1]) {
                break;
            }
        }
        System.out.println(index);
    }
}