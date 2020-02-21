package cog.cts.twentyfirst;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// FileOutputStream out = new FileOutputStream("C:\\Users\\seed\\Desktop\\javaa\\data.txt");
		String path ="C:\\Users\\seed\\Desktop\\javaa\\data.txt";
		FileOutputStream out = new FileOutputStream(path,true); //to append
		String message = "abc abca abcaabca";
		byte b[]= message.getBytes();
		out.write(b);
		out.close();
}
}
