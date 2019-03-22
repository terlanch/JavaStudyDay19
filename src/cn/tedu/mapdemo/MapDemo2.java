package cn.tedu.mapdemo;

import java.util.Hashtable;

import org.xml.sax.HandlerBase;

public class MapDemo2 {
	public static void main(String[] args) {
		Hashtable hashtable = new Hashtable();
		hashtable.put(new A(10086), "hashtable10086");
		hashtable.put(new A(10010), "hashtable10010");
		hashtable.put(new A(10011), new B());
		System.out.println(hashtable);
		
		System.out.println(hashtable.containsValue("²âÊÔ×Ö·û´®"));
	}

}
class A{
	int count;
	public A(int count){
		this.count = count;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == this){
			return true;
		}
		if(obj != null && obj.getClass() == A.class){
			A a = (A)obj;
			return this.count == a.count;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.count;
	}
}

class B{
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
}