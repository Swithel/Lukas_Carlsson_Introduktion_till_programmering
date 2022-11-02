package textPrinter;

import java.util.Scanner;

public class TextPrinterMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TextPrinter myPrinter = new TextPrinter();

        System.out.println("""
                Välkommen till mitt Tecken och Rad program!

                Skriv in valfri text och tryck sedan på enter.
                Om du vill avsluta programmet skriv: stop
                """);

        while (myPrinter.getBoolean()) {
            System.out.println("Skriv in en text:");

            String text = scan.nextLine();

            myPrinter.addToArrayList(text);
        }
        int countChars = myPrinter.getCountedChars();
        int countLines = myPrinter.getCountedLines();
        int countWords = myPrinter.getCountedWords();
        String longestWord = myPrinter.getLongestWord();

        System.out.println("Du skrev: " + countChars + " antal tecken.");

        System.out.println("Du skrev: " + countLines + " antal rader.");

        System.out.println("Du skrev: " + countWords + " antal ord.");

        System.out.println("Det längsta ordet du skrev var: " + longestWord + "" +
                "\nOch är " + longestWord.length() + " tecken långt.");

    }
}
