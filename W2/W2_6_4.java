import java.util.Scanner;

public class W2_6_4 {
        public static void reverse(int number){
            String str = Integer.toString(number); //将数字转化为字符串
            char[] list = str.toCharArray();       //将字符串转化为char List
            int reversed_num = 0;
            for(int i=0,j=1;i< list.length;i++,j=j*10){
                reversed_num += ((list[i]-'0') * j);    //遍历每一位数字时乘以对应的位数，相加
            }
            System.out.printf("翻转后的数是%d",reversed_num);
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入要翻转的数：");
            int num = input.nextInt();
            reverse(num);
        }
    }
