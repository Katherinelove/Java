package chooselover;

import java.util.Scanner;


/**
 * 后宫选妃
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月8日 上午10:35:35
 */
public class ChooseLover {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//娘娘的初始个数
		int loveCount=5;
		//姓名数组 ,预留空间,最多十个妃子
		String[] names= {"西施","貂蝉","王昭君","杨玉环","甄姬","","","","",""};
		//冷宫娘娘数组
		String[] lgNames=new String[] {"","","","","","","","","",""};
		
		//级别数组
		String[] levelNames= {"贵人","贵妃","贵人","皇贵人","皇后"};
		//对应级别与levelNames一起使用
		int[] level= new int[10];
		//好感度
		int[] love=new int[10];
		//设置默（5）认好感度100；
		for (int i = 0; i <love.length ; i++) {
			love[i]=100;
		}

		//游戏初始值为第1天，默认总共10天
		int gameday=1;
		
		
		//主循环
		while(gameday<=10) {
			//打印菜单
			printMenu(gameday);
			// 选择操作
			int choose=input.nextInt();
			//防止输入对应整数出错
			switch (choose) {
			case 1:
				// 1、皇帝下旨选妃\t\t（增加)  插入，判断先行条件
				if(loveCount==names.length) {
					System.out.println("皇帝陛下，后宫已经人满为患，已经无米之炊，选妃失败！");
					break;
				}else {
					//增加   姓名数组  好高度数组 级别数组  默认个数
					System.out.print("陛下，请输入娘娘名讳：");
					String newName=input.next();
					//姓名数组，默认个数的下标
					names[loveCount]=newName;
					//初始级别都为贵人不变
					//初始好感度100，其他妃子好感度-10
					for (int i = 0; i < loveCount; i++) {
						love[i]-=10;
					}
					System.out.println("纳妃:"+names[loveCount]+"成功！");
					System.out.println("其他妃子好感度-10！！！"+loveCount);
					loveCount++;
				}
				break;
			case 2: //翻牌宠幸\t\t（修改状态）  先查找，再宠幸（+20，其他-10）
				System.out.print("陛下，请输入娘娘名讳：");
				String name=input.next();
				//记录查询的下标
				int searchIndex=Integer.MIN_VALUE;
				
				//未排序， for()顺序查找查找,循环外判断操作，减少内存开出
				for (int i = 0; i < loveCount; i++) {
					//字符串比较
					if(name.compareTo(names[i])==0) {
						searchIndex=i;
						break;
					}
				}
				if(searchIndex==Integer.MIN_VALUE) {
					System.out.println("陛下，不要活在梦里，要面对现实！");
					break;   //可要可不要；后面有一个break；直接终止，可加break；
				}else {
					//查找到之后，宠幸操作(+20，级别升一级)
					love[searchIndex]+=20;
					//升级
					if(level[searchIndex]>=levelNames.length) {
						System.out.println(names[searchIndex]+"已经母仪天下！");
					}
					level[searchIndex]++;
					
					for (int i = 0; i < loveCount; i++) {
						//已结宠幸的必须跳过
						if(i==searchIndex) {
							continue;
						}else {
							love[i]-=10;
						}						
					}			
				}
				//打印信息
				System.out.println("宠幸"+names[searchIndex]+"成功！好感度+20，其他娘娘-10！");
				System.out.println(names[searchIndex]+"升级为"+levelNames[level[searchIndex]]);
			    break;
			case 3:  //3、打入冷宫\t\t（删除）
				System.out.print("陛下，请输入罪妃名字：");
				String lgName=input.next();
				//查找删除娘娘的下标
				int searchLgNameIndex=Integer.MIN_VALUE;
				for (int i = 0; i < loveCount; i++) {
					if(lgName.equals(names[i])) {
						searchLgNameIndex=i;
					}
				}
				if(searchLgNameIndex==Integer.MIN_VALUE) {
					System.out.println("陛下，后宫无此罪人！"+lgName+"！\n请重新赐罪：");
					continue;
				}else {
					//打入冷宫  有bug 会挤掉同一位置的嬢嬢
					//计算冷宫中的妃子数目
					int countLg=0;
					for (int i = 0; i < lgNames.length; i++) {
						if(!(lgNames[i].equals(""))) {
							countLg++;
						}
					}
					//调试数组越界
//					System.out.println(countLg+"---"+searchLgNameIndex);
					lgNames[countLg]=names[searchLgNameIndex];
					//删除妃子
					for (int i =searchLgNameIndex ; i < loveCount; i++) {
						names[i]=names[i+1];
					}
					loveCount--;
					System.out.println(lgNames[countLg]+"被打入冷宫！");
				}
			    break;
			case 4://4、朕的爱妃呢\t\t（查找）
				System.out.print("陛下，请输入梦里寻她千百的娘娘：");
				String searchName=input.next();
				//查找删除娘娘的下标
				int searchIdx=Integer.MIN_VALUE;
				for (int i = 0; i < loveCount; i++) {
					if(searchName.equals(names[i])) {
						searchIdx=i;
					}
				}
				if(searchIdx==Integer.MIN_VALUE) {
					System.out.println("陛下，别活在梦里，要面对现实!没有此"+searchName+"娘娘！");
				}
				else {
					System.out.println(names[searchIdx]+":陛下，臣妾在此！");
				}
			    break;
			default:
				System.out.println("必须输入1-4之间的整数!");
				//为了防止这次循环导致天数加1
				continue;
			}
			//三个娘娘好感度低于60则，发生暴乱，强制退出
			//计算好感度低于60的娘娘个数
			int countLowLove=0;
			for (int i = 0; i < loveCount; i++) {
				if(love[i]<60) {
					countLowLove++;
				}
			}
			if(countLowLove>=3) {
				System.out.println("至少三个娘娘好感度低于60；后宫暴乱，强制退出！");
				System.exit(0);
			}
			
			//每一次选择，打印后宫信息
			printLove(loveCount,names,levelNames,level,love);
			gameday++;
		}
		
	}


	private static void printLove(int loveCount, String[] names, String[] levelNames, int[] level,int[] love) {
		// 注意娘娘数目的变化
		System.out.println("姓名\t级别\t好感度");
		System.out.println("========================================");
		for (int i = 0; i <loveCount; i++) {
			System.out.println(names[i]+"\t"+levelNames[level[i]]+"\t"+love[i]);
		}
		//空两行
		System.out.println();
		System.out.println();
	}


	private static void printMenu(int gameday) {
		// TODO Auto-generated method stub
		System.out.println("游戏进行到"+gameday+"天");
		System.out.println("菜单：");
		System.out.println("========================================");
		System.out.println("1、皇帝下旨选妃\t\t（增加）");
		System.out.println("2、翻牌宠幸\t\t（修改状态）");
		System.out.println("3、打入冷宫\t\t（删除）");
		System.out.println("4、朕的爱妃呢\t\t（查找）");
		System.out.println("========================================");
		System.out.print("陛下请选择：");
	}

}
