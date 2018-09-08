package accessiblefiledemo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ����λ�ö�д�ļ���seek������������ָ���λ��
 * ����һ���������࣬�ѹ�ʱ,ֻ�����ֽڵķ�ʽ��ȡ
 * ÿ��дһ�Σ���������ָ�룬����ʧ��
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��9��4�� ����9:15:48
 */
public class AccessibleFileDemo {
	public static final String PathName1="D:/mygit/laojiuxuetang/myProject/files/RandomFile.txt";
	public static final String PathName2="D:/mygit/laojiuxuetang/myProject/files/RandomFile����.txt";
	public static void main(String[] args) {
		File file=new File(PathName1);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try(RandomAccessFile randfile=
				new RandomAccessFile(file, "rw")){
			randfile.setLength(0);     //���
			for (int i = 0; i < 2000; i++) {
				randfile.writeInt(i+2000);
			}
			//��ȡ
			System.out.println("��ǰ�ļ���СΪ��"+randfile.length()+"�ֽڣ�");
			randfile.seek(4*8);   //����4�ֽ�  �൱�ڵ�8����
			System.out.println("�ƶ�8���ֽڣ�"+randfile.readInt());
			randfile.seek(4*800);   //����4�ֽ�  �൱�ڵ�800����
			System.out.println("�ƶ�800���ֽڣ�"+randfile.readInt());
			//�޸ĵ�ǰָ�������
			randfile.seek(4*800);
			randfile.writeInt(520);
			randfile.seek(4*800);
			System.out.println("�޸��Ժ��ֽڣ�"+randfile.readInt());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		copy();
	}
	public static void copy() {
		//�����ļ��������
		try(
			RandomAccessFile rfile1=new RandomAccessFile(new File(PathName1), "r");
				RandomAccessFile rfile2=new RandomAccessFile(new File(PathName2), "rw");
				){
			//���Ĵ���  ���ֽ�������ʽ��ȡ
			int filelength=(int) rfile1.length();
			byte[] bytes=new byte[filelength];
			rfile1.readFully(bytes);
			rfile2.write(bytes);
			System.out.println("�ļ����Ƴɹ���");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
