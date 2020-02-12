package smartCrypho;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//�Ϥ��ѱK
public class PictureDecryption extends Directory implements ActionListener {

	public void actionPerformed(ActionEvent arg0) {

		try {
			// �Ѯv�g��Ū����Ƨ�
			File dir = new File(getDpinpath());
			// �Nlist��ƥᵹ�}�C���B�z
			if (dir.isDirectory()) {
				File[] files = dir.listFiles();
				for (int i = 0; i < files.length; i++) {
					File decryFile = files[i];
					if (decryFile.isFile() /*&& decryFile.getName().toLowerCase().endsWith("jpg")*/) {
						BufferedInputStream bis = new BufferedInputStream(new FileInputStream(decryFile));
						BufferedOutputStream bos = new BufferedOutputStream(
								new FileOutputStream(getDpoutpath() + decryFile.getName()));
					
							
						int b;
						while ((b = bis.read()) != -1) {
							bos.write(b ^ 123);
						}

						bis.close();
						bos.close();

					}
				}
			}
		

			// ���|�l��
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}