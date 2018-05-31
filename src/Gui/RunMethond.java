package Gui;

import java.text.DecimalFormat;

public class RunMethond {
		public int Vx;
		public int Vy;
	public Coordinate running(Coordinate from , Coordinate target){
		DecimalFormat  df = new DecimalFormat("######0.0");   
		int Disx = target.x - from.x;
		int Disy = target.y - from.y;
		System.out.println(Disx+"::"+Math.abs(Disx));
		if(Disx == 0){
			Vy = 1;
			Vx = 0;
			return new Coordinate(Vx, Vy);
		}
		if(Disy == 0){
			Vx = 1;
			Vy = 0;
			return new Coordinate(Vx, Vy);
		}
		if(Math.abs(Disy)>Math.abs(Disx)){
			Vx = Disx/(Math.abs(Disx));
			Vy = Disy/Math.abs(Disx);
			if(Vy>1){
				Vy = 1;
			}
			else if(Vy<-1){
				Vy = -1;
			}
			System.out.println(Vx+" "+Vy);
			return new Coordinate(Vx, Vy);
		}
		else{
			Vx = Disx/Math.abs(Disy);
			Vy = Disy/Math.abs(Disy);
			if(Vx>1){
				Vx = 1;
			}
			else if(Vx<-1){
				Vx = -1;
			}
			System.out.println(Vx+" "+Vy);
			return new Coordinate(Vx, Vy);
			
		}
	}
}
