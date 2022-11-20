package lecture04;

import java.util.ArrayList;

public class ATM {

    ArrayList<Account> accountList = new ArrayList<>();
    Account account = new Account("藤井智子","12345");

    ATM(){
        accountList.add(account);
    }

    public void registerAccount(String name,String number){
        System.out.println(name+"さんのアカウントを口座番号："+number+"で登録しました");
    }

    public boolean existsAccount(String name,String number){
        return accountList.contains(name) && accountList.contains(number);
    }

    public void deposit(String number,long money){
        account.setBalance(account.getBalance() + money);
        System.out.println("口座番号："+number+"　に"+money+"円入金しました。");
    }

    public long withdraw(String number,long money){
        if(account.getBalance()>money) {
            account.setBalance(account.getBalance() - money);
            System.out.println("口座番号："+number+"　から"+money+"円引き出しました。残高："+account.getBalance()+"円です");
        }else {
            System.out.println("口座番号："+number+"　から"+money+"円引き出せませんでした。残高："+account.getBalance()+"円です");
        }
        return account.getBalance();
    }
}
