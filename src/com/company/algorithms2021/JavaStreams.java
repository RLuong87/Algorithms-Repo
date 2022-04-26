package com.company.algorithms2021;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) throws IOException {

        // Example 1. Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::println);
        System.out.println();

        // Example 2.
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(System.out::println);
        System.out.println();

        // Example 3. Get the sum
        System.out.println(
                IntStream
                        .range(1, 10)
                        .sum());
        System.out.println();

        // Example 4. Stream of, sorted and findFirst
        Stream.of("Ava", "Amanda", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // Example 5. Stream from Array, sort, filter and print
        String[] names = {"Harry", "Ron", "Hermione", "Drako", "Hagrid", "Sirius"};
        Arrays.stream(names) // Same as Stream.of(names)
                .filter(x -> x.startsWith("H"))
                .sorted()
                .forEach(System.out::println);

        // Example 6. average of squares of an int array
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        // Example 7. Stream from List, filter and print
        List<String> people = Arrays.asList("Harry", "Ron", "Hermione", "Drako", "Hagrid", "Sirius");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("h"))
                .forEach(System.out::println);

        // Example 8. Stream rows from text file, sort, filter and print
        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close();
    }
}
