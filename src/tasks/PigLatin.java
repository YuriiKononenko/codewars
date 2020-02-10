import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PigLatin {

    public static String pigIt(String str) {
        return Stream.of(str.split(" "))
                .map(PigLatin::placeFirstLetterToTheEnd)
                .collect(Collectors.joining(" "));
    }

    private static String placeFirstLetterToTheEnd(String word) {
        for (int i = 0; i < word.length(); i++) {
            String character = word.substring(i, i + 1);
            if (!character.matches("\\W")) {
                String wordWithoutFirst = word.replaceFirst(character, "");
                word = wordWithoutFirst + character + "ay";
                break;
            }
        }
        return word;
    }

}
