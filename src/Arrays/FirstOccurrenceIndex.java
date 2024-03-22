package Arrays;

public class FirstOccurrenceIndex {

    public static void main(String[] args) {
        String str = "Helloworldhiworld";
        String substring = "world";

        int index = str.indexOf(substring);

        if (index != -1) {
            System.out.println("The substring \"" + substring + "\" is found at index " + index);
        } else {
            System.out.println("The substring \"" + substring + "\" is not found in the string.");
        }
    }
}
