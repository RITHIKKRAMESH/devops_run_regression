package org.example;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMainMethod() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            System.setOut(new PrintStream(outContent));

            Main.main(new String[]{});

            String expected = "Hello and welcome!" + System.lineSeparator();

            assertEquals(expected, outContent.toString());

        } finally {
            System.setOut(originalOut);
        }
    }
}