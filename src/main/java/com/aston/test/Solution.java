package com.aston.test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> mem=new ArrayList<>();
        generator(new StringBuilder(),n,n,mem);
        return mem;
    }
    public void generator(StringBuilder series,int l,int r,List<String> mem){
        if (l==0&&r==0){
            mem.add(series.toString());
            return;
        }
        if (l>r)return;
        if (l>0){
            series.append('(');
            generator(series,l-1,r,mem);
            series.deleteCharAt(series.length()-1);
        }

        if (r>0){
            series.append(')');
            generator(series,l,r-1,mem);
            series.deleteCharAt(series.length()-1);
        }
    }



    public static void main(String[] args) {
        Solution solution=new Solution();
//        int[] arr=new int[]{42,11,1,97};
//        solution.countNicePairs(arr);
    }

}

