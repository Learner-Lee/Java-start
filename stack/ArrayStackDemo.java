package stack;

public class ArrayStackDemo {
    public static void main(String[] args) {

    }
}
// 定义一个 ArrayStack类，表示栈。
class ArrayStack{
    private int maxSize; // 栈的大小
    private int[] stack; // 数组模拟栈，数据放在数组中。
    private int top = -1; // top表示栈顶，初始化为-1。

    // 构造器
    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    // 栈满
    public boolean isFull(){
        return top == maxSize - 1;
    }
    //栈空
    public  boolean isEmpty(){
        return top == -1;
    }

    // 入栈-push
    public void push(int value){
        // 先判断栈是否满
        if (isFull()) {
            System.out.println("栈满");
            return; // 终止方法
        }
        top++;
        stack[top] = value;
    }

    // 出栈-pop,将栈顶的数据返回。
    public int pop(){
        // 判断栈是否为空
        if (isEmpty()) {
            // 抛出异常
            throw new RuntimeException("栈内没有数据");
        }
        int value = stack[top];
        top--;
        return value ;
    }

    // 显示栈的情况【遍历栈】,遍历时，需要从栈顶开始显示数据。
    public void list(){
        if (isEmpty()) {
            System.out.println("栈空，没有数据");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d] = %d",i,stack);
        }
        
    }

}