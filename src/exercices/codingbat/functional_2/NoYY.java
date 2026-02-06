package exercices.codingbat.functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public List<String> noYY(List<String> strings) {
        strings = strings.stream().map(string -> {
            return string + 'y';
        }).collect(Collectors.toList());
        strings.removeIf(string -> {
            return string.contains("yy");
        });
        return strings;
    }
}
