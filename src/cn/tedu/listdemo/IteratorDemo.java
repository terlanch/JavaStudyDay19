package cn.tedu.listdemo;
/*
 * it.removeɾ�����ǵ�ǰit.next()������Ԫ�أ�֧��һ��
 * ����һ��ɾ��
 * 
 * Iterator�������ڽ��е���ʱ�����ȿ���һ���µ����ݣ����µ�����������е����������
 * ��Ӧ�ı�ǣ���List�ӿڵ�ɾ������������ԭ��������ֱ�ӽ���ɾ��������java���������
 * ��������������ɾ���������ڿ����������������������ɾ����������Ӷ�Ӧ�ı�ǣ����
 * �ϲ���ͳһ����ԭ�����ϵ�ɾ��
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
		list.add("������");
		list.add("�˳���");
		list.add("���ෲ");
		list.add("�Խ");
		
		
		System.out.println(list);
		//��ȡ������
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			
			String str = it.next();
			//list�ӿڵ�ɾ������
			//��֧��һ�ߵ���һ��ɾ��
//			list.remove(str);
			//��������ɾ������
			//ɾ���ľ���it.next���������Ԫ��
			it.remove();
//			System.out.println(str);
			System.out.println(it.next());
			
		}
		
		System.out.println(list);
		
	}
}
