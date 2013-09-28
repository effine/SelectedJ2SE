package org.verphen.io;

import java.io.File;

/*��ʾĿ¼�µ��ļ��к��ļ���������Windows��Ŀ¼��ʾ*/
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
			System.out.println("�㴫�����һ���ļ�");
		}
	}

	public void printCount(int i) {
		while (i-- > 0) {
			System.out.print("-");
		}
	}

}
