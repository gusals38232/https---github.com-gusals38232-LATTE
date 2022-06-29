package 자바;

public class class17 {
    public static void main(String[] args) {
        
        Account ac1 = new Account("1111", "수지", 1000);
        ac1.deposit(5000);
        System.out.println("현재의 잔액:" +ac1.getBalance());
        ac1.withdraw(3000);
        System.out.println("현재의 잔액:" +ac1.getBalance());

        Account ac2 = new Account("1234", "현민", 2000);
        ac2.deposit(3000);
        System.out.println("잔액:" +ac1.getBalance());
        ac2.withdraw(3000);
        Account ac2 = new Account("1452", "미카", 3000);



    }
    
}
