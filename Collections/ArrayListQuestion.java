// ArrayList Practice Question
// Topic: Working with ArrayList in Java

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListQuestion {
    
    public static void main(String[] args) {
        
        // 1. Create and add elements to ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(23);
        numbers.add(56);
        numbers.add(89);
        numbers.add(34);
        numbers.add(67);
        
        System.out.println("Original List: " + numbers);
        System.out.println("Size: " + numbers.size());
        
        // 2. Find Maximum and Minimum
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("\nMaximum: " + max);
        System.out.println("Minimum: " + min);
        
        // 3. Remove all even numbers
        ArrayList<Integer> numbersCopy = new ArrayList<>(numbers);
        numbersCopy.removeIf(n -> n % 2 == 0);
        System.out.println("\nAfter removing even numbers: " + numbersCopy);
        
        // 4. Sort in descending order
        ArrayList<Integer> descendingList = new ArrayList<>(numbers);
        Collections.sort(descendingList, Collections.reverseOrder());
        System.out.println("\nSorted (Descending): " + descendingList);
        
        // 5. Find second largest element
        ArrayList<Integer> sorted = new ArrayList<>(numbers);
        Collections.sort(sorted);
        System.out.println("\nSecond largest element: " + sorted.get(sorted.size() - 2));
        
        // 6. Check if list contains specific element
        int searchElement = 56;
        boolean contains = numbers.contains(searchElement);
        System.out.println("\nList contains " + searchElement + ": " + contains);
        
        // Additional Operations
        System.out.println("\n===== Additional Operations =====");
        
        // Get element at index
        System.out.println("Element at index 3: " + numbers.get(3));
        
        // Find index of element
        System.out.println("Index of 78: " + numbers.indexOf(78));
        
        // Check if empty
        System.out.println("Is list empty: " + numbers.isEmpty());
        
        // Clear the list
        ArrayList<Integer> tempList = new ArrayList<>(numbers);
        tempList.clear();
        System.out.println("After clear, is empty: " + tempList.isEmpty());
    }
}

