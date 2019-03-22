package cn.tedu.mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map:（映射）
 * Map<K,V> K代表的是key（键）V代表的是value（值）
 * Map中将键值对中抽取出一个接口，接口就是Map.Entry
 * 
 * key - value   键值对
 * 键值对都是同时出现的
 */
public class MapDemo01 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		//添加键值对
		map.put("score", 100);
		//如果有重复元素，后面的会覆盖前面的
		map.put("age", 10);
		map.put("age", 20);
		//可以存放null
		map.put(null, 20);
		
		//清空
//		map.clear();
		
		//查看map是否为空
		System.out.println(map.isEmpty());
		
		//删除
//		map.remove("age");
		
		//获取key对应的value
//		Integer in = map.get("score");
//		System.out.println(in);
//		System.out.println(map);
//		
//		//判断是否包含key
//		System.out.println(map.containsKey("age"));
//		//判断是否包含value
//		System.out.println(map.containsValue(20));
//		
//		//获取map中所有键值对的集合
//		//[null=20, score=100, age=20]
//		Set<Map.Entry<String,Integer>> set = map.entrySet();
//		System.out.println(set);
//		
//		//获取map中所有的key的集合
//		Set<String> keyset = map.keySet();
//		System.out.println(keyset);
//		
		//获取map中所有的value的集合
//		Collection<Integer> coll = map.values();
//		System.out.println(coll);
		
		//第一种遍历map key value
		//第一步先获取键值对的集合，第二步获取迭代器
		//<String,Integer>约束的是Map.Entry的泛型
		Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> entry = it.next();
			System.out.println(entry.getKey()+" ===== "+entry.getValue());
		}
		
		//第二种遍历
		//第一步先获取所有key的集合
		Set<String> set1 = map.keySet();
		//第二步遍历集合
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()){
			//获取key集合中的每一个元素（key）
			String key = it1.next();
			Integer value = map.get(key);
			System.out.println(key + "\t" + value);
		}
		
		//第三种遍历方式
		for(Map.Entry<String, Integer> en : map.entrySet()){
			System.out.println(en.getKey() + "------" + en.getValue());
		}
		
		for(String key : map.keySet()){
			System.out.println(key+"    "+map.get(key));
		}
	}
}
