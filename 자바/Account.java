package 자바;

public class Account {

    String accountNo, ownerName;
    int balance;
    
    public Account(String accountNo,String ownerName, int balance){

        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;

        //예금

        Void deposit(int amount){
            balance += amount;
        }

        //출금

        void withdraw(int amount){
            balance -= amount;
        }

        void withdraw() {
            balance -= 1000;
        }

        //조회
        int getBalance(){
            return balance;
        }
    }
}
