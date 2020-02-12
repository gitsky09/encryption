package smartCrypho;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;

class MyGUI {
	static void startGUI() {
		// 建立一個視窗，並將標題設定為「視窗程式」
		// 標題可用jframe.setTitle("視窗程式");代替
		JFrame jframe = new JFrame("加密程式");

		// 設定圖示
		jframe.setIconImage(jframe.getToolkit().getImage("icon.jpg"));

		// 設定視窗大小(長,寬)
		jframe.setSize(300, 400);

		// 設定視窗開啟時的位置，有以下兩種常用設定方法
		jframe.setLocation(0, 0); // --> 設定視窗開啟時左上角的座標，也可帶入Point物件
		jframe.setLocationRelativeTo(null); // --> 設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟

		// 關閉選項(右上角的叉叉圖示)按下後的動作
		// EXIT_ON_CLOSE：點選關閉時，關閉程式
		// DISPOSE_ON_CLOSE：點選關閉時，關閉顯示的視窗以及使用的資源，程式仍在背景執行
		// HIDE_ON_CLOSE：點選關閉時，僅隱藏顯示的視窗，程式仍在背景執行
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 設定視窗顯示，若未設定視窗只會在背景執行
		jframe.setVisible(true);
		// 做2X2的按鈕列，給予建構子名稱
		jframe.getContentPane().setLayout(new GridLayout(2, 2));
		Button button1 = new Button("開始加密");
		Button button2 = new Button("開始解密");
		Button button3 = new Button("加密資料夾");
		Button button4 = new Button("解密資料夾");
		// 在jframe加入button1~4
		jframe.add(button1);
		jframe.add(button2);
		jframe.add(button3);
		jframe.add(button4);
		// 在button加入監聽動作1~4
		PictureEncryption pe1 = new PictureEncryption();
		button1.addActionListener(pe1);
		PictureDecryption pd2 = new PictureDecryption();
		button2.addActionListener(pd2);
		// OpenEncryptionDirectory open3 = new OpenEncryptionDirectory();
		// 匿名類別直接另外實作，<<patameter>>&<<implment>>
		button3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				//無名物件呼叫
				try {
					Runtime.getRuntime().exec("cmd /c start " + new Directory().getEpinpath());
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});
		button4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Runtime.getRuntime().exec("cmd /c start " + new Directory().getDpinpath());
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});

	}
}
