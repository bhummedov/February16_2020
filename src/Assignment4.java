import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        //for to for binary number
     /*       for (int i=0; i<2; i++){
                for (int j=0; j<2; j++){
                    for (int k=0; k<2; k++){
                        System.out.println(""+i+""+j+""+k);
                    }
                }
            }
        }
}*/

// while loop for binary number

        int k, j, i=0;
        while(i<=1){
            j=0;
            while(j<=1){
                k=0;
                while(k<=1){
                    System.out.println(""+i+j+k);
                    k++;
                }
                j++;
            }
            i++;
        }
    }
}
