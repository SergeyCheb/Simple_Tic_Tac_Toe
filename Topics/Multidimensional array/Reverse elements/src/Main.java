
class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; ++i) {
            int[] arr = new int[twoDimArray[i].length];
            for (int j = 0; j < arr.length; ++j) {
                arr[j] = twoDimArray[i][arr.length - 1 - j];
            }
            for (int j = 0; j < arr.length; ++j) {
                twoDimArray[i][j] = arr[j];
            }
        }
    }
}