public class characterManipulation {
    public static void main(String[] args) {
        char ch = 'A';

        // Check if the character is a letter
        System.out.println(ch + " is a letter: " + Character.isLetter(ch));

        // Check if the character is a digit
        System.out.println(ch + " is a digit: " + Character.isDigit(ch));

        // Convert to lowercase
        System.out.println(ch + " in lowercase: " + Character.toLowerCase(ch));

        // Convert to uppercase
        char anotherChar = 'b';
        System.out.println(anotherChar + " in uppercase: " + Character.toUpperCase(anotherChar));

        // Check if the character is a whitespace
        char space = ' ';
        System.out.println("Space is whitespace: " + Character.isWhitespace(space));
    }
}
