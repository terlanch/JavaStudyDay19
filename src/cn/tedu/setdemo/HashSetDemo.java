package cn.tedu.setdemo;
/*
 * HashSet底层使用的是HashMap数据结构。HashMap数据是不重复的，无序的，不能保证数据的位置
 * 一成不变，线程不安全的。HashMap底层使用的数组加上链式栈结构
 * HashMap默认初始容量为16.
 * HashMap底层的数组的每一个位置称之为桶（bucket），每一个桶上面是一条链表
 * HashMap会对对象进行哈希算法操作后再进行二次计算，保证得到一个随机的0-15的数字
 * HashMap再添加元素时，会先去对应的桶中对比所有元素，如果有桶中有重复的元素，那么不添加
 * 这个元素，如果没有才添加
 * 
 * set的实现类
 * HashSet的底层使用HashMap来实现
 * HashMap底层使用数组+ 链表结构
 * 当HashMap存入数据时，不能存放 重复元素，数据
 * 是无序的，而且不保证数据的结构是一成不变的。在
 * 存入数据时，会对数据进行二次计算，保证计算后
 * 的值是0——(数组长度-1)，在存入时，会对对应桶
 * 上的所有数据进行比较，如果有重复元素，版么就舍弃，
 * 如果没有，存放在链表的最前面（栈结构）。
 * 
 * HashMap为什么无序？
 * 不能保证对象经过二次计算后的值还是有序的。
 * HashMap为什么不能保证数据的位置不变？
 * 1。因为添加数据时，添加在链表的最前面，后面的数据
 * 位置都会被影响。
 * 2.当hashMap出现rehash操作时，元素位置可能发生改变。
 * 
 * HashSet提供了指定初始容量和加载因子的构造方法
 * 初始容量如果设置过大，会造成资源浪费。
 * 初始容量如果设置过小，链表长度会过大，可能会频繁的
 * rehash，效率低下。
 * 
 * 加载因子如果设置太小（0.1）会频繁扩容，浪费资源。
 * 如果加载因子设置太大，会导致每个桶上的链表过长，查询速度慢。
 * 
 * 如果指定了HashSet的初始容量，但是依然会按照必然等于
 * 2的n次方的形式出现。
 * 
 * 
 * 
 * 
 * 
 */
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		//添加元素 不能添加重复元素
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("abc");
		System.out.println(set);
	}
}
