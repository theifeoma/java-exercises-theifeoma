package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list

        LinkedList<Integer> lists = new LinkedList<>();
        //  - add 4 as the first element of the list
        lists.add(4);
        //  - then add 5, 6, 8, 2, 9 to the the list
        lists.add(5);
        lists.add(6);
        lists.add(8);
        lists.add(2);
        lists.add(9);
        //  - add another 2 as the last element of the list
        lists.add(2);
        //  - add 4 as the 3rd element of the list
        lists.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
        System.out.println(lists.element());
        //  - return the list
        return lists;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> stacks = new Stack<>();

        //  - add 5, 6, 8, 9 to the the stack
        stacks.add(5);
        stacks.add(6);
        stacks.add(8);
        stacks.add(9);
        //  - print the first element of the stack on the screen
        System.out.print(stacks.get(0));
        //  - print the last element of the stack on the screen
        System.out.print(stacks.get(3));
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(stacks.pop());
        //  - invoke the push(4) method on the stack
        stacks.push(4);
        //  - return the stack
        return stacks;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque

        ArrayDeque<Integer> arrays = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the the stack
        arrays.add(5);
        arrays.add(6);
        arrays.add(8);
        arrays.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(arrays.peek());
        //  - print the last element of the queue on the screen
        System.out.print(arrays.getLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(arrays.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(arrays.element());
        //  - return the queue
        return arrays;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> hashmaps = new HashMap<>();

        //  - add {1, TypeScript} entry to the map
        hashmaps.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
        hashmaps.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        hashmaps.put(3, "Python");
        //  - add {4, Java} entry to the map
        hashmaps.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        hashmaps.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        hashmaps.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(hashmaps.keySet());
        //  - determine the set of value from the map and print it on the screen
        System.out.print(hashmaps.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(hashmaps.containsValue("English"));
        //  - return the map
        return hashmaps;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
