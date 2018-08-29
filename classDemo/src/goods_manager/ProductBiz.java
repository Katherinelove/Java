package goods_manager;

import javax.swing.JOptionPane;

/**
 * 商品服务类  暂时将主函数入口定于次类中
 * 目的是输入采购n种商品，打印购物清算和商品总价格
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月17日 上午9:14:10
 */
public class ProductBiz {

	public static void main(String[] args) {
		String countOfBooks=JOptionPane.showInputDialog(
				"请输入购买书的种类数量：");
		int countBooks=Integer.parseInt(countOfBooks);
		//存储每一种商品的数量
		int[] count=new int[countBooks];
		double totalprice=0;
		//定义成员变量，收集商品信息
		Product[] products=new Product[countBooks];
		//对象数组，没有分配空间，只是一个地址，使用时必须分配空间-实例化
		for (int i = 0; i < products.length; i++) {
			if(products[i].equals(null)) {
				products[i]=new Product();  //实例化
			}
			String goodsName=JOptionPane.showInputDialog(
					"请输入商品名称：");
			products[i].setGoodsName(goodsName);
			String strprice=JOptionPane.showInputDialog(
					"请输入商品价格：");
			products[i].setPrice(Double.parseDouble(strprice));
					
			String strcount=JOptionPane.showInputDialog(
					"请输入购买数量：");
			count[i]=Integer.parseInt(strcount);
			
			totalprice+=products[i].getPrice()*count[i];
		}
		
		//打印
		System.out.println("购物清算：");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getGoodsName()+"-"+
					products[i].getPrice());
		}
		System.out.println("商品总价格："+totalprice);
	}

}
