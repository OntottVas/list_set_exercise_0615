import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // TODO 1. task
        int[] numbers = {1, 2, 7, 2, 3, 4, 10, 8, 9, 11, 5, 4, 3, 6, 5, 6, 5, 1, 8, 10, 9, 15};

        Set<Integer> setOfNumbers = new HashSet<>();
        for (Integer i : numbers) {
            setOfNumbers.add(i);
        }

        System.out.println("Amount of different numbers in the set: " + setOfNumbers.size());

        for (Integer i : setOfNumbers) {
            System.out.print(i + " ");
        }

        System.out.println();

        // TODO 2. task
        Set<Integer> evens = new HashSet<>();
        Set<Integer> odds = new HashSet<>();

        for (Integer i : numbers) {
            if(i % 2 == 0) {
                evens.add(i);
            } else {
                odds.add(i);
            }
        }

        for (Integer i : evens) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (Integer i : odds) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Amount of different even numbers: " + evens.size());
        System.out.println("Amount of different odd numbers: " + odds.size());
    }
}