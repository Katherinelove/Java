package collecttion_using;
/**
 * 集合出重，内存出重
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月5日 下午3:53:04
 */
import java.util.*;


public class setUsing {
	
	public static void main(String[] args) {
		//输入一行英文，并分割成word出重
		Scanner console=new Scanner(System.in);
		
		System.out.print("请输入英文：");
		Set words=tokenSet(console.nextLine());
		System.out.printf("不重复的单词有%d个",words.size(),words);

	}
	static Set tokenSet(String line) {
		// TODO Auto-generated method stub
		String[] tokens=line.split(" ");
		 //使用匿名hashset实现收集并去重字符串
		return new HashSet(Arrays.asList(tokens)); 
	}


}
