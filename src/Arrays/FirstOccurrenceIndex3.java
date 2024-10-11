package Arrays;

public class FirstOccurrenceIndex3 {

    public static void main(String[] args) {
        String str = "HBÑ world";
        String substring = "world";

        int index = str.indexOf(substring);

        if (index != -1) {
            System.out.println("The substring \"" + substring + "\" is found at index " + index);
        } else {
            System.out.println("The substring \"" + substring + "\" is not found in the string.");
        }
    }
}
