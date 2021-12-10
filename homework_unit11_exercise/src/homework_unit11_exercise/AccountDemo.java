package homework_unit11_exercise;

public class AccountDemo {

	public static void main(String[] args) {
		//11.8
		Account account = new Account("George",1122,1000);
		account.setAnnualInterestRate(1.5);
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		account.withDraw(5);
		account.withDraw(4);
		account.withDraw(2);
		
		System.out.println("账户姓名: "+ account.getName());
		System.out.println("ID: "+ account.getId());
		System.out.println("余额: "+ account . getBalance ());
		System.out.println("年利率: "+ account.getAnnualInterestRate());
		java.util.ArrayList<Transaction> list = account.getTransactions();
		System.out.printf("%-27s%-14s%-14s%-15s\n","交易时间","交易类型","交易金额","账户余额");
		for(int i=0;i<list.size();i++)
		{
			Transaction transactions = (Transaction)(list.get(i));
			System.out.printf("%-27s%-15s%-16s%-15s\n ", transactions.getDate(), transactions.getType(),
							   transactions.getAmount(), transactions.getBalance());
		}
	}

}
