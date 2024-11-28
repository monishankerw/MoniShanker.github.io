package org.example.corejava.interview;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[]={1,2,5,4,6,7,3};
        int largest=arr[0];
        for (int num:arr){
            if(num>largest){
                largest=num;
            }
        }
        System.out.println(largest);
    }
}
