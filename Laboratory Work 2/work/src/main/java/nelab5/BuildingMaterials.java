package nelab5;

public class BuildingMaterials extends Hypermarket {
	private String material;

	public BuildingMaterials() {
		setType("BuildingMaterials");
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(final String material) {
		this.material = material;
	}
}
