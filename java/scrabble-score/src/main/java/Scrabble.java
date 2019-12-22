import java.util.Map;

import static java.util.Map.entry;

public class Scrabble {
    private static final Map<Character, Integer> SCORES = Map.ofEntries(
            entry('a', 1),
            entry('e', 1),
            entry('i', 1),
            entry('o', 1),
            entry('u', 1),
            entry('l', 1),
            entry('n', 1),
            entry('r', 1),
            entry('s', 1),
            entry('t', 1),
            entry('d', 2),
            entry('g', 2),
            entry('b', 3),
            entry('c', 3),
            entry('m', 3),
            entry('p', 3),
            entry('f', 4),
            entry('h', 4),
            entry('v', 4),
            entry('w', 4),
            entry('y', 4),
            entry('k', 5),
            entry('j', 8),
            entry('x', 8),
            entry('q', 10),
            entry('z', 10)
    );
    private final int score;

    Scrabble(String word) {
        this.score = word.toLowerCase()
                .codePoints()
                .mapToObj(c -> (char) c)
                .mapToInt(SCORES::get)
                .sum();
    }

    int getScore() {
        return this.score;
    }

}
