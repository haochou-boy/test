package Leetcode;

public class Test13 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int num = 0;
        int preValue = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int nowValue = getValue(s.charAt(i));
            if(nowValue>preValue){
                num -= preValue;
            }else{
                num += preValue;
            }
            preValue = nowValue;
        }
        num += preValue;
        System.out.println(num);
    }
    public static int getValue(char ch){
        switch (ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }
}
