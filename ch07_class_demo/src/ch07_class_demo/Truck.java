package ch07_class_demo;

public class Truck {
	private int id;

	public int getId() {
		return id;
	}

	
	
	public Truck(int id) {
		super();
		this.id = id;
	}



	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Truck [id=" + id + "]";
	}



	public Truck() {
		super();
	}
	
	

}
