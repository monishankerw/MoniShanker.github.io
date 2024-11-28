package org.example.corejava.arrays.sorthingAlgorithm.bubbleSorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,3,1,5,6,4};
        bubbleSorting(arr);
        for (int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void bubbleSorting(int[] arr) {
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
