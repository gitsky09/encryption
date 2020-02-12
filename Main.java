package smartCrypho;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {

		Directory check = new Directory();
		//設立路徑
		check.setFolder(check.getEpinpath(), check.getEpoutpath(), 
				check.getDpinpath(), check.getDpoutpath());
		//路徑完成發送訊息
		check.prepareFolder(check.getEpinpath(), check.getEpoutpath(), 
				check.getDpinpath(), check.getDpoutpath());
			
		
	
		MyGUI.startGUI();
		
	}
}