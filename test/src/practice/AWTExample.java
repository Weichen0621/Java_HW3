package practice;

//若在import此套件時被限制，問題出在module-info.java，此設定限制了其使用，只要在裡頭加上java.desktop即可，因為java.awt是放在此模組裡
import java.awt.*;
import java.awt.event.*;

public class AWTExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//建立視窗
		Frame frame = new Frame("AWT 範例");

        //顯示文字
		Label label = new Label("Please enter your name");
        
		//輸入文字
		TextField textField = new TextField(30);
        
		Button button = new Button("Send");
        Label result = new Label(" ");

        frame.setLayout(new FlowLayout()); //控制元件排列方式

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(result);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                result.setText("Hello, " + name + "！");
                
                frame.pack();
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setSize(500, 200);
        frame.setVisible(true);
    }
}
