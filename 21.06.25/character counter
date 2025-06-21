public class CharacterCounter {
    public static int countCharacters(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'l';
        int count = countCharacters(str, ch);
        System.out.println("The character '" + ch + "' appears " + count + " times in the string.");
    }
}