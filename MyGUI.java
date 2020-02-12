package smartCrypho;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;

class MyGUI {
	static void startGUI() {
		// �إߤ@�ӵ����A�ñN���D�]�w���u�����{���v
		// ���D�i��jframe.setTitle("�����{��");�N��
		JFrame jframe = new JFrame("�[�K�{��");

		// �]�w�ϥ�
		jframe.setIconImage(jframe.getToolkit().getImage("icon.jpg"));

		// �]�w�����j�p(��,�e)
		jframe.setSize(300, 400);

		// �]�w�����}�Үɪ���m�A���H�U��ر`�γ]�w��k
		jframe.setLocation(0, 0); // --> �]�w�����}�Үɥ��W�����y�СA�]�i�a�JPoint����
		jframe.setLocationRelativeTo(null); // --> �]�w�}�Ҫ���m�M�Y�Ӫ���ۦP�A�a�Jnull�h�|�b�e�������}��

		// �����ﶵ(�k�W�����e�e�ϥ�)���U�᪺�ʧ@
		// EXIT_ON_CLOSE�G�I�������ɡA�����{��
		// DISPOSE_ON_CLOSE�G�I�������ɡA������ܪ������H�ΨϥΪ��귽�A�{�����b�I������
		// HIDE_ON_CLOSE�G�I�������ɡA��������ܪ������A�{�����b�I������
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �]�w������ܡA�Y���]�w�����u�|�b�I������
		jframe.setVisible(true);
		// ��2X2�����s�C�A�����غc�l�W��
		jframe.getContentPane().setLayout(new GridLayout(2, 2));
		Button button1 = new Button("�}�l�[�K");
		Button button2 = new Button("�}�l�ѱK");
		Button button3 = new Button("�[�K��Ƨ�");
		Button button4 = new Button("�ѱK��Ƨ�");
		// �bjframe�[�Jbutton1~4
		jframe.add(button1);
		jframe.add(button2);
		jframe.add(button3);
		jframe.add(button4);
		// �bbutton�[�J��ť�ʧ@1~4
		PictureEncryption pe1 = new PictureEncryption();
		button1.addActionListener(pe1);
		PictureDecryption pd2 = new PictureDecryption();
		button2.addActionListener(pd2);
		// OpenEncryptionDirectory open3 = new OpenEncryptionDirectory();
		// �ΦW���O�����t�~��@�A<<patameter>>&<<implment>>
		button3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				//�L�W����I�s
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
