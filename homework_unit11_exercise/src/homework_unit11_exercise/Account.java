package homework_unit11_exercise;
import java.util.Date;
import java.util.ArrayList;
public class Account {
	
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private java.util.Date dateCreated;
    private String name;
    private java.util.ArrayList<Transaction> transactions = new java.util.ArrayList<>();
    
    public Account(){
    	dateCreated = new java.util.Date();
    }
    
    public Account(String name,int id, double balance){
    	this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }
    
    // id balance annualInterestRate的setter和getter
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
        
    // dateCreated的访问器方法
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public java.util.ArrayList<Transaction> getTransactions() {
    	return transactions;
    }
    
    public String getName() {
    	return name;
    }

    // getMonthlyInterestRate方法
    public double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }

    // getMonthlyInterest方法
    public double getMonthlyInterest(){
        return annualInterestRate * balance / 1200;
    }

    // withDraw方法
    public void withDraw(double num){
        balance -= num;
        transactions.add(new Transaction("取款",num,balance,""));
    }

    // deposit方法
    public void deposit(double num){
        balance += num;
        transactions.add(new Transaction("存款",num,balance,""));
    }
    
    

}


