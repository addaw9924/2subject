package array;

import java.util.Collections;

public class lotto2 {
//array 사용시 중복 안됨 그냥 랜덤 사용시 중복이 나올 수 도 있음
	public static void main(String[] args) {
		int[] lot = new int[45];
		for (int i = 0; i < lot.length; i++) {
			lot[i] = i+1;
			
		}
		shuffleArray(lot);
		for(int i =0; i<6; i++)
		{
			System.out.print(lot[i]+ " ");
		}
	}
	{
}
public static void shuffleArray(int[] array) {
	  List<Integer> list = new ArrayList<>();
	  for (int i : array) {
	    list.add(i);
	  }

	  Collections.shuffle(list);

	  for (int i = 0; i < list.size(); i++) {
	    array[i] = list.get(i);
	  }
	  	}
}
