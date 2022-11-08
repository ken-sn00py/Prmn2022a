package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {

        ArrayList<Vegetable> array = new ArrayList<>();

        array.add(new Vegetable("にんじん",117));
        array.add(new Vegetable("たまねぎ",120));
        array.add(new Vegetable("じゃがいも",154));

        for(Vegetable a:array){
            a.print();
        }
        
    }
}
