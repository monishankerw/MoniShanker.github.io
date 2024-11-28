package org.example.corejava.interview;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153, sum = 0, r;
        int org_num = num;

        while (num != 0) {
            r = num % 10;
            sum = sum + (r * r * r);  // Calculate the cube of each digit and add to sum
            num = num / 10;
        }

        if (org_num == sum) {
            System.out.println(org_num + " is an Armstrong Number");
        } else {
            System.out.println(org_num + " is Not an Armstrong Number");
        }
    }
}
