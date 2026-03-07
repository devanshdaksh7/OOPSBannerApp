public class OOPSBannerApp {

    // Inner Static Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create pattern objects
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        };

        String[] pPattern = {
                "**** ",
                "** **",
                "** **",
                "**** ",
                "**   ",
                "**   ",
                "**   "
        };

        String[] sPattern = {
                " ****",
                "**   ",
                "**   ",
                " *** ",
                "   **",
                "   **",
                "**** "
        };

        String[] spacePattern = {
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        };

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', oPattern);
        maps[1] = new CharacterPatternMap('P', pPattern);
        maps[2] = new CharacterPatternMap('S', sPattern);
        maps[3] = new CharacterPatternMap(' ', spacePattern);

        return maps;
    }

    // Get pattern for a character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return charMaps[3].getPattern(); // space pattern
    }

    // Print banner message
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}