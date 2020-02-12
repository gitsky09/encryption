package smartCrypho;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class PictureEncryption extends Directory implements ActionListener {
	

	public void actionPerformed(ActionEvent arg0) {
	
		try {
			
			File dir = new File(getEpinpath());
			
			if (dir.isDirectory()) {
				File[] files = dir.listFiles();
				for (int i = 0; i < files.length; i++) {
					File encryFile = files[i];
					if (encryFile.isFile() /*&& encryFile.getName().toLowerCase().endsWith("jpg")*/) {
						BufferedInputStream bis = new BufferedInputStream(new FileInputStream(encryFile));
						BufferedOutputStream bos = new BufferedOutputStream(
								new FileOutputStream(getEpoutpath() + encryFile.getName()));

						int b;
						while ((b = bis.read()) != -1) {
							bos.write(b ^ 123);
						}

						bis.close();
						bos.close();

					}
				}
			}
		

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

