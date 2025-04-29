/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary_search;

/**
 *
 * @author lilli
 */
public class Binary_search {

    public static int binarySearch(int[] arr, int k){
        int low=0;
        int high=arr.length-1;
        
        while (high>=low){
            int middle = (low+high)/2;
            if (arr[middle] == k){
                return middle; //found key at middle
            } else if (k<arr[middle]){ //k is less than value in middle
                high=middle-1; //now search lower half of array
            }else{ //k is greaten than value in middle
                low=middle+1; //now search upper half of array
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {12,45,67,89};
        int[] nums2 = {12,45,67,89};
        System.out.println(binarySearch(nums,67));
        System.out.println(binarySearch(nums2,31));
        
    }
    
}
