package Text04_数组;

import java.util.Arrays;
import java.util.Scanner;

public class _二分查找法 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(myBinarySearch(arr,7));
        System.out.println(arr.length);
    }

    public static int myBinarySearch(int[] arr,int value) {
        int low=0;
        int high=arr.length-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(value==arr[mid]) {
                return mid;
            }
            if(value>arr[mid]) {
                low=mid+1;
            }
            if(value<arr[mid]) {
                high=mid-1;
            }

        }

        return -1;//没有找到返回-1
    }
}
