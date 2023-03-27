package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {
	public static final String currentDir=System.getProperty("user.dir");
	public static String filePath=currentDir+"/src/test/resources";
	
	public Properties getProperty(String fileName) throws IOException
	{
		FileInputStream fis=null;
		Properties prop=null;
		try 
		{
			fis=new FileInputStream(filePath+fileName);
			prop=new Properties();
			prop.load(fis);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			fis.close();
		}
		System.out.println("url is :"+prop.getProperty("url"));
		System.out.println("username is :"+prop.getProperty("username"));
		System.out.println("password is :"+prop.getProperty("password"));
		return prop;
	}
}
