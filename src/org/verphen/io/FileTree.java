package org.verphen.io;

import java.io.File;

/*显示目录下的文件夹和文件名，按照Windows的目录显示*/
public class FileTree {
	private static int count = 0;

	public void showTree(File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			if (files.length != 0) {
				for (File f : files) {
					if (f.isDirectory()) {
						count++;

					} else {
						System.out.println(file.getName());
					}
				}
			}
		} else {
			System.out.println("你传入的是一个文件");
		}
	}

	public void printCount(int i) {
		while (i-- > 0) {
			System.out.print("-");
		}
	}

}
