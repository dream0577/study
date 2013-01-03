package IOUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferedReader {
	public static void testBufferedReader(){
		testReader();
	}
	
	private static void testReader(){
		FileInputStream fis=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		File file=null;
		
		try{
			file=new File("c:/test.txt");
			fis=new FileInputStream(file);
			isr=new InputStreamReader(fis);
			br=new BufferedReader(isr);
			int value=0;
			
			while((value=br.read())!=-1){
				char c=(char)value;
				System.out.println(c);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			
			try {
				if(fis!=null){
					fis.close();
				}
				if(isr!=null){
					isr.close();
				}
				if(br!=null){
					br.close();
				}
			} catch (IOException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
