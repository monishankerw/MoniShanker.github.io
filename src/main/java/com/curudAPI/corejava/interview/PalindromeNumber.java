package org.example.corejava.interview;

public class PalindromeNumber {
    public static void main(String[] args) {
        int rev=0,num=12321,org_num=num;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(org_num==rev){
            System.out.println("Palindrome Number:");
        }else {
            System.out.println("Not Palindrome number:");
        }
    }
}
