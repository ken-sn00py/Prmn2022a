package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {

        ATM atm = new ATM();
        Account account = new Account("藤井智子","12345");

        if(atm.existsAccount(account.getName(),account.getNumber())){
            System.out.println("名前"+account.getName()+" 口座番号："+ account.getNumber()+"はありました。");
        }else {
            atm.registerAccount(account.getName(), account.getNumber());
        }
        atm.deposit(account.getNumber(),1000);
        atm.withdraw(account.getNumber(),2000);
        atm.withdraw(account.getNumber(), 500);

    }
}