import java.util.HashMap;

public class OOPSBannerApp {

    // Create and populate the map of character -> 7-line ASCII pattern
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        charMap.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        // Optional but smart: space fallback so printing doesn't crash
        charMap.put(' ', new String[]{
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        });

        return charMap;
    }

    // Render the banner for the given message
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        // pattern height (assumes all patterns same height)
        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);

                // fallback to space if missing key
                if (pattern == null) {
                    pattern = charMap.get(' ');
                }

                sb.append(pattern[line]).append("  "); // spacing between characters
            }

            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}