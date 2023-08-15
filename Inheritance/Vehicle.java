package Inheritance;

public class Vehicle{
	protected String modelName;
	
	public Vehicle(String modelName)
	{
		this.modelName = modelName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void honk()
	{
		System.out.println("Tuut, tuut!");
	}
}
