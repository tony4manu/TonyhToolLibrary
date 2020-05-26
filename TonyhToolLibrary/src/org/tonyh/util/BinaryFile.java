/*
BinaryFile.java	p674

Source (20200208): Thinking in Java- Bruce Eckel 2006;

Reading binary files

This utility is similar to TextFile.java in that it simplifies the process of reading binary files:
*/
package org.tonyh.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFile {
	
	public static byte[] read(File bFile) throws IOException {
		BufferedInputStream bf = new BufferedInputStream(
		new FileInputStream(bFile));
		
		try {
			byte[] data = new byte[bf.available()];
			bf.read(data);
			
			return data;
		} finally {
			bf.close();
		}
	}

	public static byte[]
		read(String bFile) throws IOException {
		return read(new File(bFile).getAbsoluteFile());
	}


}
