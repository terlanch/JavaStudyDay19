package cn.tedu.setdemo;
/*
 * Queue：先进先出
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("abc");
		q.add("def");
		
		
		//获取元素
		System.out.println(q);
		//获取元素
		//如果队列中没有元素，那么会抛异常
		System.out.println(q.element());
		//获取元素
		//如果队列中没有元素，那么返回null
		System.out.println(q.peek());
		
		
		//删除元素
		//删除元素先进入的先删除
		//如果队列中没有元素，那么会抛异常
		//String s = q.remove();
		
		//如果没有元素，那么返回null
		String s = q.poll();
		System.out.println(s);
		System.out.println(q);
	}
}
