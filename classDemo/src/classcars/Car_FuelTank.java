package classcars;

public class Car_FuelTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuelTank ft=new FuelTank(100);
		System.out.println("当前邮箱油量为："+ft.gas);
		Car car=new Car();
		car.run(ft);
		System.out.println("汽车启动！");
		System.out.println("当前汽车油箱油量："+ft.gas);

	}

}
