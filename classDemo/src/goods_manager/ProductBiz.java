package goods_manager;

import javax.swing.JOptionPane;

/**
 * ��Ʒ������  ��ʱ����������ڶ��ڴ�����
 * Ŀ��������ɹ�n����Ʒ����ӡ�����������Ʒ�ܼ۸�
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��17�� ����9:14:10
 */
public class ProductBiz {

	public static void main(String[] args) {
		String countOfBooks=JOptionPane.showInputDialog(
				"�����빺���������������");
		int countBooks=Integer.parseInt(countOfBooks);
		//�洢ÿһ����Ʒ������
		int[] count=new int[countBooks];
		double totalprice=0;
		//�����Ա�������ռ���Ʒ��Ϣ
		Product[] products=new Product[countBooks];
		//�������飬û�з���ռ䣬ֻ��һ����ַ��ʹ��ʱ�������ռ�-ʵ����
		for (int i = 0; i < products.length; i++) {
			if(products[i].equals(null)) {
				products[i]=new Product();  //ʵ����
			}
			String goodsName=JOptionPane.showInputDialog(
					"��������Ʒ���ƣ�");
			products[i].setGoodsName(goodsName);
			String strprice=JOptionPane.showInputDialog(
					"��������Ʒ�۸�");
			products[i].setPrice(Double.parseDouble(strprice));
					
			String strcount=JOptionPane.showInputDialog(
					"�����빺��������");
			count[i]=Integer.parseInt(strcount);
			
			totalprice+=products[i].getPrice()*count[i];
		}
		
		//��ӡ
		System.out.println("�������㣺");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getGoodsName()+"-"+
					products[i].getPrice());
		}
		System.out.println("��Ʒ�ܼ۸�"+totalprice);
	}

}
