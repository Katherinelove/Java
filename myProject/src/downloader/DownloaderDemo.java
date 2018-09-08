package downloader;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.swing.text.AbstractDocument.Content;

/**
 * ����RandomAccessibleFile�ֿ������ļ�
 * 1.��Http���ӣ�����������ݵĳ��ȣ���ʽ�̶���
 * 2.����RandomAccessFile����
 * 3.�����ص����ݻ��浽�ֽ�������
 * 4.�������ֽ�����ͨ��RandomAccessFile����д�뵽�ļ��У��漰��һ���ļ�ָ�������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��9��4�� ����10:11:41
 */
public class DownloaderDemo {
	//����������ַ
	static final String StrUrl="http://www.xuetang9.com/video/xuetang9_intro.mp4";
	static final String PathName="myProject/files/";
	//����Ĭ�ϻ���  1M
	static final int MAX_BUFFER_SIZE=10240;
	public static void main(String[] args) {
		//��������
		HttpURLConnection connection=null;
		BufferedInputStream bInStream=null;
		RandomAccessFile rfile=null;
		try {
			URL url=new URL(StrUrl);
			System.out.println(url.getFile());
			
			//��ȡ������ ��������.openConnection()   ����.openStream()
			connection=(HttpURLConnection) url.openConnection();
			//��������Բ��� �ر�
			
			//��������-Range�ӷ����������ֽ����ķ�Χ  0-��ʾ��ָ����ֹ�ֽ���
			connection.addRequestProperty("Range", "bytes=0-");
			connection.connect();   //��ʽ�����Ϸ�����
			
			//�ж��Ƿ����ӳɹ�200-299
			if(connection.getResponseCode()/100!=2) {
				System.out.println("δ���ӵ��������������ԣ�");
				return;
			}
			
			//��ȡ�ļ���С
			int fileSize=connection.getContentLength();
			
			//Ҫ�������������Buffer**��װ��һ��   �����Ļ�������Ĭ�ϻ���
			bInStream=new BufferedInputStream(connection.getInputStream(),MAX_BUFFER_SIZE);
			
			int downloaded=0;  //�Ѿ����ص��ֽ������������㵱ǰ���صİٷֱ�
			String fileName=url.getFile();   //Ϊ��ֻ��ȡ����ļ���
			fileName=fileName.substring(fileName.lastIndexOf("/")+1);
			
			//����RandomAccessFile��д����
			rfile=new RandomAccessFile(new File(PathName+fileName), "rw");
			rfile.setLength(0);   //�ļ�����
			//���Ĵ���
			while(downloaded<fileSize) {//��ǰ�Ѿ�������<�ļ���С����������
				byte[] buffer=null;   //���ػ�������
				if(fileSize-downloaded>MAX_BUFFER_SIZE) {
					buffer=new byte[MAX_BUFFER_SIZE];  //δ���ص��ļ�������󻺴棬�ѻ��浥λ����
					}else {
						buffer=new byte[fileSize-downloaded];  //δ����С�ڵ�����󻺴棬����ʣ��ļ���
					}
				//��ȡ�ļ�
				int read=rfile.read(buffer);     //read Ϊ���ص��ֽ���
				//�����ж�ʲôʱ����ֹ
				if(read==-1) break;   //�������
				//����ǰ�ļ�д���ļ���ȥ
			
				rfile.seek(downloaded);  //�����ļ�ָ��
				rfile.write(buffer, 0, read);
				downloaded+=read;     //��ȡ���٣�����������
				
				System.out.println("��ǰ���ؽ��ȣ�"+downloaded*1.0/fileSize*100+"%");
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				rfile.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				bInStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			connection.disconnect();   //�ر����Ӷ���
		}
		

	}

}
