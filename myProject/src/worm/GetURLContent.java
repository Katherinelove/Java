package worm;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import define_io_by_self.MyIO;

/**
 * �򵥻�ȡ��ҳ��Ӧ����
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��30�� ����10:16:15
 */
public class GetURLContent {
	public static final String PathName="����.html";
	//ֻ����httpЭ��
	public static final String Url="http://www.163.com/index.html/";
	public static void main(String[] args) throws MalformedURLException {
		//д���ļ���֮ǰ�ķ���
		MyIO myIO=new MyIO();
		
		URL url=new URL(Url);
		try(BufferedReader breader=new BufferedReader
				(new InputStreamReader(url.openStream()))){
			 //��ȡ����
			StringBuffer content=new StringBuffer();
			String line=null;
			while((line=breader.readLine())!=null) {
				System.out.println(line);
				//ÿ��д��
				content.append(line);
				content.append(System.getProperty("line.separator"));
			}
			//�洢
			myIO.writeFileByWriter(content.toString(), PathName, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}
	
	
	

}
