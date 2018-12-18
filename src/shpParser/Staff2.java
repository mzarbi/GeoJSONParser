package shpParser;

public class Staff2 {
	private String name ;
	private String last ;
	private StaffAtt att ;
	
	

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public StaffAtt getAtt() {
		return att;
	}

	public void setAtt(StaffAtt att) {
		this.att = att;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", last=" + last + "]";
	}
	
	public class StaffAtt{
		private String name ;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "StaffAtt [name=" + name + "]";
		}
		
		
	}
}
