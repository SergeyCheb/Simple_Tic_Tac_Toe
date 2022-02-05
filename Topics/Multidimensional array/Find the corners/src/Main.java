
class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; ++i) {
            if (twoDimArray.length == 1) {
                System.out.println(twoDimArray[0][0] + " " + twoDimArray[0][twoDimArray[i].length - 1]);
                System.out.println(twoDimArray[0][0] + " " + twoDimArray[0][twoDimArray[i].length - 1]);
                break;
            }
            if (i == 0 || i == twoDimArray.length - 1) {
                System.out.println(twoDimArray[i][0] + " " + twoDimArray[i][twoDimArray[i].length - 1]);
            }
        }
    }
}

