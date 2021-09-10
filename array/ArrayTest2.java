package array;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int students = 5;
		int total = 0;	
		int[] scores = new int[students];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("학생의 성적 : ");
			scores[i]=sc.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		System.out.println("학생들의 성적은 " + (total/students) + "입니다.");
		
		
	}

}
