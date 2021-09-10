package array;

public class CommandLine {

	public static void main(String[] args) {
		if(args.length > 0)
		{
			for(int i = 0; i<args.length; i++) {
				System.out.println(" " + args[i]);
			}
			if(args[0].equals("-h"))
				System.out.println("Help");
		}
//마우스 오른쪽 클릭 run as-> 제일 밑에거 -> program arguments
	}

}
