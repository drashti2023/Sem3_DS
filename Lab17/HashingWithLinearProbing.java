import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class HashingWithLinearProbing {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 20;
        final int VALUES_TO_INSERT = 15;
        int[] hashTable = new int[ARRAY_SIZE];
        boolean[] occupied = new boolean[ARRAY_SIZE]; // Track occupied slots
        HashSet<Integer> uniqueValues = new HashSet<>();
        Random random = new Random();

        // Generate 15 unique random values between 100000 and 999999
        while (uniqueValues.size() < VALUES_TO_INSERT) {
            int value = 100000 + random.nextInt(900000);
            uniqueValues.add(value);
        }

        // Insert values into the hash table using the specified hash function
        for (int value : uniqueValues) {
            int index = hashFunction(value);
            while (occupied[index]) {
                index = (index + 1) % ARRAY_SIZE; // Linear probing
            }
            hashTable[index] = value;
            occupied[index] = true;
        }

        // Display the final values of the hash table
        System.out.println("Final values in the hash table:");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (occupied[i]) {
                System.out.println("Index " + i + ": " + hashTable[i]);
            } else {
                System.out.println("Index " + i + ": (empty)");
            }
        }
    }

    // Hash function H(x) = (x mod 18) + 2
    private static int hashFunction(int x) {
        return (x % 18) + 2;
    }
}
