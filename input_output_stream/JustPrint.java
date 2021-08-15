package input_output_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class JustPrint {
	
	public String printWithoutThrow(String path) {
	File fSrc = new File(path);
	String s="";
	int i = 0;
	try(FileInputStream fileIn=new FileInputStream(fSrc)){
		while((i=fileIn.read()) != -1) {
		s+=((char)i+"");
		}
		System.out.println(s);
	}catch(IOException e) {
		System.out.println(" No throw but failed");
	}
	return s;
	}
	
	public void copyWithoutThrow(String pathSrc, String pathDst) {
		File fSrc = new File(pathSrc);
		File fDst = new File(pathDst);
		int i =0;
		try(FileInputStream fileIn=new FileInputStream(fSrc);){
			while((i=fileIn.read()) != -1) {
//			s+=((char)i+"");
			}
			System.out.println();
		}catch(IOException e) {
			System.out.println(" No throw but failed");
		}
		
	}
}
