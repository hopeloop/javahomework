import java.util.Scanner;

public class W2_8_2 {
    public static double averageMajorDiagonal(double[][] m){
        double sum=0;
        for(int row = 0;row<m.length;row++){
            for (int column = 0;column<m[row].length;column++){
                if(row == column) sum+=m[row][column]; //如果位于主对角线则元素值加到sum中
            }
        }
        double avg = sum/m.length;
        return avg;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 4-by-4 matrix row by row:");
        double[][] grid = new double[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                grid[i][j] = input.nextDouble();
            }
        }
        double avg = averageMajorDiagonal(grid);
        System.out.printf("Average of the elements in the major diagonal is %.3f",avg);
    }
}
