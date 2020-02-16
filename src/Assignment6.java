import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
            String a ="Greetings for Boot Camp";
            for (int i=0; i<23; i++){
                System.out.print(a.charAt(i)+"\t");
                if (a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)== 'o' || a.charAt(i)== 'a'){
                    System.out.println("Vowels in the Sentence");
                } else
                    System.out.println("It's not Vowels");
            }

        }
    }

