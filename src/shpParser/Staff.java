package shpParser;

public class Staff {

	private String name ;
	private String last ;
	
	

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

	@Override
	public String toString() {
		return "Staff [name=" + name + ", last=" + last + "]";
	}

	
	
	
	
}
