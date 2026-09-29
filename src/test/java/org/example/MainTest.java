package org.example;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
public class MainTest {
    @Test
    public void testMainMethod() {
// Redirect standard output to capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
// Call the main method
        Main.main(new String[]{});
// Check if &quot;Hello and welcome!&quot; was printed
        assertEquals("Hello and welcome!", outContent.toString().trim());
// Reset standard output
        System.setOut(System.out);

    }
}