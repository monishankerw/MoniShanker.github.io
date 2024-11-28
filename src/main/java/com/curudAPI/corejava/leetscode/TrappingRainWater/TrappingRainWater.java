//package org.example.corejava.leetscode.TrappingRainWater;
//
//public class TrappingRainWater {
//    public static void main(String[] args) {
//        int [] height={0,1,0,2,1,0,1,3,2,1,2,1};
//        TrappingRainWater result=new TrappingRainWater();
//        int output=result.trappingRainWater(height);
//        System.out.println("Maximum Trapping Rain Water:"+output);
//    }
///*
//
// */
//    private int trappingRainWater(int[] height) {
//        /*
//      1.  check array null or as no elements,there can be no trapped water
//         then return o
//         */
//        if (height == null || height.length == 0)
//            return 0;
//       /*
//       2.Two pointers are initialized:
//       left starts at the beginning of the array and right starts at the end.
//        These pointers will help us traverse the elevation map from both sides.
//        */
//        int left = 0, right = height.length - 1;
//
//        /*
//        3. These variables store the maximum heights encountered from the left and right sides.
//         They will help in calculating how much water can be trapped at each point.
//         */
//        int leftMax = 0, rightMax = 0;
//
//        /*
//        4. This variable stores the total amount of water trapped. It is initialized to 0.
//         */
//        int max = 0;
//
//        /*
//        5.This is the main loop.
//        It continues until the left and right pointers meet.
//         The idea is to process both sides of the elevation map simultaneously.
//         */
//        while (left < right) {
//
//            /*
//         6.If the height of the current left pointer is less than the height of the current right pointer,
//          this means the amount of water trapped depends on the left side. We process the left side first in this case.
//             */
//            if (height[left] < height[right]) {
//                if (height[left] >= leftMax) {
//                    leftMax = height[left];
//                }
//            }
//        }
//    }
//}
