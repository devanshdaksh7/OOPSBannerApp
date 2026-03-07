public class OOPSBannerApp {

    // Method for O pattern
    public static String[] getOPattern() {
        return new String[]{
                "  ***  ",
                " ** ** ",
                "**   **",
                "**   **",
                "**   **",
                " ** ** ",
                "  ***  "
        };
    }

    // Method for P pattern
    public static String[] getPPattern() {
        return new String[]{
                "***** ",
                "**  **",
                "**  **",
                "***** ",
                "**    ",
                "**    ",
                "**    "
        };
    }

    // Method for S pattern
    public static String[] getSPattern() {
        return new String[]{
                " **** ",
                "**    ",
                "**    ",
                " ***  ",
                "    **",
                "    **",
                "****  "
        };
    }

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print OOPS banner
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " +
                               oPattern[i] + "  " +
                               pPattern[i] + "  " +
                               sPattern[i]);
        }
    }
}