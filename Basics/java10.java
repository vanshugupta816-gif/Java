// **** ARRAY  **** //
public class java11 {
    public static void main(String[] args) {
        // search and element in an array

//        int arr[] = {1,4, 2, 55, 7, -2};
//        for(int i: arr){
//            if(i == 55){
//                System.out.println("Found");
//            }
//        }
        // find max element
//        int[] arr = new int[5];
//        arr[0] = 2;
//        arr[1] = 12;
//        arr[2] = 4322;
//        arr[3] = -32;
//        arr[4] = 22;
//        int res = Integer.MIN_VALUE;
//
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i] > res) {
//                res = arr[i];
//            }
//        }
//        System.out.println(res);

        // reverse print array
//        int[] arr = {1, 3, 43, 4, 345, 53, 5, 4};
//        for(int i = arr.length -1; i >= 0; i--) {
//            System.out.println(arr[i]);
//        }

        // sum of array
        int[] arr = {-2, 4, 55, -4, 11, -55, 11, -2};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
