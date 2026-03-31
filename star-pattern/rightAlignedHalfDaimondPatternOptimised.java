import java.util.Scanner;
public class rightAlignedHalfDaimondPatternOptimised {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        for(int i=1;i<=2*rows-1;i++){

            int noOfStars=i;
            if(i>rows){
                noOfStars=2*rows-i;
            }

            for(int j=1;j<=rows-noOfStars;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=noOfStars;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
