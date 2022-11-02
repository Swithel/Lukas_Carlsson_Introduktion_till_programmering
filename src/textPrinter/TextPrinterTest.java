package textPrinter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextPrinterTest {

    @Test
    public void testCountedChars() {
        TextPrinter countChars = new TextPrinter();

        countChars.addToArrayList("Morot och potatis.");
        countChars.addToArrayList("test");
        countChars.addToArrayList("Jag har 3203 kronor.");
        countChars.addToArrayList("stop");

        int actual = countChars.getCountedChars();
        int expected = 42;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountedLines() {
        TextPrinter countLines = new TextPrinter();

        countLines.addToArrayList("Badkar");
        countLines.addToArrayList("Diskho");
        countLines.addToArrayList("12345");
        countLines.addToArrayList("");
        countLines.addToArrayList("stopp");
        countLines.addToArrayList("stop");

        int actual = countLines.getCountedLines();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountedTogether() {
        TextPrinter countTogether = new TextPrinter();

        countTogether.addToArrayList("I want to go away.");
        countTogether.addToArrayList("Bråttom är det ibland.");
        countTogether.addToArrayList("KAN DU HÄMTA?");
        countTogether.addToArrayList("100900900......");
        countTogether.addToArrayList("   ");
        countTogether.addToArrayList("stop");

        int actual1 = countTogether.getCountedChars();
        int actual2 = countTogether.getCountedLines();
        int expected1 = 71;
        int expected2 = 5;

        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }
}
