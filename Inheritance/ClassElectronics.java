package com.oops.Inheritance;

public class ClassElectronics {

private int id;
	
	private String semiConductorType;
	
	private String dateOfManifacturing;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSemiConductorType() {
		return semiConductorType;
	}

	public void setSemiConductorType(String semiConductorType) {
		this.semiConductorType = semiConductorType;
	}

	public String getDateOfManifacturing() {
		return dateOfManifacturing;
	}

	public void setDateOfManifacturing(String dateOfManifacturing) {
		this.dateOfManifacturing = dateOfManifacturing;
	}

	@Override
	public String toString() {
		return "Electronics [id=" + id + ", semiConductorType=" + semiConductorType + ", dateOfManifacturing="
				+ dateOfManifacturing + "]";
	}

	public ClassElectronics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassElectronics(int id, String semiConductorType, String dateOfManifacturing) {
		super();
		this.id = id;
		this.semiConductorType = semiConductorType;
		this.dateOfManifacturing = dateOfManifacturing;
	}
}


