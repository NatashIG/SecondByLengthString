public class SecondByLengthString {

    public static void main(String[] args) {
        String[] printedEditions = {"book", "newspaper", "map", "postcard", "booklet"};
        String[] maxString = {"", ""};

        for (int i = 0; i < printedEditions.length; i++) {
            if (maxString[0].equals("") || printedEditions[i].length() > maxString[0].length()) {
                maxString[1] = maxString[0];
                maxString[0] = printedEditions[i];
            } else if (maxString[1].equals("") || printedEditions[i].length() > maxString[1].length()) {
                maxString[1] = printedEditions[i];
            }
        }
        System.out.println("The second longest string is " + maxString[1]);
    }
}



