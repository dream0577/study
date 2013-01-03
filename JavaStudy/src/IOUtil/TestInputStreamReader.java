package IOUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInputStreamReader {
	public static void testInputStreamReader(){
		testGetEncoding();
	}
	
	private static void testGetEncoding(){
		FileInputStream fis=null;
		InputStreamReader isr=null;
		String str;
		
		try{
			fis=new FileInputStream("c:/test.txt");
			isr=new InputStreamReader(fis);
			str=isr.getEncoding();
			System.out.println(str);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			if(fis!=null){
				try {
					fis.close();
					if(isr!=null){
						isr.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
