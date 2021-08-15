package input_output_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ReadFileWithThrow {
	
	
	public void printFile(String path) throws IOException {
		if(path.isEmpty()) return;
//		FileInputStream fileIn=null;
			File f = new File(path);
			String s="";
			int i=0;	
					try (FileInputStream fileIn = new FileInputStream(f);){
						
						while((i=fileIn.read()) != -1) {
							s=s+(char)i;
						}
						System.out.print(s);
						
					}catch(IOException e) {
						System.out.println("failed via getFile method!: "+i+" "+ e.getMessage());
						throw new IOException(e.getMessage());
					}
}
	
	
	public void copyFileWithBuffer(String srcPath, String dstPath) throws IOException{
		if(srcPath.isEmpty() || dstPath.isEmpty()) return;
		
		File srcFile = new File(srcPath);
		File dstFile = new File(dstPath);
		try(FileInputStream fileIn = new FileInputStream(srcFile);
			FileOutputStream fileout = new FileOutputStream(dstFile);
			BufferedInputStream bfrIn = new BufferedInputStream(fileIn);
			BufferedOutputStream bfrOut = new BufferedOutputStream(fileout)){
			int i=0;
//			bfrIn
			while((i=bfrIn.read()) != -1) {
				bfrOut.write(i);
			}
			}
			
	}
	
	
}
//	public void pp() {
//		 byte[] buffer = new byte[1000];        
//		    try {
//		        FileInputStream fis = new FileInputStream(args[0]);
//		        BufferedInputStream bis = new BufferedInputStream(fis);
//
//		        FileOutputStream fos = new FileOutputStream(args[1]);
//		        BufferedOutputStream bos = new BufferedOutputStream(fos);
//
//		        int numBytes;
//		        while ((numBytes = bis.read(buffer))!= -1)
//		        {
//		            bos.write(buffer);
//		        }
//		        //bos.flush();
//		        //bos.write("\u001a");
//
//		        System.out.println(args[0]+ " is successfully copied to "+args[1]);
//
//		        bis.close();
//		        bos.close();
//		    } catch (IOException e)
//		    {
//		        e.printStackTrace();
//		    }
//	}
//}
