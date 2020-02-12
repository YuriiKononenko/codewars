import java.util.ArrayList;
import java.util.List;

public class Snail {

    public static int[] snail(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        List<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < columns + rows - 1; i++) {
            //LEFT RIGHT
            for (int m = i; m < columns - i; m++) {
                finalList.add(array[i][m]);
            }
            //TOP TO BOTTOM
            for (int j = i + 1; j < rows - i; j++) {
                finalList.add(array[j][columns - 1 - i]);
            }
            //RIGHT-LEFT
            for (int k = columns - 2 - i; k >= i; k--) {
                finalList.add(array[rows - 1 - i][k]);
            }
            //BOTTOM TOP
            for (int n = rows - 2 - i; n > i; n--) {
                finalList.add(array[n][i]);
            }
        }
        
        return finalList.stream().mapToInt(Integer::intValue).toArray();
    }

}
