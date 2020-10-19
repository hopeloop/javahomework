public class W2_7_7 {
    public static void main(String[] args) {
        int[] counts={0,1,2,3,4,5,6,7,8,9};
        int[] random_num = new int[200];

        for(int i=0;i<200;i++){
            random_num[i]= (int)(Math.random()*10);
        }

        for(int num:random_num){
            if(num == 0) counts[0]++;
            if(num == 1) counts[1]++;
            if(num == 2) counts[2]++;
            if(num == 3) counts[3]++;
            if(num == 4) counts[4]++;
            if(num == 5) counts[5]++;
            if(num == 6) counts[6]++;
            if(num == 7) counts[7]++;
            if(num == 8) counts[8]++;
            if(num == 9) counts[9]++;
        }

        for(int j=0;j<10;j++){
            System.out.printf("%d出现的次数是：%d \n",j,counts[j]);
        }
    }
}
