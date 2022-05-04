package com.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreateFile {

	
	public void getfile(File file)
	{
	
		try {
			FileOutputStream out=new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
