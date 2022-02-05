import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr;
        String str = scanner.nextLine();
        int shift = scanner.nextInt();
        strArr = str.split(" ");
        int size = strArr.length;
        int[] intArr = new int[size];
        for (int i = 0; i < size; ++i) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        int[] resArr = new int[size];
        shift %= size;
        System.arraycopy(intArr, 0, resArr, shift, size - shift);
        System.arraycopy(intArr, size - shift, resArr, 0, shift);
        for (int i : resArr) {
            System.out.print(i + " ");
        }
    }
}