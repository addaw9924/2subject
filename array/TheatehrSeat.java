package array;

import java.util.Scanner;

public class TheatehrSeat {

	public static void main(String[] args) {
		int size = 10;
		int[] seats = new int[size];
		
		while(true) //<- 무한반복이라는뜻
		{
			for(int i = 0; i<size; i++)
			{
				System.out.printf("%3d",i+1);
			}
			System.out.print("==================================");
			System.out.println();
			for(int i = 0; i<size; i++)
			{
				System.out.printf("%3d",seats[i]);
			}
			System.out.print("==================================");
			System.out.println();
			Scanner sck = new Scanner(System.in);
			System.out.print("예약할 좌석의 번호 입력(종료는-1) : ");
			int s = sck.nextInt();
			if(s == -1)
				break;
			if(seats[s-1]==0) {                          
				seats[s-1] = 1;
				System.out.println(s+"번 좌석이 예약되었습니다.");
			}else
			{
				System.out.println(s+"번 좌석은 이미 예약이 되어있습니다.");
			}
			
			
//			System.out.print("\033\033");
//			System.out.flush(); s
		}
	}

}
