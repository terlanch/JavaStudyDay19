package cn.tedu.mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map:��ӳ�䣩
 * Map<K,V> K�������key������V�������value��ֵ��
 * Map�н���ֵ���г�ȡ��һ���ӿڣ��ӿھ���Map.Entry
 * 
 * key - value   ��ֵ��
 * ��ֵ�Զ���ͬʱ���ֵ�
 */
public class MapDemo01 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		//��Ӽ�ֵ��
		map.put("score", 100);
		//������ظ�Ԫ�أ�����ĻḲ��ǰ���
		map.put("age", 10);
		map.put("age", 20);
		//���Դ��null
		map.put(null, 20);
		
		//���
//		map.clear();
		
		//�鿴map�Ƿ�Ϊ��
		System.out.println(map.isEmpty());
		
		//ɾ��
//		map.remove("age");
		
		//��ȡkey��Ӧ��value
//		Integer in = map.get("score");
//		System.out.println(in);
//		System.out.println(map);
//		
//		//�ж��Ƿ����key
//		System.out.println(map.containsKey("age"));
//		//�ж��Ƿ����value
//		System.out.println(map.containsValue(20));
//		
//		//��ȡmap�����м�ֵ�Եļ���
//		//[null=20, score=100, age=20]
//		Set<Map.Entry<String,Integer>> set = map.entrySet();
//		System.out.println(set);
//		
//		//��ȡmap�����е�key�ļ���
//		Set<String> keyset = map.keySet();
//		System.out.println(keyset);
//		
		//��ȡmap�����е�value�ļ���
//		Collection<Integer> coll = map.values();
//		System.out.println(coll);
		
		//��һ�ֱ���map key value
		//��һ���Ȼ�ȡ��ֵ�Եļ��ϣ��ڶ�����ȡ������
		//<String,Integer>Լ������Map.Entry�ķ���
		Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> entry = it.next();
			System.out.println(entry.getKey()+" ===== "+entry.getValue());
		}
		
		//�ڶ��ֱ���
		//��һ���Ȼ�ȡ����key�ļ���
		Set<String> set1 = map.keySet();
		//�ڶ�����������
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()){
			//��ȡkey�����е�ÿһ��Ԫ�أ�key��
			String key = it1.next();
			Integer value = map.get(key);
			System.out.println(key + "\t" + value);
		}
		
		//�����ֱ�����ʽ
		for(Map.Entry<String, Integer> en : map.entrySet()){
			System.out.println(en.getKey() + "------" + en.getValue());
		}
		
		for(String key : map.keySet()){
			System.out.println(key+"    "+map.get(key));
		}
	}
}
