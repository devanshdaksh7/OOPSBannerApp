public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization with String.join()
        String[] lines = {

            String.join(" ", " *** ", " *** ", " ***** ", " **** "),
            String.join(" ", "** **", "** **", "**  **", "**   "),
            String.join(" ", "** **", "** **", "**  **", "**   "),
            String.join(" ", "** **", "** **", "***** ", "***  "),
            String.join(" ", "** **", "** **", "**    ", "  ** "),
            String.join(" ", "** **", "** **", "**    ", "  ** "),
            String.join(" ", " *** ", " *** ", "**    ", "**** ")

        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}