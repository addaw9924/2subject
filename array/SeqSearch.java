package array;

import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int[] array = new int[10];
		int value,index = -1;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((i+1)+"��° �Է� ���� : ");
			array[i] = sc.nextInt();
		}
		System.out.print("�迭���� Ž���� �� �Է� :");
		value = sc.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == value)
				index = i;
		}
		if(index == -1)
		{
			System.out.println("�迭�� �Է��Ͻ� ���� �������� �ʽ��ϴ�.");
		}
		else
		{
			System.out.println("�Է��Ͻ� �� " + value + "�� " + array[index] + "�� �ֽ��ϴ�.");
		}
	}

}
