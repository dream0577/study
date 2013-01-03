package IOUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class TestFileInputStream {
	public static void testFileInputStream(){
		testAvailable();
		testGetChannel();
	}
	
	public static void testAvailable(){
		File file=null;
		FileInputStream fis=null;
		int available=0;
		int i=0;
		try{
			file=new File("c:/test.txt");
			fis=new FileInputStream(file);
			
			while((i=fis.read())!=-1){
				available=fis.available();
				char c=(char)i;
				System.out.println("available"+available+"  Read"+c);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void testGetChannel(){
		File file=null;
		FileChannel fc=null;
		FileInputStream fis=null;
		int i=0;
		long pos;
		char c;
		
		try{
			file=new File("c:/test.txt");
			fis=new FileInputStream(file);
			while((i=fis.read())!=-1){
				fc=fis.getChannel();
				pos=fc.position();
				c=(char)i;
				System.out.print("No of bytes read"+pos);
				System.out.println("  char read:"+c);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			
		}
	} 
}
