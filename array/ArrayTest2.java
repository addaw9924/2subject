package array;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int students = 5;
		int total = 0;	
		int[] scores = new int[students];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("�л��� ���� : ");
			scores[i]=sc.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		System.out.println("�л����� ������ " + (total/students) + "�Դϴ�.");
		
		
	}

}
