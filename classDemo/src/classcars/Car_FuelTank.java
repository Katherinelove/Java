package classcars;

public class Car_FuelTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuelTank ft=new FuelTank(100);
		System.out.println("��ǰ��������Ϊ��"+ft.gas);
		Car car=new Car();
		car.run(ft);
		System.out.println("����������");
		System.out.println("��ǰ��������������"+ft.gas);

	}

}
