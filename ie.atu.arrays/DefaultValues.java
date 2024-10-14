public class DefaultValues {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        boolean[] boolArray = new boolean[3];
        String[] stringArray = new String[3];
        char[] charArray = new char[5];

        System.out.println("Default int values:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nDefault boolean values:");
        for (boolean bool : boolArray) {
            System.out.print(bool + " ");
        }

        System.out.println("\nDefault String values:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
       //Task: Declare an array of char with a size of 4 and print out the default values.
        System.out.println("\nDefault Char values:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    
    }
}