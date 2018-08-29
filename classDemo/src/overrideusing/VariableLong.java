package overrideusing;

import static java.lang.System.out;

public class VariableLong {
	public static int sum(int...args){
		int sum=0;
		for(int arg:args) {
			sum+=arg;
		}
		return sum;  
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableLong vl=new VariableLong();
		int sum=vl.sum(1,2,3,4);
		out.println(sum);
	}

}
