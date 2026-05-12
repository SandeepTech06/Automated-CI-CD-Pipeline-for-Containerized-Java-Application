package com.example.cicd;

/**
 * Entry point for the demo application used by the CI/CD pipeline.
 */
public final class App {

    private App() {
        // Prevent instantiation because this class is only used as a launcher.
    }

    /**
     * Prints the success message expected by the pipeline requirements.
     *
     * @param args command-line arguments, ignored by this sample application
     */
    public static void main(String[] args) {
        System.out.println("CI/CD Pipeline Working Successfully");
    }
}
