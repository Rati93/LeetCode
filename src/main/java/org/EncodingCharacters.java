package org;

public class EncodingCharacters {

    public static void main(String[] args)
    {
        String input = "aabbbccccdddddeefggg";
        if (input == null || input.isEmpty()) {
            System.out.println("No compression needed");
        }

        StringBuilder encodedString = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                encodedString.append(currentChar);
                if (count > 1) {
                    encodedString.append(count);
                }
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        encodedString.append(currentChar);
        if (count > 1) {
            encodedString.append(count);
        }

        System.out.print(encodedString.toString());
    }
}
