import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        //for for
        char letter ='a';
        for (int i = 1; i < 6; i++) {
            System.out.print(i);
            for (int j = 1; j < 5; j++) {
                System.out.print("\t"+letter );
               letter++;
            }
            System.out.println();
        }
    }
}


