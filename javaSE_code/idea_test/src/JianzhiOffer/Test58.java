package JianzhiOffer;

public class Test58 {
    public static void main(String[] args) {
        String s1 = "a good   example";
        s1 = s1.trim();
        //定义双指针
        int j = s1.length()-1;
        int i = j;
        StringBuilder res = new StringBuilder();
        //加入i<0退出循环
        while(i>=0){
            while(i >= 0 && s1.charAt(i) != ' '){
                i--;
            }
            //s1.substring(i+1,j+1)包含i+1，不包含j+1
            res.append(s1.substring(i+1,j+1)+' ');
            while(i>=0 && s1.charAt(i) == ' '){
                i--;
            }
            j=i;
        }
        System.out.println(res.toString().trim());

    }
/*    public static String reverseWords(String s) {
        String s2 = "";
        //"\\s"是一个正则表达式，其中“\\”表示的空白字符，“+”表示一次或多次出现
        String[] s1=s.trim().replaceAll("\\s+"," ").split(" ");
        for(int i = s1.length-1;i>=0;i--){
            if(i==0){
                s2 += s1[i];
            }else{
                s2 += s1[i]+" ";
            }
        }
        return s2;*/



}
