package com.danielmontalvo.adventofcode.common;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputReader {
    public static List<String> readFileLines(String resourcePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (InputStream inputStream = InputReader.class.getClassLoader().getResourceAsStream(resourcePath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            if (inputStream == null) {
                throw new IOException("Resource not found: " + resourcePath);
            }
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}
