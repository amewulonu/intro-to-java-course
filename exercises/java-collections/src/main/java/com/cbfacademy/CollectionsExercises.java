package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // create an empty linked list
        LinkedList<Integer> list = new LinkedList<>();
        //  - add 4 as the first element of the list
        list.addFirst(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(9);
        //  - add another 2 as the last element of the list
        list.addLast(2);
        //  - add 4 as the 3rd element of the list
        list.add(2, 4);
         // Print the first element using element()
         System.out.print(list.element());
        //  - return the list
        return list;
        }

    public Stack<Integer> useStack() {
        // Create an empty stack
        Stack<Integer> stack = new Stack<>();
        //  - add 5, 6, 8, 9 to the stack
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(9);

       // Print the first element (bottom) and the last element (top)
       System.out.print(stack.firstElement()); // Bottom element
       System.out.print(stack.peek());         // Top element

       // Pop the top element and print it
       System.out.print(stack.pop());

       // Push 4 onto the stack
       stack.push(4);

       // Return the stack
       return stack;
        }

    public ArrayDeque<Integer> useArrayDeque() {
        // Create an empty ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add 5, 6, 8, 9 to the deque
        deque.add(5);
        deque.add(6);
        deque.add(8);
        deque.add(9);

        // Print the first and last elements
        System.out.print(deque.peekFirst()); // First element
        System.out.print(deque.peekLast());  // Last element

        // Poll the first element and print it
        System.out.print(deque.poll());

        // Get the first element using element() and print it
        System.out.print(deque.element());

        // Return the deque
        return deque;
    }

  
    public HashMap<Integer, String> useHashMap() {
        // Create an empty hash map
        HashMap<Integer, String> map = new HashMap<>();

        // Add entries to the map
        map.put(1, "TypeScript");
        map.put(2, "Kotlin");
        map.put(3, "Python");
        map.put(4, "Java");
        map.put(5, "JavaScript");
        map.put(6, "Rust");

        // Print the set of keys
        System.out.print(map.keySet());

        // Determine if the map contains "English" and print the result
        System.out.print(map.containsValue("English"));

        // Return the map
        return map;
    }


    public String getName() {
        return "Collections Exercises";
    }

    public static void main(String[] args) {
        CollectionsExercises exercises = new CollectionsExercises();

        System.out.println("LinkedList: " + exercises.useLinkedList());
        System.out.println("Stack: " + exercises.useStack());
        System.out.println("ArrayDeque: " + exercises.useArrayDeque());
        System.out.println("HashMap: " + exercises.useHashMap());
    }
}
