import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String :");
        String sentence = scanner.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) >=97 && sentence.charAt(i) <=122) {
                System.out.println("Capitals : \t" + sentence.charAt(i) + "\t");
            }
        }
    }
}
