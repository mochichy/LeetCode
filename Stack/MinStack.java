public class MinStack {
    private Node front;
    
    public MinStack() {
    }
    
    public void push(int x) {
        if(front == null) {
            front = new Node(x, x);
        } else {
            front = new Node(x, Math.min(x, front.min),front);
        }
    }
    
    public void pop() {
        front = front.next;
    }
    
    public int top() {
        return front.val;
    }
    
    public int getMin() {
        return front.min;
    }
    
    private class Node {
        private int min;
        private int val;
        private Node next;
        
        private Node(int x, int min, Node next) {
            val = x;
            this.min = min;
            this.next = next;
        }
        
        private Node(int x, int min) {
            this(x, min, null);
        }
    }
}




Solution II

public class MinStack {
    
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    
    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int number) {
        stack.push(number);
        if(minStack.isEmpty()) {
            minStack.push(number);
        } else {
            minStack.push(Math.min(number, minStack.peek()));
        }
    }

    public int pop() { 
        minStack.pop();
        return stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
