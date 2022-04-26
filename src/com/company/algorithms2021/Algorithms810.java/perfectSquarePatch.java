import java.util.Arrays;

public class PerfectSquarePatch {

    public int[][] squarePatch(int n) {

        int[][] squares = new int[n][n];

        for (int[] sq : squares) {
            Arrays.fill(sq, n);
        }
        return squares;
    }
}