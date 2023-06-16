import java.util.*;

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
        System.out.println();

        // TODO 2. task
        Set<Integer> evens = new HashSet<>();
        Set<Integer> odds = new HashSet<>();

        for (Integer i : numbers) {
            if (i % 2 == 0) {
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

        System.out.println();

        // TODO 3. task
        Random random = new Random();
        List<Integer> dice = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            dice.add(random.nextInt(1, 7));
        }

        int sum = 0;
        for (Integer i : dice) {
            sum += i;
        }
        double average = (double) sum / dice.size();
        System.out.println("Rolls' average: " + average);

        for (int i = 1; i < 7; i++) {
            int rolled = 0;
            for (Integer j : dice) {
                if (i == j) {
                    rolled++;
                }
            }
            System.out.println(i + " rolled " + rolled + " times");
        }
        System.out.println();

        // TODO 4. task
        int[] numbersArray = {34808, 422, 334, 12014, 412617, 292389, 342260, 32244, 334534, 497721, 3775, 544,
                433, 55340, 257952, 1496173, 73, 539141, 3355, 305720, 3677429, 114047, 5656};

        Set<Integer> setOfNumbersArray = new HashSet<>();
        for (Integer i : numbersArray) {
            setOfNumbersArray.add(i);
        }

        if (setOfNumbersArray.size() == numbersArray.length) {
            System.out.println("There are no duplicates in the given array.");
        } else {
            System.out.println("There are duplicates in the given array.");
        }

        List<Integer> listOfNumbersArray = new ArrayList<>();

        for (int i : numbersArray) {
            listOfNumbersArray.add(digitCounter(i));
        }
        for (int i = 0; i < listOfNumbersArray.size(); i++) {
            System.out.println((i+1) + ". number's length: " + listOfNumbersArray.get(i) + " digits.");
        }

    }

    public static int digitCounter(int number) {
        int counter = 0;
        int tmp = 1;
        while (tmp < number) {
            counter++;
            tmp *= 10;
        }
        return counter;
    }
}