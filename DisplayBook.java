import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

/*
Write an application using the FileInputStream that opens a file which contains
the name of the user's favorite book and then displays it to the user.
If the file does not exist, prompt the user for the book's title, and then write
it to the file by using a FileOutputStream. Save the file as DisplayBook.java.
 */

public class DisplayBook {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        Path file = Paths.get("C:\\Rio Salado\\CIS263DA\\book.txt");
        InputStream input = null;
        try
        {
            input = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String favBook = null;
            favBook = reader.readLine();
            System.out.println("Your favorite book is: " + favBook);
            input.close();
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e);
            System.out.println("File Not Found. Please enter the name of your favorite book: ");

            String userInput = scnr.nextLine();
            byte[] data = userInput.getBytes();

            OutputStream output = null;
            output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            output.write(data);
            output.flush();
            output.close();
        }
    }
}

