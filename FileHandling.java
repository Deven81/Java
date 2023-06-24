package ForPractiesAll.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File fl=new File("D:\\file\\SampleFile.txt");
		if(fl.createNewFile()) {
			System.out.println("file is created succesfully :"+fl.getAbsolutePath());
		}else {
			System.out.println("file already present");
			System.out.println("get file name:"+fl.getName());
			System.out.println("can read file :"+fl.canRead());
			System.out.println("can write file :"+fl.canWrite());
		}
		
		if(fl.exists()) {
			FileWriter fw=new FileWriter(fl);
			fw.write("jalgoan");
			fw.close();
		}
		
		Scanner sc=new Scanner(fl);
		while(sc.hasNext()) {
			String fd=sc.nextLine();
			System.out.println(fd);
		}
		
		if(fl.delete()) {
			System.out.println("file delete succesfully");
		}else {
			System.out.println("file not deleted");
		}
	}

}
