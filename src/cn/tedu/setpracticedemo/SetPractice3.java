package cn.tedu.setpracticedemo;

import java.util.TreeSet;

public class SetPractice3 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(9);
		ts.add(6);
		ts.add(-4);
		ts.add(3);
		
		//-4 3 6 9 �Զ�����
		System.out.println(ts);
		//-4 �����е��׸�Ԫ��
		System.out.println(ts.first());
		//9 ���������һ��Ԫ��
		System.out.println(ts.last());
		//[-4,3] ������С��6��Ԫ�أ�������6
		System.out.println(ts.headSet(6));
		//[3,6,9]�����д���3 ��Ԫ�ذ���3
		System.out.println(ts.tailSet(3));
		//[-4,3]�����д��ڵ���-4 С�ڲ�����6��Ԫ��
		System.out.println(ts.subSet(-4,6));
		
		
	}
}
