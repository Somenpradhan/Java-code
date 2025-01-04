import java.util.Scanner;
class Sample
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine();

        String[] words = str.split(" ");
        int length = words.length;
        String result = "";

        for (int i = 0; i < length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
                if (i < length - 1) {
                    result += " ";
                }
            }
        }

        System.out.println("Output string:");
        System.out.println(result);

        scanner.close();
    }
}