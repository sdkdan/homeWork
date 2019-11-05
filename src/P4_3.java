public class P4_3 {
    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        spaceIdx = custName.indexOf(' ');
        // Get the index of the space character (" ") in custName.

        firstName = custName.substring(spaceIdx+1, custName.length());
        System.out.println(firstName);
    }
}
