package binaryFind;

import java.util.Scanner;

/**
 * 二分法查找：前提是必须是有序数列
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月7日 下午2:52:42
 */
public class BinaryFind {
//	基本原理
//	首先将要查找的元素（key）与数组的中间元素比较
//	1.如果Key比中间元素小，只要在数组的前一半元素中继续查找（high=mid-1）
//	2.如果Key和中间元素相等，匹配成功， 查找结束
//	3.如果Key比中间元素大，只要在数组的后一半元素中继续查找（low=mid+1）
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		//二分法前提是是有序数组
		int[] nums= {3,12,24,36,48,56,78,99};
		System.out.print("请输入你要查找的整数：");
		int searchNum=console.nextInt();
		
		boolean isFind=false;        //查找标志，默认没有查找到
		int low=0;                   //最小值下标（初始值）
		int hight=nums.length-1;     //最大值下标（初始值）
		int searchIndex=-1;          //记录查找值的下标
	
		//不知道查找次数
		while(hight>=low) {
			int mid=(hight+low)/2;   //中间值标
			if(searchNum<nums[mid]) {      //记录的是下标，比较的是值nums[下标]
				hight=mid-1;
			}else if(searchNum>nums[mid]) {
				low=mid+1;
			}else {
				//最后情况 三位一体hight=low=mid
				isFind=true;
				searchIndex=mid;
				break;
			}
		}
		
		
		//循环外打印
		if(isFind) {
			System.out.printf("找到了，你查找的值下标为%d\n",searchIndex);
		}else {
			System.out.println("对不起，没有找到你查找的数字！");
		}
		
	}

}
