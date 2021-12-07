package smartCrypho;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//圖片解密
public class PictureDecryption extends Directory implements ActionListener {

	public void actionPerformed(ActionEvent arg0) {

		try {
			
			File dir = new File(getDpinpath());
			// 將list資料丟給陣列做處理
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
		

			// 堆疊追蹤
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
