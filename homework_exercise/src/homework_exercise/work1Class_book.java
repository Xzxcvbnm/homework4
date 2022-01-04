package homework_exercise;
 
public class work1Class_book {
	
	private String num;
    private String name;
    private double price;
    private String publishing;

    public work1Class_book() {

    } 

    public work1Class_book(String num, String name, double price, String publishing) {
        super();
        this.num = num;
        this.name = name;
        this.price = price;
        this.publishing = publishing;
    }
    
    public void setNum(String num) {
    	this.num = num;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }
    
    public void setPublishing(String publishing) {
    	this.publishing = publishing;
    }

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getPublishing() {
        return publishing;
    }

}
