package input_output_stream;

import java.io.IOException;

public class IOmain {

	public static void main(String[] args) {

//		ReadFile d = new ReadFile();
//		ReadFileNoThrow noThow =new ReadFileNoThrow();
//		noThow.readAndPrint("C:\\ex\\txt.txt");
		JustPrint j = new JustPrint();
		ReadFileWithThrow read = new ReadFileWithThrow();
		j.printWithoutThrow("C:\\ex\\txt.txt");
		System.out.println();
		
		try {
//			read.printFile("C:\\ex\\txt.txt");
			read.copyFileWithBuffer("C:\\ex\\txt.txt","C:\\ex\\copyTxt.doc");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
