package collection.map;

import java.util.HashMap;
import java.util.Map;
public class HashMapWithMethods {

    // 1. Method to add students to the map
    public static void initializeMap(HashMap<String, Integer> map) {
        map.put("Alice", 90);
        map.put("Bob", 85);
        map.put("Charlie", 92);
        map.put("Diana", 78);
    }

    // 2. Method to display a specific student's grade
    public static void checkGrade(HashMap<String, Integer> map, String name) {
        if (map.containsKey(name)) {
            System.out.println("Result -> " + name + "'s grade is: " + map.get(name));
        } else {
            System.out.println("Result -> " + name + " not found in the records.");
        }
    }

    // 3. Method to update a student's grade
    public static void updateGrade(HashMap<String, Integer> map, String name, int newGrade) {
        if (map.containsKey(name) ) {
            map.put(name, newGrade); // Overwrites the old value
            System.out.println("System -> Updated on " + name + "'s grade to " + newGrade);
        } else {
            System.out.println("System -> Cannot update. " + name + " does not exist.");
        }
    }

    // 4. Method to print the entire map cleanly
    public static void printAllRecords(HashMap<String, Integer> map) {
        System.out.println("\n--- Current Student Records ---");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Student: " + entry.getKey() + " | Grade: " + entry.getValue());
        }
        System.out.println("--------------------------------");
    }

    // Main method to drive the program
    public static void main(String[] args) {
        // Create the map container
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Call the methods one by one
        System.out.println("Step 1: Initialising data...");
        initializeMap(studentGrades);
        printAllRecords(studentGrades);

        System.out.println("Step 2: Searching for a record...");
        checkGrade(studentGrades, "Charlie");
        checkGrade(studentGrades, "Evan"); // Testing a missing key

        System.out.println("\nStep 3: Updating a record...");
        updateGrade(studentGrades, "Bob", 88);
        printAllRecords(studentGrades);
    }
}

