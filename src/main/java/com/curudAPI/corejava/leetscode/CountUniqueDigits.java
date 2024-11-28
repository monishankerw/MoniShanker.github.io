package org.example.corejava.leetscode;

public class CountUniqueDigits {
public static int  countUniqueDigits(int n) {
	if(n==0) {
	return 1;
	
}
	int result =10;
	int uniqueDigit=9;
	int avabDigits=9;
	for(int i=2;i<=n&&avabDigits>0;i++) {
		uniqueDigit*=avabDigits;
		System.out.println("Unique Digits::"+uniqueDigit);
		result+=uniqueDigit;
	}
	return result;
}
public static void main(String[] args) {
	CountUniqueDigits results=new CountUniqueDigits();
	int n=3;
	int output =CountUniqueDigits.countUniqueDigits(n);
	System.out.println("Total sum of Results::"+output);
}
}
