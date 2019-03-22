package cn.tedu.setdemo;

import java.util.TreeSet;

/*
 * 
 */
public class TreeSetDemo {
	public static void main(String[] args) {
//		TreeSet<String> set = new TreeSet();
//		set.add("dd");
//		set.add("dd");
//		set.add("dd");
//		set.add("dd");
//		set.add("dd");
//		set.add("dd");
//		//默认会对里面的内容进行排序
//		System.out.println(set);
		
		//如果TreeSet要对自定义对象进行排序，自定义的类必须实现Comparable
		TreeSet<Student> set = new TreeSet<>();
		set.add(new Student("张三丰",100,100));
		set.add(new Student("张无忌",20,99));
		set.add(new Student("张翠山",40,50));
		set.add(new Student("殷素素",30,60));
		System.out.println(set);
		
	}

}
class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int score;
	
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	//传入参数o
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	
}
