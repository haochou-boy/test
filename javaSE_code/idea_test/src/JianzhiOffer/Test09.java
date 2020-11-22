package JianzhiOffer;

class Test09 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
//定义一个栈
class ArrayStack{
    //用数组模拟栈
    private int[] stack;
    //定义栈顶指针
    private int top = -1;
    //构造器
    public ArrayStack(){
        stack = new int[1000];

    }

    //栈空
    public boolean isEmpty(){
        return top == -1;
    }
    //入栈
    public void push(int value){
        top++;
        stack[top]=value;
    }

    //出栈
    public int pop(){
        //判断是否栈空
        if(isEmpty()){
            System.out.println(-1);
            return -1;
        }
        int temp = stack[top];
        top--;
        System.out.println(temp);
        return temp;
    }
    //遍历栈
    public void list(){
        if(isEmpty()){
            return;
        }
        for(int i = top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}