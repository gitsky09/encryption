package smartCrypho;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {

		Directory check = new Directory();
		//�]�߸��|
		check.setFolder(check.getEpinpath(), check.getEpoutpath(), 
				check.getDpinpath(), check.getDpoutpath());
		//���|�����o�e�T��
		check.prepareFolder(check.getEpinpath(), check.getEpoutpath(), 
				check.getDpinpath(), check.getDpoutpath());
			
		
	
		MyGUI.startGUI();
		
	}
}