package problems.stack;

public class MinStack {

    public static void main(String[] args) {
        MinStack a = new MinStack();
        a.push(10);
    }
    int size;
    Node top;
    class Node {
        public Node(int val) {
            this.val = val;
        }
        int val;
        int min;
        Node next;
    }

    public MinStack() {
        size = 0;
    }

    public void push(int val) {
        Node newNode = new Node(val);
        if(top == null) {
            top = newNode;
            top.min = val;
            return;
        }
        newNode.min = Math.min(val, top.min);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if(top == null) {
            return;
        }
        if(top.next == null) {
            top = null;
        } else {
            Node newTop = top.next;
            top.next = null;
            top = newTop;
        }
    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        if(top != null) {
            return top.min;
        }

        return -1;
    }
}
