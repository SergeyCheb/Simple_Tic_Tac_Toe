import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] box1 = new int[3];
        for (int i = 0; i < box1.length; ++i) {
            box1[i] = scanner.nextInt();
        }
        int[] box2 = new int[3];
        for (int i = 0; i < box2.length; ++i) {
            box2[i] = scanner.nextInt();
        }
        Arrays.sort(box1);
        Arrays.sort(box2);
        int res = 0;
        for (int i = 0; i < box1.length; ++i) {
            res = box1[i] < box2[i] ? -1 : 0;
            if (res == 0) {
                break;
            }
        }
        if (res == 0) {
            for (int i = 0; i < box1.length; ++i) {
                res = box1[i] > box2[i] ? 1 : 0;
                if (res == 0) {
                    break;
                }
            }
        }
        if (res == -1) {
            System.out.println("Box 1 < Box 2");
        } else if (res == 1) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}