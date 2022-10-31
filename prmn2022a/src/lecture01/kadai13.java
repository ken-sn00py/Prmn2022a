package lecture01;

import java.util.Scanner;

public class kadai13 {
    public static void main(String[] args) {

        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.print("年齢を入力してください:");
            int age = input.nextInt();
            if ((age > 120)||(age<0)) {
                System.out.println("エラー");
                break;
            } else if (age>=20){
                System.out.println("I am "+age+"years old so I cannot drink liquor.");
            } else {
                System.out.println("I am "+age+"years old so I cannot drink liquor.");
            }
        }

    }
}
