package ListInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // creating the stack
        Stack<Integer> stack = new Stack<>();

        // push() - insert element at the top
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("\n========== STACK USING THE STACK CLASS ==========");
        System.out.println("\nThe Initial Stack: \n" + stack);

        // peek() - checks the top element without removing it
        int top = stack.peek();
        System.out.println("\nThe Top Element in the Stack is: \n" + top);

        // pop() - removes the top element
        int removed = stack.pop();
        System.out.println("\nThe Removed top element in the Stack: \n" + removed);
        System.out.println("\nThe Stack after removing the top element: \n" + stack);

        // isEmpty() - checks for the stack empty
        System.out.println("\nIs the Stack is Empty? \n" + stack.isEmpty());

        // size() - returns the size of the stack
        System.out.println("\nThe size of the Stack is: \n" + stack.size());

        // search() - searches the particular element in the stack
        System.out.println("\nIs the Specified Element is Present on Stack?");
        int search = stack.search(30);
        if (search != -1) {
            System.out.println("Yes! The Element is found at the index " + search);
        }
        else {
            System.out.println("No! The Element is not Found at the Stack! \n" + search);
        }

        // stack creation using deque
        Deque<Integer> deque = new ArrayDeque<>();

        // performing the same stack operations

        // push() - insert element at the top
        deque.push(10);
        deque.push(20);
        deque.push(30);
        deque.push(40);
        deque.push(50);
        System.out.println("\n========== STACK USING DEQUE ==========");
        System.out.println("\nThe Initial Stack: \n" + deque);

        // peek() - checks the top element without removing it
        System.out.println("\nThe Top Element in the Stack is: \n" + deque.peek());

        // pop() - removes the top element
        deque.pop();
        System.out.println("\nThe Stack after removing the top element: \n" + deque);

        // isEmpty() - checks for the stack empty
        System.out.println("\nIs the Stack is Empty? \n" + deque.isEmpty());

        // size() - returns the size of the stack
        System.out.println("\nThe size of the Stack is: \n" + deque.size());

        // contains() - searches the element in the deque
        System.out.println("\nIs the specified element is present inside the deque? \n" +deque.contains(30));
    }
}