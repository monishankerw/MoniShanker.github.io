package org.example.corejava.leetscode;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public static void main(String[] args) {
        GrayCode grayCode=new GrayCode();
        int n=2;
      List<Integer>output=  grayCode.grayCode(n);
        System.out.println(output);
    }
    public List<Integer> grayCode(int n) {
List<Integer>result=new ArrayList<>();
result.add(0);
for (int i=0;i<n;i++){
    int size= result.size();
    for (int j=size-1;j>=0;j--){
        result.add(result.get(j)|(1<<i));
    }
}
        return result;
    }
}
