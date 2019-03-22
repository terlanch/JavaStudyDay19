package cn.tedu.setdemo;
	/*
	 * 泛型:用于约束集合中的数据类型
	 * JDK1.5之后才有
	 * 泛型增加了程序的安全性，将运行期间可能出现的错误
	 * 提前到了编译期间。
	 * E：element
	 * T：type
	 * K：key
	 * V：value
	 * 
	 * 如果要使用多个泛型，在尖括号中用，（逗号）隔开
	 * 
	 * 类中使用泛型：
	 * 在类后面添加<>尖括号中提供一个大写字母即可。
	 * 这个大写字母就代表了数据类型。在类的实例化时确定泛型的具体类型。
	 * 
	 * 接口使用泛型：
	 * 1、实现类最后的接口名后面直接添加具体的泛型类型
	 * class MyInterImpl implements MyInter<String>
	 * 这种实现方法，实现类中的泛型已确认
	 * 2、在实现类的类名后加<T> 和接口名后面加<T>
	 * class MyInterImpl<T> implements MyInter<T>
	 * 这种实现方法,在实现类实例化时才能确认泛型类型
	 * 
	 * 方法中使用泛型
	 * 直接在方法参数中使用，直接在方法参数中使用
	 * 
	 * 在方法的返回值前面添加<大写字母>，参数列表和返回值类型
	 * 就可以使用对应的泛型
	 * 
	 * 泛型的上限 <？extends 类名或者接口名>泛型中的类型最大不能超过extends后面的类名或接口名的范围
	 * 
	 * 泛型的下限<? super 类名或者接口名>泛型中的类型最小不能小于super后面的类名或者接口名的范围
	 * 
	 * 注意点：泛型中的上限和下限不能同时存在于同一个<>（尖括号）中.
	 * 
	 * 集合框架framework
	 * 集合框架中包含了集合本身，和操作集合相关的类或者接口。Map
	 * 也属于集合框架，但是不是集合本身
	 */
public class FanXing {

}
