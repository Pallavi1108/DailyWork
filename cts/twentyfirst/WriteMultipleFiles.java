package cog.cts.twentyfirst;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteMultipleFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String path1 ="C:\\Users\\seed\\Desktop\\javaa\\cse.txt";
		String path2 ="C:\\Users\\seed\\Desktop\\javaa\\it.txt";
		String path3 ="C:\\Users\\seed\\Desktop\\javaa\\ec.txt";
		 String path4 ="C:\\Users\\seed\\Desktop\\javaa\\me.txt";

		 FileOutputStream out1 = new FileOutputStream(path1);
		 FileOutputStream out2 = new FileOutputStream(path2);
	 FileOutputStream out3 = new FileOutputStream(path3);
		 FileOutputStream out4 = new FileOutputStream(path4);
		 ByteArrayOutputStream bout = new ByteArrayOutputStream();
		 
		 String data ="This is a common data to be written in files";
		 byte[] b = data.getBytes();
		 
		 bout.write(b);
		 bout.writeTo(out1);
		 bout.writeTo(out2);
		 bout.writeTo(out3);
		 bout.writeTo(out4);
	}

}
