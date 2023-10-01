import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

/*
Create a file by using any word processing program or text editor. Write an application that displays 
the file's name, size, and time of last modification. Save the file as FileStatistics.java.
/*

public class FileStatistics
{
	public static void main(String[] args) 
	{
		Path filePath = Paths.get("C:\\Rio Salado\\CIS263DA\\Exercise1.txt");
		
		try 
		{
		  BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);
		  
		  System.out.println("File Name: " + filePath.getFileName());
		  System.out.println("File Size: " + attr.size());
		  System.out.println("Last Modified: " + attr.lastModifiedTime());
		}
		catch (IOException e)
		{
		    System.out.println("Error: " + e);
		}
	}
}
