// **** ARRAY **** //
public class java12 {
    public static void main(String[] args) {
        // int[] arr = new int[3];
        int[][] arr = new int[3][3];
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.println(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
