package com.example.cicd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

/**
 * Basic smoke test that verifies the application prints the required message.
 */
class AppTest {

    @Test
    void mainPrintsExpectedMessage() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(output));
            App.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        assertEquals("CI/CD Pipeline Working Successfully", output.toString().trim());
    }
}
