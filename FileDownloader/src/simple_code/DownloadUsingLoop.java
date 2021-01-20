package simple_code;
import org.apache.commons.io.FilenameUtils;
import java.io.*;
import java.net.URL;
import java.util.Scanner;
public class DownloadUsingLoop {

	public static void main(String arsg[])
	{
		//URL must have extension of file
		System.out.println("Enter file url...");
		Scanner sc=new Scanner(System.in);
		String url=sc.next();
		try {
		URL u1=new URL(url);
		u1.openConnection().getContentLength();
		BufferedInputStream bis=new BufferedInputStream(u1.openStream());
		System.out.println("Enter file Name");
		String name=sc.next();
		FileOutputStream out=new FileOutputStream("C:\\Users\\Saurabh\\Downloads\\"+name+"."+
						FilenameUtils.getExtension(url));
		byte data[]=new byte[1024];
		int count;
		while((count=bis.read(data,0,1024))!=-1)
		{
					
			out.write(data,0,count);
		}
		System.out.println("Download sucessfully completed");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong...");
		}
		
	}
}