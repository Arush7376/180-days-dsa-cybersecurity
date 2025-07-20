public class MyStack {
    private int[] stack;
    private int top;
    private int capacity;

    public MyStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // 👇 Main Function to test the stack
    public static void main(String[] args) {
        MyStack s = new MyStack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display(); // Output: Stack elements: 10 20 30

        System.out.println("Top element is: " + s.peek()); // Output: 30

        s.pop();
        s.display(); // Output: Stack elements: 10 20

        System.out.println("Is stack empty? " + s.isEmpty()); // Output: false
    }
}
