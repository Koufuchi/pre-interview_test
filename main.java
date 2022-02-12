
import java.util.EmptyStackException;

public class main {

    // 第一題
    public int fibonacci(int position){
        if(position==0) return 0;
        if(position==1 || position==2) return 1;
        // 存目前的數和前一個數
        int curr=1, prev=1;
        for(int i=3; i<=position; i++){
            // 算出當前的數，並更新前一個數
            int sum = curr+prev;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

    // 第二題
    public class StackUsingLinkedlist {

        // 定義節點
        private class Node {
            int val; 
            Node next; 
        }
    
        // size 變數存此堆疊內所有元素數量
        private int size;
    
        // top 變數用來存此堆疊最上層的節點
        private Node top;
    
        // 建構子
        StackUsingLinkedlist(){
            this.top = null;
            this.size = 0;
        }
    
        public int size(){
            return size;
        }
    
        public void push(int x) {	
            // 定一個 temp 節點來存輸入的數
            Node temp = new Node();
            temp.val = x;
            // 用此節點來指向 top，並更新 top 為此節點
            temp.next = top;
            top = temp;
            size++;
        }
    
        public int pop() {
    
            if(size==0){
                // 若對空堆疊做 pop，則拋出異常
                throw new EmptyStackException();
            }
    
            int temp = top.val;
            // 直接把 top 改為 top 的下一個節點
            top = top.next;
            size--;
            return temp;	
        }
    }
}

class Testmain {
    public static void main(String[] args){
        // 第一題測試
        main obj = new main();
        for(int i=0; i<5; i++){
            System.out.println("fibonacci("+i+") = "+obj.fibonacci(i));
        }

        // 第二題測試
        main.StackUsingLinkedlist stack = obj.new StackUsingLinkedlist();
        stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.size());
    }
} 


