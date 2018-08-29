package stringbufferusing;
/**
 * sringbuffer与stringbuilder的运用
 * 表示带缓存的字符串  默认多加16字节空间，拼接是不需要new对象
 * 实现对字符串的增删改查
 * stringbuilder比sringbuffer更快
 * 但是stringbuilder比sringbuffer不安全，多线程同步，多人可以同时修改
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月19日 上午11:04:05
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer strBuffer=new StringBuffer("abcd");
		//增
		strBuffer.append("love");
		System.out.println(strBuffer);
		strBuffer.insert(0, "hello");
		System.out.println(strBuffer);
		//删
		strBuffer.deleteCharAt(1);
		System.out.println(strBuffer);
		//改
		strBuffer.replace(0, 2, "hehe");
		System.out.println(strBuffer);
		//倒序
		strBuffer.reverse();
		System.out.println(strBuffer);
		

	}

}
