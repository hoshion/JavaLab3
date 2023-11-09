package org.example;

import java.util.List;
import java.util.stream.Stream;

public class Lab {

    public final int cardNumber = 1130;

    private final int C3 = cardNumber % 3; // 2
    private final int C17 = cardNumber % 17; // 8

    public List<String> calc(String text, String symbol) throws Exception {
        if (symbol.length() != 1) {
            throw new Exception("symbol is not a symbol");
        }
        if (text.isEmpty()) {
            throw new Exception("text is empty");
        }
        String[] words = text.split("[ \t.,\n\r]+");

        return Stream.of(words).sorted((s1, s2) -> {
           int s1Length = s1.length() - s1.replace(symbol, "").length();
           int s2Length = s2.length() - s2.replace(symbol, "").length();
           if (s1Length == s2Length) return s2.length() - s1.length();
           return s1Length - s2Length;
        }).toList();
    }
}
