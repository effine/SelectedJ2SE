/**
 * @author VerpHen
 * @date 2013��9��29��  ����4:34:17
 */

package org.verphen.test;

import java.io.File;

public class Demo {
	public static void main(String[] args) {

		String path = "D:\\test";
		File file = new File(path);

		System.out.println(file.getName());

	}
}
