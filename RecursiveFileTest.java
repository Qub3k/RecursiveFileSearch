import java.lang.*;
import java.io.File;

/**
 * Program is recursively listing files in a given directory. 
**/

public class RecursiveFileTest {
	private static int lvl = 0;

	public static void main(String[] args) {
		File baseFile = new File("/home/qub3k/workspace/server/src/main/resources");
		listFiles(baseFile);
		System.exit(0);
		}

	public static void listFiles(File baseFile) {
		if(baseFile.isDirectory()) {
			for (int i = 0; i < lvl; i++) 
				System.out.print(' ');
			System.out.print(baseFile.getName() + '/' + '\n');
			lvl++;
			// including indentation
			File[] filesInside = baseFile.listFiles();
			for(File file : filesInside) {
				listFiles(file);
			}
			if (lvl > 0) lvl--;
		}
		else {
			for (int i = 0; i < lvl; i++)
				System.out.print(' ');
			System.out.print(baseFile.getName() + '\n');
		}
	}
}