package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {

        int i = 0;
        Fighter fighter1 = new Fighter(210,100,"fighter1");
        Fighter fighter2 = new Fighter(180,150,"fighter2");

        while(fighter1.isAlive() && fighter2.isAlive()){

                if (i % 2 == 0) {
                    fighter1.attack(fighter2);
                } else {
                    fighter2.attack(fighter1);
                }

                i++;

        }

        if(fighter1.isAlive()){
            System.out.println(fighter2.getName()+"は倒れた");
        }else {
            System.out.println(fighter1.getName()+"は倒れた");
        }

    }
}
