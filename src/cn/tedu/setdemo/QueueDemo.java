package cn.tedu.setdemo;
/*
 * Queue���Ƚ��ȳ�
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("abc");
		q.add("def");
		
		
		//��ȡԪ��
		System.out.println(q);
		//��ȡԪ��
		//���������û��Ԫ�أ���ô�����쳣
		System.out.println(q.element());
		//��ȡԪ��
		//���������û��Ԫ�أ���ô����null
		System.out.println(q.peek());
		
		
		//ɾ��Ԫ��
		//ɾ��Ԫ���Ƚ������ɾ��
		//���������û��Ԫ�أ���ô�����쳣
		//String s = q.remove();
		
		//���û��Ԫ�أ���ô����null
		String s = q.poll();
		System.out.println(s);
		System.out.println(q);
	}
}
