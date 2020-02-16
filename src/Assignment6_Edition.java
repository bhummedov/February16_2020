import java.util.Scanner;
public class Assignment6_Edition {
    public static void main(String[] args) {
        // for loop String
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String :");
        String myStr = scanner.nextLine();
        for (int index = 0; index < myStr.length(); index++) {
            if (myStr.charAt(index) == 'a' || myStr.charAt(index) == 'i' || myStr.charAt(index) == 'u') {
                System.out.println("Vowels: \t"+myStr.charAt(index) + "\t");
            }
        }
    }
}

   /*     //while loop for HEX
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String :");
        String myStr = scanner.nextLine();
        int index = 0;
        while (index < myStr.length()) {
            if (myStr.charAt(index) == 'S' || myStr.charAt(index) == 'n' || myStr.charAt(index) == 'd' || myStr.charAt(index) == 'y' || myStr.charAt(index) == 'f') {
                System.out.println("constant vowels:"+(myStr.charAt(index) + "\t"));
            }
         index++;
        }
    }
}
*/


