import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = scanner.nextInt();
        }
        int longest = 1;
        int curLen = 1;
        for (int i = 0; i < size - 1; ++i) {
            if (arr[i] < arr[i + 1]) {
                ++curLen;
            } else {
                longest = longest < curLen ? curLen : longest;
                curLen = 1;
            }
            if (longest < curLen) {
                longest = curLen;
            }
        }
        System.out.println(longest);
    }
}