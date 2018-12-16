public class Smileys {
    private static void printWithSmileys(String characterString) {
        int stringLength = characterString.length();
        int nSmileys = (stringLength + 1) / 2 + 3;
        
        printSmiley(nSmileys);
        if (stringLength % 2 == 0) {
            System.out.println(":) " + characterString + " :)");
        } else {
            System.out.println(":) " + characterString + "  :)");
        }
        printSmiley(nSmileys);
    }

    private static void printSmiley(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(":)");
        }

        System.out.println();
    }
