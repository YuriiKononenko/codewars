package tasks;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCodeDecoder {

    public static String decode(String morseCode) {
        List<String> wordByMorseChars = List.of(morseCode.strip().replaceAll(" {3}", "  ")
                .split(" "));
        final Map<String, String> morseAlphabet = getMorseDictionary();
        final List<String> decodedWord = new LinkedList<>();
        wordByMorseChars.forEach(it -> {
            if (it.equals("")) {
                decodedWord.add(" ");
            } else {
                decodedWord.add(morseAlphabet.get(it));
            }

        });
        return decodedWord.stream().map(String::valueOf).collect(Collectors.joining());
    }


    private static Map<String, String> getMorseDictionary() {
        final Map<String, String> morseAlphabet = new LinkedHashMap<>();
        morseAlphabet.put(".-", "A");
        morseAlphabet.put("-...", "B");
        morseAlphabet.put("-.-.", "C");
        morseAlphabet.put("-..", "D");
        morseAlphabet.put(".", "E");
        morseAlphabet.put("..-.", "F");
        morseAlphabet.put("--.", "G");
        morseAlphabet.put("....", "H");
        morseAlphabet.put("..", "I");
        morseAlphabet.put(".---", "J");
        morseAlphabet.put("-.-", "K");
        morseAlphabet.put(".-..", "L");
        morseAlphabet.put("--", "M");
        morseAlphabet.put("-.", "N");
        morseAlphabet.put("---", "O");
        morseAlphabet.put(".--.", "P");
        morseAlphabet.put("--.-", "Q");
        morseAlphabet.put(".-.", "R");
        morseAlphabet.put("...", "S");
        morseAlphabet.put("-", "T");
        morseAlphabet.put("..-", "U");
        morseAlphabet.put("...-", "V");
        morseAlphabet.put(".--", "W");
        morseAlphabet.put("-..-", "X");
        morseAlphabet.put("-.--", "Y");
        morseAlphabet.put("--..", "Z");
        morseAlphabet.put("-----", "0");
        morseAlphabet.put(".----", "1");
        morseAlphabet.put("..---", "2");
        morseAlphabet.put("...--", "3");
        morseAlphabet.put("....-", "4");
        morseAlphabet.put(".....", "5");
        morseAlphabet.put("-....", "6");
        morseAlphabet.put("--...", "7");
        morseAlphabet.put("---..", "8");
        morseAlphabet.put("----.", "9");
        morseAlphabet.put("···−−−···", "SOS");
        return morseAlphabet;
    }
}
