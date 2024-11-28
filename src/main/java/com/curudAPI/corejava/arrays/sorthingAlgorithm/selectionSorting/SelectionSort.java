package org.example.corejava.arrays.sorthingAlgorithm.selectionSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={65,11,22,32,43};
        for (int i=0;i<arr.length;i++) {
            System.out.println("Unsorted Elements:" + arr[i]);
        }
            selectionSort(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.println("Sorted Elements:" + arr[i]);
        }
        }



    private static void selectionSort(int[] arr) {
int n=arr.length;
for (int i=0;i<n-1;i++){
    int minIndex=i;
    for(int j=i+1;j<n;j++){
        if(arr[j]<arr[minIndex]){
            minIndex=j;
        }
    }
    int temp=arr[minIndex];
    arr[minIndex]=arr[i];
    arr[i]=temp;

}
    }
}
