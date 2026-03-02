/**
 * OOPSBannerApp UC6 – Refactor Banner Logic into Functions
 *
 * This version improves UC5 by moving the banner patterns for each letter
 * into dedicated static helper methods (O, P, S). The main method calls these
 * methods and prints the banner using a loop.
 */
public class OOPSBannerApp {

    // Pattern for letter 'O' (9-char width, 7 lines)
    public static String[] getOPattern() {
        return new String[] {
            String.join("", "  *****  "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", "  *****  ")
        };
    }

    // Pattern for letter 'P' (9-char width, 7 lines)
    public static String[] getPPattern() {
        return new String[] {
            String.join("", " ******  "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " ******  "),
            String.join("", " **      "),
            String.join("", " **      "),
            String.join("", " **      ")
        };
    }

    // Pattern for letter 'S' (9-char width, 7 lines)
    public static String[] getSPattern() {
        return new String[] {
            String.join("", "  *****  "),
            String.join("", " **   ** "),
            String.join("", " **      "),
            String.join("", "  *****  "),
            String.join("", "       **"),
            String.join("", " **   ** "),
            String.join("", "  *****  ")
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Print: O O P S
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + " " + o[i] + " " + p[i] + " " + s[i]);
        }
    }
}