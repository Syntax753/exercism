import java.util.List;
import java.util.stream.Collectors;

class Anagram {

    private String sortedWord;
    private String word;

    public Anagram(String word) {
        this.word = word;
        this.sortedWord = sort(word);
    }

    public List<String> match(List<String> words) {
        return words.stream().filter(w -> sortedWord.equals(sort(w))).collect(Collectors.toList());
    }

    private String sort(String toSort) {
        return toSort.toLowerCase().chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}