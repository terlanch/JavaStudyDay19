package cn.tedu.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortDmoe {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("vvv");
		list.add("ttt");
		list.add("iii");
		list.add("ggg");
		//��list�е����ݰ������ַ���������
//		list.sort(new Comparator<String>(){
//
//			@Override
//			//�Ƚ������ַ��������ַ��Ĳ�ֵ
//			//o1���ַ��������o2���ַ�������ֵ������������ô��o2����o1ǰ��
//			//o1���ַ����С��o2���ַ�������ֵ�Ǹ���������ô��o2����o1����
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.charAt(0) - o2.charAt(0);
//			}
//			
//		});
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.charAt(0) - o2.charAt(0);
			}
		});
		System.out.println(list);
	}
}
