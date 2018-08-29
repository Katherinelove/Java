package Gailen;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class GailenDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("life value：■■■■□□□");
		System.out.println("physical attack：■■■■■□□");
		System.out.println("skill damge：■■□□□□□");
		System.out.print("请输入攻击力：");
		double attack=input.nextFloat();
		System.out.print("请输入成长攻击力：");
		double attackGrowth=input.nextFloat();
		System.out.printf("伤害：%.2f(+%.2f)",attack,attackGrowth);
	}

}
