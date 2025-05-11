package com.danielmontalvo.adventofcode.year2015;

import com.danielmontalvo.adventofcode.common.InputReader;
import java.io.IOException;
import java.util.List;

public class Day1 {
    public static void main(String[] args) {
        try {
            List<String> lines = InputReader.readFileLines("year-2015/day-1-input-1.txt");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
