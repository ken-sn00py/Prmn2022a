package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("何行分入力しますか？");
        int a = input.nextInt();

        ArrayList<String> array = new ArrayList<>();

        for(int i=0;i<a;i++){
            System.out.println(i+1+"行目：");
            String b = input.next();
            array.add(b);
        }

        System.out.println("入力した文字列：");
        for(String j : array){
            System.out.println("["+array.indexOf(j)+"] "+j);
        }

    }
}
