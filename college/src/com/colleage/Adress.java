package com.colleage;

public class Adress {
	
		private String dis;
		private String pin;
		private String block;
		
		public void setDis(String dis) {
			this.dis = dis;
		}
		public void setPin(String pin) {
			this.pin = pin;
		}
		public void setBlock(String block) {
			this.block = block;
		}
		
		@Override
		public String toString()
  	{
			
			return dis +" ," + pin +" "+block ;
		}
		
	}



