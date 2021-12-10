package homework_unit11_exercise;
import java.util.Date;
public class Transaction {
	private java.util.Date date;
	private String type;
	private double amount;
	private double balance = 0.0;
	private String discription;
	
	public Transaction(String type,double amount,double balance,String discription){
    	this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.discription = discription;
    }
	
	public java.util.Date getDate(){
		return date;
	}
	
	public String getType() {
		return type;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getDiscription() {
		return discription;
	}

}
