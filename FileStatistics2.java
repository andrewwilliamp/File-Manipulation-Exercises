import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

/*
Create a file that contains your favorite movie quote. Use a text editor, such as Notepad, and save the file as Quote.txt.
Copy the file contents and paste them into a word processing program, such as Word. Save the file as Quote.doc. Write an application that displays
the sizes of the two files as well as the ratio of the two file sizes. Save the file as FileStatistics2.java.
*/

public class FileStatistics2
{
    public static void main(String[] args)
    {
        Path file1Path = Paths.get("C:\\Rio Salado\\CIS263DA\\Quote.txt");
        Path file2Path = Paths.get("C:\\Rio Salado\\CIS263DA\\Quote.docx");

        try
        {
            BasicFileAttributes attrFile1 = Files.readAttributes(file1Path, BasicFileAttributes.class);
            BasicFileAttributes attrFile2 = Files.readAttributes(file2Path, BasicFileAttributes.class);

            long fileSize1 = attrFile1.size();
            long fileSize2 = attrFile2.size();

            System.out.println("File Name: " + file1Path.getFileName() + " Size: " + fileSize1 + "bytes");
            System.out.println("File Name: " + file2Path.getFileName() + " Size: " + fileSize2 + "bytes");

            double ratio = (double) fileSize1 / fileSize2;
            System.out.println("File Size Ratio: " + ratio);

        }
        catch (IOException e)
        {
            System.out.println("Error: " + e);
        }
    }
}
