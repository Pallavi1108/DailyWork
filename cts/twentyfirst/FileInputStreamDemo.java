package cog.cts.twentyfirst;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileInputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String path ="C:\\Users\\seed\\Desktop\\javaa\\data.txt";
		String newPath ="C:\\Users\\seed\\Desktop\\javaa\\copy.txt"; // to copy data in another folder
		File File = new File(path);
		//System.out.println("File Name : " +File.getName());
		//System.out.println("File length : " +File.length());
		//System.out.println("Parent Name : " +File.getParent());
		FileInputStream in = new FileInputStream(File);
		BufferedInputStream bin = new BufferedInputStream(in);
		 FileOutputStream out = new FileOutputStream(newPath);
		 BufferedOutputStream bout = new BufferedOutputStream(out);
		int i;
		while((i = bin.read()) != -1) {
			//System.out.print(i);
		//	System.out.print((char)i);
			bout.write(i); 
			
		}
		bout.close();
	}
}
