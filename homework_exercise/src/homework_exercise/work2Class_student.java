package homework_exercise;

public class work2Class_student implements Comparable<work2Class_student>{
	private String id;
	private String name;
	private Integer age;
	
	public work2Class_student() {
		super();
	}
  
	public work2Class_student(String id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(work2Class_student stu) {
		//按照年龄排序
		int num = this.getAge()-stu.getAge();
		//年龄相同，学号不一定相同
		num = num==0?this.getId().compareTo(stu.getId()):num;
		//年龄，学号相同，姓名不一定相同
		num = num==0?this.getName().compareTo(stu.getName()):num;
		
		return num;
	}
	
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", num=" + id + "]";
	}
	
}




