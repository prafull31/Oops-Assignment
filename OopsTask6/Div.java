package com.yash.OopsTask6;

public class Div extends Mul{

	@Override
	void div(int a, int b) {
		int c=a/b;
		System.out.println("div: "+c);
		
	}
	public static void main(String[] args) {
		CalcAbs c = new Div();
		c.sum(2, 3);
		c.sub(30, 20);
		c.mul(20, 30);
		c.div(40, 5);
	}

}
