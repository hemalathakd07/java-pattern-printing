import java.util.Scanner;

public class PalindromeAlphabetPyramid {
  public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();

        for(int i=1;i<=rows;i++){
            char ch='A';
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(ch);
                if(k<=(2*i-1)/2){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
