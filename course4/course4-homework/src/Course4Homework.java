import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course4Homework {
    public static void main(String[] args) throws Exception {
        // Task 1 pattern
        String text = "It is a long established fact that a reader will be distracted";
        Pattern pattern = Pattern.compile("\\b[EeYyUuIiOoAa][A-Za-z]+\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

        // Task 2 pattern
        text = "My number is 80447379801 or +375(44)7379801";
        pattern = Pattern.compile("([80][\\d]{10})|(\\+375\\(\\d{2}\\)\\d{7})");
        matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

        // Task 3 pattern
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed orci quam, vehicula ut velit in, accumsan blandit lorem. Vivamus interdum faucibus ipsum. Sed dictum ornare semper. Proin et tincidunt neque. Nullam elit leo, facilisis sit amet quam quis, scelerisque tristique ex. Phasellus suscipit in mauris sed sodales. Integer condimentum eget nulla at maximus.";
        String fixedText = "";
        pattern = Pattern.compile("[A-Za-z]+[.]?");
        matcher = pattern.matcher(text);
        while (matcher.find()) {
            fixedText = fixedText.concat(text.substring(matcher.start(), matcher.end()));
        }
        // System.out.println(fixedText);
        String[] sentences = fixedText.split("[.!?]\\s*");
        Arrays.sort(sentences, Comparator.comparingInt(String::length));
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }
}
