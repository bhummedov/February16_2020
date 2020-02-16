import java.util.Scanner;
public class Assignment2_While {
        public static void main(String[] args) {
            //while to while
            int i = 1;
            char j = 'a';
            while (i < 6) {
                System.out.print(i);
                int b=1;
                while (b <= 4) {
                    System.out.print("\t" +j);
                    j++;
                    b++;

                }
                System.out.println();
                i++;

            }
        }
}
