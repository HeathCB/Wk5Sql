package Entity;

public class Cars {

	private int id;
	private String make;
	private String model;
	private int modelYear;
	
	public Cars ( int id, String make, String model, int modelYear) {
		this.setId(id);
		this.setMake(make);
		this.setModel(model);
		this.setModelYear(modelYear);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

}
