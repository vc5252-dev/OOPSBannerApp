/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This version improves UC4 by declaring and initializing
 * the String array in a single statement using String.join()
 * inside the array literal.
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization with String.join()
        String[] lines = {
            String.join("", "  *****   ", "  *****   ", " ******   ", "  *****   "),
            String.join("", " **   **  ", " **   **  ", " **   **  ", " **   **  "),
            String.join("", " **   **  ", " **   **  ", " **   **  ", " **       "),
            String.join("", " **   **  ", " **   **  ", " ******   ", "  *****   "),
            String.join("", " **   **  ", " **   **  ", " **       ", "       ** "),
            String.join("", " **   **  ", " **   **  ", " **       ", " **   **  "),
            String.join("", "  *****   ", "  *****   ", " **       ", "  *****   ")
        };

        // Enhanced for loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}