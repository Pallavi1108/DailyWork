package cog.cts.twentyfirst;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
public class ReadMultipleFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String path1 ="C:\\Users\\seed\\Desktop\\javaa\\cse.txt";
		String path2 ="C:\\Users\\seed\\Desktop\\javaa\\data.txt";
		FileInputStream fin1 = new FileInputStream(path1);
		FileInputStream fin2 = new FileInputStream(path2);
		
		SequenceInputStream sis = new SequenceInputStream (fin1, fin2);
	
	int i;
	while((i = sis.read()) != -1) {
		System.out.print((char)i);
	}
}
}