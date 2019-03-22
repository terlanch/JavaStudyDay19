package cn.tedu.listdemo;
import java.util.Stack;

/*
 * LIFO
 */
public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		//压栈push
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		stack.push("ddd");
		stack.push("eee");
		//搜索是从栈顶向栈底进行搜索，并且以1为基数
//		System.out.println(stack.search("bbb"));
		
//		stack.clear();
		
		//如果栈中没有元素，那么弹栈都会抛出空栈异常
		//弹栈peek pop
		//peek
		//获取栈顶的元素并不删除
		//String str = stack.peek();

		//pop
		//取出栈顶的元素，原来的会被删除
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
//		System.out.println(stack.empty());
//		
//		//弹栈时推荐以下格式
//		if(!stack.empty()){
//			//写弹栈代码
//		}
	}
}
