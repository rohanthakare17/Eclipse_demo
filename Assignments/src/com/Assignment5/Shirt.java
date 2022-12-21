package com.Assignment5;
import java.util.Objects;
public class Shirt
{
	private String brandName;
	private String color;
	private String type;
	
	public Shirt() 
	{
		brandName = "NoBrand";
		color = "NoColor";
		type = "NoType";
	}

	public Shirt(String brandName, String color, String type) {
		super();
		this.brandName = brandName;
		this.color = color;
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brandName, color, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shirt other = (Shirt) obj;
		return Objects.equals(brandName, other.brandName) && Objects.equals(color, other.color)
				&& Objects.equals(type, other.type);
	}

	public String getBrandName() {
		return brandName;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}	
}