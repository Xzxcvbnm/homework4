package homework_exercise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
  
/*
 * ��Ŀ��ʹ�������ӳ���Ŷ��ͼ����Ϣ�������������
 * ������Ʒ���ԣ���ţ����ƣ����ۣ������磻ʹ����Ʒ�����Ϊӳ���е�key��
 */
public class work1 {

	public static void main(String[] args) {
		//ϰ��1
		
		//����work1Class_book����
		work1Class_book book1 = new work1Class_book("001", "book1", 111, "������");
		work1Class_book book2 = new work1Class_book("002", "book2", 222, "������");
		work1Class_book book3 = new work1Class_book("003", "book3", 333, "������");
		work1Class_book book4 = new work1Class_book("004", "book4", 444, "������");
		work1Class_book book5 = new work1Class_book("005", "book5", 555, "������");
		
		//Ȼ��Ž�HashMap��
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
			
    		System.out.println("���\t����\t����\t������");
    		
    		for (String i : key) 
    		{
                //��ͨ��key��value
                System.out.println(i +
                        "\t" + hashMapBook.get(i).getName() +
                        "\t" + hashMapBook.get(i).getPrice() +
                        "\t" + hashMapBook.get(i).getPublishing());
            }
        }
		

	} 

}
