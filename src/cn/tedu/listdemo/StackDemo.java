package cn.tedu.listdemo;
import java.util.Stack;

/*
 * LIFO
 */
public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		//ѹջpush
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		stack.push("ddd");
		stack.push("eee");
		//�����Ǵ�ջ����ջ�׽���������������1Ϊ����
//		System.out.println(stack.search("bbb"));
		
//		stack.clear();
		
		//���ջ��û��Ԫ�أ���ô��ջ�����׳���ջ�쳣
		//��ջpeek pop
		//peek
		//��ȡջ����Ԫ�ز���ɾ��
		//String str = stack.peek();

		//pop
		//ȡ��ջ����Ԫ�أ�ԭ���Ļᱻɾ��
		String str = stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
//		System.out.println(stack.empty());
//		
//		//��ջʱ�Ƽ����¸�ʽ
//		if(!stack.empty()){
//			//д��ջ����
//		}
	}
}
