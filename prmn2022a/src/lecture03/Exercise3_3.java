package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {

        String[] a = new String[2];
        int[] b = new int[2];
        int sum = 0;

        Scanner input = new Scanner(System.in);

        for(int i=0;i<a.length;i++) {
            System.out.println(i+1 + "つ目の整数を入力してください");
            a[i] = input.next();
        }

        for(int i=0;i<a.length;i++){
            b[i] = Integer.parseInt(a[i]);
        }

        for(int k : b){
            sum = sum+k;
        }

        System.out.println(b[0]+"+"+b[1]+"="+sum);
    }
}
