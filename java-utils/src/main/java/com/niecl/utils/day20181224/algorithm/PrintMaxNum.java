package com.niecl.utils.day20181224.algorithm;

import java.util.Arrays;

/**
 * @authar nieChenLiang
 * @date 2018-12-24 10:37
 * 输入一个正整数数组、拼接成一个数、打印拼接数中最小的一个数
 */
public class PrintMaxNum {
    public static void main(String[] args) {
        int[] num={1,5,9,13,442,44,6,21,211};
        qsort(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
        String str="";
        for (int i = 0; i <num.length ; i++) {
            str+=num[i];
        }
        System.out.println(str);
    }

    public static void qsort(int[] num,int left,int right){
        if(left<right){
            int partition = partition(num,left,right);
            qsort(num,left,partition-1);
            qsort(num,partition+1,right);
        }
    }

    public static int partition(int[] num,int left,int right){
        int partition = num[left];
        while(left<right){
            while((num[right]==partition || isMBigerThanN(num,num[right],partition)) && left<right){
                right--;
            }
            swap(num,left,right);
            while((num[left]==partition || isMBigerThanN(num,partition,num[left])) && left<right){
                left++;
            }
            swap(num,left,right);
        }

        return left;
    }

    public static void swap(int[] num,int m,int n){
        int temp = num[m];
        num[m]=num[n];
        num[n]=temp;
    }

    public static boolean isMBigerThanN(int[] num,int m,int n){
        String num1 = String.valueOf(m);
        String num2 = String.valueOf(n);

        int temp1 = Integer.parseInt(num1+num2);
        int temp2 = Integer.parseInt(num2+num1);

        if(temp1>temp2){
            return true;
        }
        else{
            return false;
        }
    }
}
