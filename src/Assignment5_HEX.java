import java.util.Scanner;
public class Assignment5_HEX {
    public static void main(String[] args) {
        String a ="1243CD242";
        for (int i=0; i<9; i++){
            System.out.print(a.charAt(i)+"\t");
            if (a.charAt(i)=='A' || a.charAt(i)=='B' || a.charAt(i)== 'C' || a.charAt(i)== 'D' || a.charAt(i)== 'E' || a.charAt(i)== 'F'){
                System.out.println("It's HEX");
            } else
                System.out.println("It's not");
        }

        }
    }


