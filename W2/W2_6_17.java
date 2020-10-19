import java.util.Scanner;

public class W2_6_17 {
    public static void printMatrix(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int x=(int) (Math.random()*2); //形成随机0或1
                System.out.printf(x+" ");
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter n:");
        int n = input.nextInt();
        printMatrix(n);
    }
}
