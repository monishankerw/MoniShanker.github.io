package org.example.corejava.leetscode;

import java.util.Arrays;

public class MoveNegativeElementsOneSide {
    public static void main(String[] args) {
        int[] arr={-12,-6,5,8,7,-1};
        moveNegativeElementsOneSide(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveNegativeElementsOneSide(int[] arr) {
        int j=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<0){
                if (i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
    }
}
