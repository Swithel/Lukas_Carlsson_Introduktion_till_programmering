package textPrinter;

import java.util.ArrayList;

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
}
