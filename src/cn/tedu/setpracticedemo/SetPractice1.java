package cn.tedu.setpracticedemo;

import java.util.HashSet;

public class SetPractice1 {
	public static void main(String[] args) {
		HashSet<Object> books = new HashSet<Object>();
		books.add(new A());
		books.add(new A());
		
		books.add(new B());
		books.add(new B());
		
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}
}

class A{
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}

class B{
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
}

class C{
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 2;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}
