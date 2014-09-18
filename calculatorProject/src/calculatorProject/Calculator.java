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
	// UI�� �����ڸ� ���� �����Ѵ�.

	JTextField tf; // �Է¶�
	JPanel panel; // ��ư �ع�ħ
	String[] buttonStr = { "C", "/", "*", "<-", "7", "8", "9", "-", "4", "5",
			"6", "+", "1", "2", "3", "()", "0", ".", "+/-", "=" }; // ���� ��ư �ؽ�Ʈ
	JButton[] buttons = new JButton[buttonStr.length]; // ���� ��ư ����
	int i;

	public Calculator() {
		super("My Calculator v1.0"); // �̸�
		System.out.println(buttons.length);
		// JTextField ����
		tf = new JTextField("");
		tf.setSize(200, 1000);

		// JPanel �κ�
		panel = new JPanel(new GridLayout(5, 4, 4, 4)); // �г� ����
		panel.setBackground(Color.lightGray);

		// JButton �߰� �κ�
		for (i = 0; i < buttonStr.length; i++) {
			buttons[i] = new JButton("");
			buttons[i].setText(buttonStr[i]);
			buttons[i].setSize(10, 10);
			panel.add(buttons[i]);
			buttons[i].addActionListener(new EventHandler());
		}
		// ������ �߰� �κ�

		// �߰��ϴ� �κ�
		this.add("North", tf); // JTextField �߰�
		this.add(panel);
		this.setSize(400, 600);
		this.setVisible(true);
	}

	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s = " "; // ���ڸ� ���ڿ������� �ٲ��ֱ� ���� ����

			Object obj = e.getSource(); // �̺�Ʈ�� ����� ��ȯ�Ѵ�.

			for (int i = 0; i < buttons.length; i++) {

				if (obj.equals(buttons[i])) { //�ٺ�
					if (obj.equals(buttons[0])) { // c��ư Ŭ����
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
