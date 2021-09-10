package array;

import java.util.Scanner;

public class GetMin {

	public static void main(String[] args) {
		int array[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("10개중 " + (i+1) + "번째 숫자는 : ");
			array[i]=sc.nextInt();
		}
		int minni = array[0];
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(minni > array[i])
			{
				minni = array[i];
			}
			if(max < array[i])
			{
				max = array[i];
			}
		}
		System.out.println("최대값은 " + minni + "최대값은 " + max);

	}

}
