import javax.swing.JFrame;

public class FrameM extends JFrame{
	public FrameM() {
		setSize(700,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("z");
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		FrameM a = new FrameM();
	
		setLayout(new FlowLayout()); //배치관리자 설정
		JButton button = new Jbutton("bt");
	}

}
