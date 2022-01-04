package homework_exercise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
  
/*
 * 题目：使用链表和映射存放多个图书信息，遍历并输出。
 * 其中商品属性：编号，名称，单价，出版社；使用商品编号作为映射中的key。
 */
public class work1 {

	public static void main(String[] args) {
		//习题1
		
		//创建work1Class_book对象
		work1Class_book book1 = new work1Class_book("001", "book1", 111, "出版社");
		work1Class_book book2 = new work1Class_book("002", "book2", 222, "出版社");
		work1Class_book book3 = new work1Class_book("003", "book3", 333, "出版社");
		work1Class_book book4 = new work1Class_book("004", "book4", 444, "出版社");
		work1Class_book book5 = new work1Class_book("005", "book5", 555, "出版社");
		
		//然后放进HashMap中
		HashMap<String,work1Class_book> hashMapBook = new HashMap<>();
		hashMapBook.put(book1.getNum(), book1);
		hashMapBook.put(book2.getNum(), book2);
		hashMapBook.put(book3.getNum(), book3);
		hashMapBook.put(book4.getNum(), book4);
		hashMapBook.put(book5.getNum(), book5);
		
		List<HashMap<String, work1Class_book>> booksList = new ArrayList<>();
        booksList.add(hashMapBook);
        
        for (HashMap<String, work1Class_book> h : booksList) 
        {
        	Set<String> key = h.keySet();
			
    		System.out.println("编号\t名称\t单价\t出版社");
    		
    		for (String i : key) 
    		{
                //再通过key找value
                System.out.println(i +
                        "\t" + hashMapBook.get(i).getName() +
                        "\t" + hashMapBook.get(i).getPrice() +
                        "\t" + hashMapBook.get(i).getPublishing());
            }
        }
		

	} 

}
