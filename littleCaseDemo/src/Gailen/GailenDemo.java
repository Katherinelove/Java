package Gailen;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class GailenDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("life value����������������");
		System.out.println("physical attack����������������");
		System.out.println("skill damge����������������");
		System.out.print("�����빥������");
		double attack=input.nextFloat();
		System.out.print("������ɳ���������");
		double attackGrowth=input.nextFloat();
		System.out.printf("�˺���%.2f(+%.2f)",attack,attackGrowth);
	}

}
