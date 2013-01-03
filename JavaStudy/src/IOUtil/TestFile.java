package IOUtil;

import java.io.File;

public class TestFile {
	public static void testFile(){
		//testCreateNewFile();
		//testCreateTempFile();
		//testMkdirs();
		testListFiles();
	}
	
	private static void testCreateNewFile(){
		File file=null;
		boolean bool=false;
		
		try{
			
			file=new File("c:/test.txt");
			bool=file.createNewFile();			
			System.out.println("file created"+bool);
			file.delete();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
	}
	
	private static void testCreateTempFile(){
		File file=null;
		File file2=null;
		try{
			file2=new File("c:/");
			file=File.createTempFile("temp", ".txt",file2);
			System.out.println("file path"+file.getAbsolutePath());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
	}
	
	private static void testMkdirs(){
		File file=null;
		boolean bool=false;
		try{
			file=new File("c:/test/test/1/1/1/");
			bool=file.mkdirs();
			System.out.println(file.getAbsolutePath());
		}catch(Exception e){
			
		}finally{
			
		}
	}
	
	private static void testListFiles(){
		File file=null;
		File[] paths;
		try{
			int i=0;
			file=new File("c:/");
			paths=file.listFiles();
			for(File path:paths){
				System.out.println(path);
				if(path.isAbsolute()){
					i++;
				}
			}
			System.out.println(i);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
	}
}
