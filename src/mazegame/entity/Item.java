package mazegame.entity;

public abstract class Item {
	
	private String label;
	private int value;
	private double weight;
	private String description;

	public Item (String label, int value, double weight, String description)
	{
		this.label = label;
		this.value = (int) weight*100;
		this.weight = weight;
		this.description = description;
	}

	public String getLabel() {

		return label;
	}
	
	public int getValue() 
	{
		return value;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public String getDescription()
	{
		return description;
	}

	@Override
	public String toString() {
		return "Item\n**************************************************************************\n" +
				"Item Name ::" + label + "\n**************************************************************************\n"
				+ "\nValue :: £" + value + "\n**************************************************************************\n"+
				"Weight :: " + weight +" lb \n**************************************************************************\n"+
				"Description :: " + description + "\n**************************************************************************\n"
				;
	}

}
