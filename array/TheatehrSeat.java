package array;

import java.util.Scanner;

public class TheatehrSeat {

	public static void main(String[] args) {
		int size = 10;
		int[] seats = new int[size];
		
		while(true) //<- ���ѹݺ��̶�¶�
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
			System.out.print("������ �¼��� ��ȣ �Է�(�����-1) : ");
			int s = sck.nextInt();
			if(s == -1)
				break;
			if(seats[s-1]==0) {                          
				seats[s-1] = 1;
				System.out.println(s+"�� �¼��� ����Ǿ����ϴ�.");
			}else
			{
				System.out.println(s+"�� �¼��� �̹� ������ �Ǿ��ֽ��ϴ�.");
			}
			
			
//			System.out.print("\033\033");
//			System.out.flush(); s
		}
	}

}
