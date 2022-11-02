package textPrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TextPrinter {
    private final ArrayList<String> myArrayList = new ArrayList<>();
    private boolean isRunning;

    public TextPrinter() {
        isRunning = true;
    }

    public void addToArrayList(String input) {
        if (input.equals("stop") || input.equals("Stop") || input.equals("STOP")) {
            isRunning = false;
        } else {
            myArrayList.add(input);
        }
    }

    public boolean getBoolean() {
        return isRunning;
    }

    public int getCountedChars() {
        int countChars = 0;
        for (String scanEntities : myArrayList) {
            countChars += scanEntities.length();
        }
        return countChars;
    }

    public int getCountedLines() {
        return myArrayList.size();
    }

    public int getCountedWords() {
        String text = myArrayList.toString();
        return text.split("\\s+").length; ////Skriver ut antal ord, separerade med blanksteg
    }

    public String getLongestWord() {
        String text = myArrayList.toString();
        return Arrays.stream(text.split(" "))
                .max(Comparator.comparingInt(String::length)) //Finds the longest word in the string: text
                .orElse(null).toString();
    }
}
