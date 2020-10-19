import java.util.Scanner;

public class W2_7_10 {
    public static int indexOfLargestElement(double[] array){
        int index=0;
        double max= array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>=max) index = i;
            else continue;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[10];
        for(int i=0;i<10;i++){
            System.out.printf("请输入数表的第%d个值：",i);
            arr[i]=input.nextDouble();
        }

        int idx = indexOfLargestElement(arr);
        System.out.printf("最大数的index是：%d,最大数为：%.2f",idx,arr[idx]);
    }
}
