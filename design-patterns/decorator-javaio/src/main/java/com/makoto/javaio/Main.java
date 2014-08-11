package com.makoto.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main
{
	public static void main(String[] args)
	{
		int c;

		try
		{
			InputStream is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/export/test.txt")));

			while ((c = is.read()) > 0)
			{
				System.out.println((char) c);
			}
			
			is.close();
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
