import java.util.*;

public class guessGame {
    public static void main(String[] args) {
        char[] a = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u' };

        char[] a1 = new char[7];
        char[] a2 = new char[7];
        char[] a3 = new char[7];
        Scanner inp = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            int j=0;    
            for (int k = 0; k < a.length; k += 3) {
                a1[j] = a[k];
                a2[j] = a[k + 1];
                a3[j] = a[k + 2];
                j++;
            }
            for (int m = 0; m < a1.length; m++) {
                System.out.printf("%c \t %c \t %c \n", a1[m], a2[m], a3[m]);
            }
            System.out.println("Enter the column:");
            int choice = inp.nextInt();
            switch (choice) {
                case 1:
                    for (int k = 0; k < a3.length; k++) {
                        a[k] = a2[k];
                        a[k + 7] = a1[k];
                        a[k + 14] = a3[k];
                    }
                    break;
                case 2:
                    for (int k = 0; k < a3.length; k++) {
                        a[k] = a1[k];
                        a[k + 7] = a2[k];
                        a[k + 14] = a3[k];
                    }
                    break;
                case 3:
                    for (int k = 0; k < a3.length; k++) {
                        a[k] = a1[k];
                        a[k + 7] = a3[k];
                        a[k + 14] = a2[k];
                    }
                    break;
                default:
                    System.out.println("Exiting!");
                    break;
            }

            

        }
        System.out.println("Your alphabet was: "+a[10]);
        inp.close();
    }
}