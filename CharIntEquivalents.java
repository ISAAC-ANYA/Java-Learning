public class CharIntEquivalents {
    public static void main(String[] args) {
        char[] characters = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};

        System.out.println("Character   Integer Equivalent");
        System.out.println("---------------------------");

        for (char ch : characters) {
            int intValue = (int) ch;
            System.out.println("    " + ch + "           " + intValue);
        }
    }
}