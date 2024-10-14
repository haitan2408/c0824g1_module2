package ss2_loop_array;


import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        int[] arr1 = {4,5,1,2,8,11,15,0};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
//        for(int item: arr) {
//            System.out.print(item + " ");
//            item = item * 2;
//        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] * 2;
        }
        System.out.println(Arrays.toString(arr1));

        double a,b;


    }
}
