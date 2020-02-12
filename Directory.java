package smartCrypho;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

class Directory {
	
	String epinpath = "C://Users/USER/smartCrypho/readyEP";
	String epoutpath = epinpath + "/finish/";
	String dpinpath = "C://Users/USER/smartCrypho/readyDP";
	String dpoutpath = dpinpath + "/finish/";
	
	String getEpinpath() {
		return epinpath;
	}

	void setEpinpath(String epinpath) {
		this.epinpath = epinpath;
	}

	String getEpoutpath() {
		return epoutpath;
	}

	void setEpoutpath(String epoutpath) {
		this.epoutpath = epoutpath;
	}

	String getDpinpath() {
		return dpinpath;
	}

	void setDpinpath(String dpinpath) {
		this.dpinpath = dpinpath;
	}

	String getDpoutpath() {
		return dpoutpath;
	}

	void setDpoutpath(String dpoutpath) {
		this.dpoutpath = dpoutpath;
	}

	void setFolder(String path1, String path2, String path3, String path4) throws IOException, InterruptedException {

		/* 設置路徑及資料夾 */
		File dir1 = new File(path1);
		File dir2 = new File(path2);
		File dir3 = new File(path3);
		File dir4 = new File(path4);
		
		dir1.mkdirs();
		dir2.mkdirs();
		dir3.mkdirs();
		dir4.mkdirs();
		

	}

	void prepareFolder(String path1, String path2, String path3, String path4)
			throws IOException, InterruptedException {

		Directory message = new Directory();
		Path p1 = Paths.get(message.getEpinpath());
		Path p2 = Paths.get(message.getEpoutpath());
		Path p3 = Paths.get(message.getDpinpath());
		Path p4 = Paths.get(message.getDpoutpath());
		// 路徑設定
		/* 確認資料夾是否存在 */
		if (Files.exists(p1) && Files.exists(p2) && Files.exists(p3) && Files.exists(p4)) {
			JOptionPane.showMessageDialog(null, "可開始執行");
		}
		
	}

}
