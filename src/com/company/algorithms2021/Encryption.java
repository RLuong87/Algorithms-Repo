public class Encryption {

    public static void main(String[] args) {

        /* 
        this int variable will add to the character and will return a character based off of the ACSII Table
        with what ever number that is given
         */
        int key = 3;

        // Message to encrypt
        String message = "Java is cool";

        // For test purposes
        System.out.println(message);

        // Transforming the string into a character array with toCharArray method
        char[] characters = message.toCharArray();

        for (char c : characters) {
            // Addition assignment operator to add to each character in the array
            c += key;
            // c -= key; will decrypt the encrypted message
            System.out.print(c);
        }
    }
}