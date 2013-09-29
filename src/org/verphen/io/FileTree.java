package org.verphen.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*显示目录下的文件夹和文件名，按照Windows的目录显示*/
public class FileTree {
	private static int count = 1;

	public void showTree(File file) {
		System.out.println(file.getName());
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			if (files.length != 0) {
				List<File> filelist = null;
				List<File> dirlist = null;
				for (File f : files) {

					if (f.isFile()) {
						filelist = new ArrayList<File>();
						filelist.add(f);
					} else {
						dirlist = new ArrayList<File>();
						dirlist.add(f);
						count++;
						showTree(f);
					}
				}

				printCount(count);
				printFile(dirlist);
				printFile(filelist);
			}
		}
	}

	public void printCount(int i) {
		while (i-- > 0) {
			System.out.print("--");
		}
	}

	public void printFile(List<File> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void main(String[] args) {
		String path = "D:\\test";
		File file = new File(path);
		System.out.println("----------------" + path + "-------------------");
		new FileTree().showTree(file);
	}
}
