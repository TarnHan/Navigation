package com.cbq.navigation;

public class matrix {
	public double[][] getmatrix(){
		double b=Double.MAX_VALUE;
		double num[][]={
				{b,1,b,1,b,b,b,1.5,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{1,b,1,b,b,b,b,1,b,b,b,1.5,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,1,b,b,b,b,b,1.5,b,b,b,1,b,b,b,b,b,1,b,1.8,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{1,b,b,b,1,b,b,1,1.5,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,1,b,1,b,b,1,1.5,1.8,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},				
				{b,b,b,b,1,b,1,b,b,1,1.5,b,b,b,1.8,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,1,b,b,b,1.5,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{1.5,1,1.5,1,b,b,b,b,1,b,b,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,1.5,1,b,b,1,b,1,b,b,1,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,1.5,1,1.5,b,1,b,1,b,1.5,1,1.5,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},				
				{b,b,b,b,1.8,1.5,1,b,b,1,b,b,b,1.5,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,1.5,1,b,b,b,b,1,b,b,b,b,1,b,b,b,b,b,b,1.5,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,1,1.5,b,1,b,1,b,b,b,b,b,b,1,1.5,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,1,1,1.5,b,1,b,1,b,b,b,b,b,1.5,1,1.5,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,1.8,b,b,b,1.5,1,b,b,1,b,1,b,b,b,b,b,1.5,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},				
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,b,b,b,b,b,1,b,b,b,b,b,b,b,1,b,b,b,1,b,1,1,b,b,b,b},
				{b,b,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,b,b,b,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,1,b,b,b,b,b,b,b,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,1.8,b,b,b,b,b,b,b,b,1.5,b,b,b,b,b,b,1,b,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},				
				{b,b,b,b,b,b,b,b,b,b,b,b,1,1.5,b,b,b,b,b,1,b,1,b,b,b,b,b,b,b,b,b,b,1.5,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,1.5,1,1.5,b,b,b,b,b,1,b,1,b,b,b,b,b,b,b,b,b,1.5,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,1.5,1,b,1,b,b,b,b,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,b,b,b,b,b,b,b,b,b,b,1,b,b,1.5,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,b,1,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,b,b,b,1.5,b,b,b,b,b,b,b,b,1,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,b,0.5,b,b,1,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,0.5,b,0.5,0.5,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,b,b,b,b,b,b,b,b,b,b,b,0.5,b,b,b,1,1,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,0.5,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1.5,1.5,b,b,b,b,b,1,1,b,b,b,b,b,b,b,b,b,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,b,b,1,1,b,b,b,b,1.5,1},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,b,1,b,1,1,b,b,b,b,b},				
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,1,b,1,1,b,1,0.8,1},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,1,b,1,b,b,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,1,b,1,1,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,1,b,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,1,1,b,1,b},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1.5,b,0.8,b,b,b,1,b,1},
				{b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,1,b,1,b,b,b,b,1,b},
		};
		return num;
	}
	public void print(){
		double num[][]=getmatrix();
			for(int i=0;i<num.length;i++)
				for(int j=0;j<num[i].length;j++){
					if(num[i][j]==Double.MAX_VALUE){
						if(j==num[i].length-1)
							System.out.println("x");
							else System.out.print("x ");
					}					
					else if(j==num[i].length-1)
						//System.out.println(num[i][j]);
						System.out.println("o");
					//else System.out.print(num[i][j]+"  ");
					else System.out.print("o"+" ");
				}
	}
	public static void main(String[] args){
		matrix m=new matrix();
		m.print();
	}
}
