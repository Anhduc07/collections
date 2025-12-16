package collections.Stack;

import java.util.Stack;

public class StackPut {
    public  static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    stack.push("Java");
    stack.push("Python");
    stack.push("C++");
    stack.push("C#");
    stack.push("PHP");

    System.out.println("Initial Stack"+stack);

    // lấy phần tử khỏi stack
    System.out.println("The element at the top of the" + " stack is: " + stack.peek());

    // removing elements from the stack
     System.out.println("Popped element:" + stack.pop());
     System.out.println("Popped element: " + stack.pop());

     System.out.println("Is stack empty? " + stack.empty());
        // Pop remaining elements (loại bỏ các phần tử còn lại)
        stack.pop();
        stack.pop();
        stack.pop();

     // Check if the stack is empty

        System.out.println("Is stack empty? "
                + stack.empty());

        System.out.println("Final Stack: " + stack);
    }
}
