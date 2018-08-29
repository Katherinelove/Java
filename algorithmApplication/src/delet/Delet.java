package delet;

import java.util.Scanner;

/**
 * delet算法   有序数组，查找下标快速
 * 1.找到要删除元素的下标 delIndex
 * 2.从要删除下标开始，后面一个元素赋值给前面一个元素（即覆盖）
 * 这里有一个bug，数组越界，即只能将最后一个赋值给倒数第二个、
 * numsp[i]=nums[i+1]
 * 3.数组总长度-1
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月7日 下午3:43:55
 */
public class Delet {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		//二分法前提是是有序数组
		int[] nums= {3,12,24,36,48,56,78,99};
		System.out.print("请输入你要delete的整数：");
		int searchNum=console.nextInt();
		
		boolean isFind=false;        //查找标志，默认没有查找到
		int low=0;                   //最小值下标（初始值）
		int hight=nums.length-1;     //最大值下标（初始值）
		int delIndex=-1;          //记录查找值的下标
		
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
				delIndex=mid;
				break;
			}
		}
		
		
		//循环外打印
		if(isFind) {
			System.out.printf("找到了，你将delete的值下标为%d\n",delIndex);
			delete(nums,delIndex);
			printNums(nums);
		}else {
			System.out.println("对不起，没有找到你将删除的数字！");
		}
		
	}

	private static void printNums(int[] nums) {
		// 注意数组最后一个还在，障眼法
		for (int i = 0; i < nums.length-1; i++) {
			System.out.print(nums[i]+"\t");
		}
		
	}

	private static void delete(int[] nums,int delIndex) {
		// TODO Auto-generated method stub
		for (int i =delIndex; i < nums.length-1; i++) {
			//起始值为delIndex  终止时为倒数第二个，注意数组最后一个还在，障眼法
			nums[i]=nums[i+1];
		}
		
	}



}
