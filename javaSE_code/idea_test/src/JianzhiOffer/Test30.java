package JianzhiOffer;

import java.util.Stack;

public class Test30 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int a = minStack.min();
        minStack.pop();
        int b = minStack.top();
        int c = minStack.min();

    }
}
//定义一个栈
class MinStack {
    Stack<Integer> A, B;
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }
    public void push(int x) {
        A.add(x);
        if(B.empty() || B.peek() >= x){
            B.add(x);
        }
    }
    public void pop() {
        //A已经出栈
        if(A.pop().equals(B.peek())){
            B.pop();
        }
    }
    public int top() {
        return A.peek();
    }
    public int min() {
        return B.peek();
    }
}
