package calculatorProject;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	// UI를 생성자를 통해 생성한다.

	JTextField tf; // 입력란
	JPanel panel; // 버튼 밑받침
	String[] buttonStr = { "C", "/", "*", "<-", "7", "8", "9", "-", "4", "5",
			"6", "+", "1", "2", "3", "()", "0", ".", "+/-", "=" }; // 계산기 버튼 텍스트
	JButton[] buttons = new JButton[buttonStr.length]; // 계산기 버튼 생성
	int i;

	public Calculator() {
		super("My Calculator v1.0"); // 이름
		System.out.println(buttons.length);
		// JTextField 세팅
		tf = new JTextField("");
		tf.setSize(200, 1000);

		// JPanel 부분
		panel = new JPanel(new GridLayout(5, 4, 4, 4)); // 패널 생성
		panel.setBackground(Color.lightGray);

		// JButton 추가 부분
		for (i = 0; i < buttonStr.length; i++) {
			buttons[i] = new JButton("");
			buttons[i].setText(buttonStr[i]);
			buttons[i].setSize(10, 10);
			panel.add(buttons[i]);
			buttons[i].addActionListener(new EventHandler());
		}
		// 리스너 추가 부분

		// 추가하는 부분
		this.add("North", tf); // JTextField 추가
		this.add(panel);
		this.setSize(400, 600);
		this.setVisible(true);
	}

	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s = " "; // 숫자를 문자열형으로 바꿔주기 위한 변수

			Object obj = e.getSource(); // 이벤트의 결과를 받환한다.

			for (int i = 0; i < buttons.length; i++) {

				if (obj.equals(buttons[i])) {
					if (obj.equals(buttons[0])) { // c버튼 클릭시
						tf.setText(null);

					} else if (obj.equals(buttons[19])) {

					} else if (obj.equals(buttons[3])) {
						String str = tf.getText();
						char[] str2 = new char[str.length()];

						for (int j = 0; j < str.length(); j++) {
							str2[j] = str.charAt(j);
						}

						Stack<Character> list = new Stack<Character>();
						for (int j = 0; j < str2.length; j++) {
							list.push(str2[j]);
						}

						list.pop();
						String s3 = "";
						for (int j = 0; j < list.size(); j++) {
							s3 += list.get(j);
						}
						tf.setText(s3);

					} else {
						tf.setText(tf.getText()
								+ (((JButton) obj).getActionCommand()));
					}
				}
			}

		}

	};
}
