package cn.tedu.listdemo;
import java.util.Enumeration;
/*
 * vector��JDK1.0�����ˣ���ѯ�ٶȿ죬��ɾ�ٶ���
 * �̰߳�ȫ
 * 
 * vectorĬ������Ϊ10������������Ϊ0
 * 
 * vector�����е�������Enumeration<E>
 * ��������ѭ���������ϵ�һ�����Ϲ���
 */
import java.util.Vector;

public class VectorDemo01 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(10,5);
		for(int i = 0;i < 16;i++){
			v.add("abc");
		}
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()){
			String s = e.nextElement();
			System.out.print(s+" ");
			
		}
		System.out.println(v.capacity());
	}
}
