/**
 * Hacker rank programming contest 4.
 */
import java.util.Scanner;
public class IntroChallange {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        int count=0;
        int value;
        int size;
        Scanner input = new Scanner(System.in);
        value=input.nextInt();
        size=input.nextInt();
        int[] values= new int[size];
        for (int i=0;i<size;i++){
            values[i]=input.nextInt();
        }
        while (count<values.length){
            if (values[count]==value){
                System.out.println(count);
                break;
            }
            count++;
    }
  }
}
