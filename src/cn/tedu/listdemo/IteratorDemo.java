package cn.tedu.listdemo;
/*
 * it.remove删除的是当前it.next()方法的元素，支持一边
 * 遍历一边删除
 * 
 * Iterator迭代器在进行迭代时，会先拷贝一份新的数据，在新的数据上面进行迭代，并添加
 * 对应的标记，而List接口的删除方法，是在原数据上面直接进行删除操作，java不允许这个
 * 操作。迭代器的删除方法是在拷贝出来的新数据上面进行删除，并且添加对应的标记，最后
 * 合并后统一进行原数据上的删除
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	private static final char[] str = null;

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("蔡徐坤");
		list.add("潘长江");
		list.add("吴亦凡");
		list.add("杨超越");
		
		
		System.out.println(list);
		//获取迭代器
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			
			String str = it.next();
			//list接口的删除方法
			//不支持一边迭代一边删除
//			list.remove(str);
			//迭代器的删除方法
			//删除的就是it.next（）的这个元素
			it.remove();
//			System.out.println(str);
			System.out.println(it.next());
			
		}
		
		System.out.println(list);
		
	}
}
