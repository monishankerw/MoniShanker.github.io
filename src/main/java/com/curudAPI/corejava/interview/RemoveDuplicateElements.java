package org.example.corejava.interview;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int arr[]={2,2,3,4,5,6,4,3,1,5,7};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);
            }
        }
    }



} //output:2,3,4,5,1
