/**
 * @author VerpHen
 * @date 2013年10月7日  下午11:35:19
 */

package org.verphen.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesDemo {
	public static void main(String[] args) {

		Properties p = new Properties();
		try {
			FileInputStream fs = new FileInputStream(
					"D:\\workspace\\Eclipse\\SelectedJ2SE\\src\\org\\verphen\\io\\test.properties");
			p.load(fs);

			String username = p.getProperty("username");
			String passwd = p.getProperty("passwd");
			System.out.println(username + "=" + passwd);

			fs.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
