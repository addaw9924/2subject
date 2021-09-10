package array;

import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int[] array = new int[10];
		int value,index = -1;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((i+1)+"번째 입력 숫자 : ");
			array[i] = sc.nextInt();
		}
		System.out.print("배열에서 탐색할 값 입력 :");
		value = sc.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == value)
				index = i;
		}
		if(index == -1)
		{
			System.out.println("배열에 입력하신 값이 존재하지 않습니다.");
		}
		else
		{
			System.out.println("입력하신 값 " + value + "는 " + array[index] + "에 있습니다.");
		}
	}

}
