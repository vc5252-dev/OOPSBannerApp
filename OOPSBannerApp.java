public class OOPSBannerApp {

    // ===== Inner Class =====
    static class CharacterPatternMap {
        private final Character character;
        private final String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // ===== Create Pattern Maps =====
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };

        String[] SPACE = {
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        };

        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S),
                new CharacterPatternMap(' ', SPACE)
        };
    }

    // ===== Get Pattern for Character =====
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', maps); // fallback
    }

    // ===== Print Banner =====
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        for (int line = 0; line < 7; line++) {
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, maps);
                System.out.print(pattern[line] + "  ");
            }
            System.out.println();
        }
    }

    // ===== Main =====
    public static void main(String[] args) {
        CharacterPatternMap[] maps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, maps);
    }
}