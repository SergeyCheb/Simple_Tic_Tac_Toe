import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = scanner.nextInt();
        }
        int maxProd = arr[0] * arr[1];
        int tempProd;
        for (int i = 1; i < size - 1; ++i) {
            tempProd = arr[i] * arr[i + 1];
            maxProd = tempProd > maxProd ? tempProd : maxProd;
        }
        System.out.println(maxProd);
    }
}