package lecture06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            list.add(random.nextInt(8)-1);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("さいころを5つ振りました。\r\n何番目のさいころの値を確認しますか？");
        int a = input.nextInt();

        try{
            System.out.println(list.get(a));
        } catch (IndexOutOfBoundsException e){
            System.out.print("ArrayListの範囲外アクセスを確認しました。\r\nプログラムを終了します。");
        }

    }

}
