import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args) {
        // for loop String
    /*        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your String :");
            String myStr = scanner.nextLine();
            for (int index = 0; index < myStr.length(); index++) {
                if (myStr.charAt(index) == 'A' || myStr.charAt(index) == 'B' || myStr.charAt(index) == 'C') {
                    System.out.println("Capitals : \t"+myStr.charAt(index) + "\t");
                }
            }
        }
    }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String :");
        String myStr = scanner.nextLine();
        int index=0;
            while (myStr.charAt(index) <7) {
                if (myStr.charAt(index) == 'A' || myStr.charAt(index) == 'B' || myStr.charAt(index) == 'C') {
                    System.out.println("Capitals : \t" + myStr.charAt(index) + "\t");
                }
                index++;
            }
        }
    }




