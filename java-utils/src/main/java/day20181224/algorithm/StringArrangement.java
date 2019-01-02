package day20181224.algorithm;

/**
 * @authar nieChenLiang
 * @date 2018-12-24 10:18
 * 输入一个字符串，打印该字符串字符的所有排列
 */
public class StringArrangement {
    public static void main(String[] args) {
        char[] cs = {'a','b','c'};
        int length = cs.length;
        recursionSwap(cs,0,length);
    }

    public static void swap(char[] cs,int index1,int index2){
        char temp = cs[index1];
        cs[index1]=cs[index2];
        cs[index2]=temp;
    }

    public static void recursionSwap(char[] cs,int start,int length){
        if(start>=length-1){
            print(cs);
            return;
        }
        for(int i=start;i<length;i++){
            swap(cs,start,i);
            recursionSwap(cs,start+1,length);
            swap(cs,start,i);
        }
    }

    public static void print(char[] cs){
        for(int i=0;i<cs.length;i++){
            System.out.print(cs[i]);
        }
        System.out.println();
    }

}
