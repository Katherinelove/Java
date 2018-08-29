package define_io_by_self;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/**
 * ������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��27�� ����8:29:55
 */
public class MyIOTest {
	public static final String pathname1="1.html"; 
	private static final String separator=System.getProperty("line.separator");
	public static void main(String[] args) {
		String content="<head>";
		content+=separator;
		content+="<meta charset=\"utf-8\">";
		content+=separator;
		content+="</head>";
		content+=separator;
		content+="<body>";
		content+="<li> ������";
		content+="</body>";
		
		MyIO myIo=new MyIO();
		myIo.writeFileByBufferOutStream(content, pathname1);
		String str=null;
		try {
			str = myIo.readFileByBufferInputStream(pathname1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str);
		
		content+="2018/8/27";
		myIo.writeFileByWriter(content, pathname1, true);
		str=myIo.readFileByReader(pathname1);
		System.err.println(str);
	}
}
