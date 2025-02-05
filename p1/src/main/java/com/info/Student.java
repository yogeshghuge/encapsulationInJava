package com.info;

public class Student {
	
		private int sid;
		private String sname;
		private String scity;
		private double spercetnage;
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public Student(int sid, String sname, String scity, double spercetnage) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.scity = scity;
			this.spercetnage = spercetnage;
		}
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercetnage=" + spercetnage
					+ "]";
		}
		public String getScity() {
			return scity;
		}
		public void setScity(String scity) {
			this.scity = scity;
		}
		public double getSpercetnage() {
			return spercetnage;
		}
		public void setSpercetnage(double spercetnage) {
			this.spercetnage = spercetnage;
		}

}
