package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            list.add(random.nextInt(6)+1);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("さいころを5つ振りました。\r\n何番目のさいころの値を確認しますか？");

        try{
            int a = input.nextInt();
            System.out.println(list.get(a));
        } catch (IndexOutOfBoundsException e){
            System.out.print("ArrayListの範囲外アクセスを確認しました。\r\nプログラムを終了します。");
        } catch (InputMismatchException e){
            System.out.println("整数以外の値が入力されました。\r\nプログラムを終了します。");
        }

    }

}
