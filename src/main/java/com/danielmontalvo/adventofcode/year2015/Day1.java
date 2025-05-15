package com.danielmontalvo.adventofcode.year2015;

import com.danielmontalvo.adventofcode.common.InputReader;
import java.io.IOException;
import java.util.List;

public class Day1 {
    public static void main(String[] args) {
        try {
            List<String> lines = InputReader.readFileLines("year-2015/day-1-input-1.txt");
            if (lines.isEmpty()) {
                System.err.println("No lines in file.");
                return;
            }
            // Get the first line and convert to an array of chars
            String firstLine = lines.getFirst();
            char[] characters = firstLine.toCharArray();
            int currentFloor = 0;

            // Checks the input and calculates the floor based on '(' or ')'
            for (char c : characters) {
                if (c == '(') {
                    currentFloor++;
                } else if (c == ')') {
                    currentFloor--;
                }
            }

            // Prints the result
            System.out.println("The current floor is: " + currentFloor);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
