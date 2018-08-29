package define_io_by_self;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

import javax.swing.text.AbstractDocument.Content;

/**
 * ������װ�������������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��27�� ����8:06:57
 */
public class MyIO {
	/**
	 * ���ֽ��������ʽ��ȡ
	 * @param pathname
	 * @return
	 * @throws IOException
	 */
	public String readFileByBufferInputStream(String pathname) throws IOException {
	
		// ���ļ�
		File file=new File(pathname);
		if(!file.exists()) {
			//�ļ������ڣ����´���
			file.createNewFile();
		}
		
		//�����Զ��ر���Դ  ������ǰ
		InputStream inStream=null;
		BufferedInputStream bufferInStream=null;
		
		inStream=new FileInputStream(file);
		bufferInStream=new BufferedInputStream(inStream);
		
		//��ȡ����(���ַ���)
		byte[] bytes=new byte[inStream.available()];
		//����ֱ�Ӷ�ȡ
		bufferInStream.read(bytes);
		System.out.println("��ȡ�ļ��ɹ���");
		
		bufferInStream.close();
		inStream.close();
		
		return new String(bytes);
	}
	/**
	 * ���ֽ��������ʽ��ȡ
	 * @param content  ��ȡ����
	 * @param pathname  file·����Ŀ¼
	 */
	public void writeFileByBufferOutStream(String content,String pathname) {
		try(BufferedOutputStream bufferOutStream=
				new BufferedOutputStream(
						new FileOutputStream(new File(pathname)))) {
			bufferOutStream.write(content.getBytes());
			System.out.println("д��ɹ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	/**
	 * ��ȡ�ַ�
	 * @param pathname
	 * @return
	 */
	public String readFileByReader(String pathname) {
		//�洢����
		StringBuffer content=new StringBuffer();
		File file=new File(pathname);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try(Reader reader=new FileReader(file);
			BufferedReader breader=new BufferedReader(reader);) {
			//�����ȡ����  �������ַ�����
			String line=null; 
			while((line=breader.readLine())!=null) {
				content.append(line);
			}
			System.out.println("��ȡ��ϣ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content.toString();
	}
	public void writeFileByWriter(String content,String pathname,boolean append) {
		try(Writer writer= new FileWriter(pathname,append);
			BufferedWriter bwriter=new BufferedWriter(writer);){
			bwriter.write(content);
			System.out.println("д����ϣ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
