package cn.tedu.listdemo;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackDemo2 {
	public static void main(String[] args) {
		StackTest at = new StackTest();
		at.push("a");
		at.push("b");
		at.push("c");
		at.push("d");
	}
}
class StackTest{
	private String[] data =new String[10];
	private int size = 0;
	public StackTest(){
		
	}
	
	//�ж�ջ�Ƿ�Ϊ��
	public boolean empty(){
		return size == 0;
	}
	
	public String peek(){
		if(empty()){
			//������ݳ���Ϊ0����ô�׳��쳣
			throw new EmptyStackException();
		}
		return data[size - 1];
	}
	
	public String pop(){
		if(empty()){
			//������ݳ���Ϊ0����ô�׳��쳣
			throw new EmptyStackException();
		}else{
			String str = this.peek();
			size--;
			return str;
		}
	}
	
	//ѹջ
	public void push(String str){
		//�ж��Ƿ���Ҫ����
		if(size >= data.length){
			//��������
			data = Arrays.copyOf(data, 2*data.length);
		}
		data[size++] = str;
	}
	
	//����
	public int search(String str){
//		for(int i = size - 1;i>=0;i--){
//			if(data[i] == str || data[i] != null && data[i].equals(str)){
//				return size - i;
//			}
//		}
		
		//j����¼��ǰ��λ�ã���1��ʼ��
		for(int i = size - 1,j = 1;i >= 0;i--,j++){
			if(data[i] == str || data[i] != null && data[i].equals(str)){
				return j;
			}
		}
		return -1;
	}
	
	
	
}