package com.mycompany.myapp.bean;

public class Car {
	private Integer step;
	private String vin;
	private String table;

	public Car() {
	}

	public Car(int step, String vin, String table) {
		this.step = step;
		this.vin = vin;
		this.table = table;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	@Override
	public String toString() {
		return "Car{" +
				"step=" + step +
				", vin='" + vin + '\'' +
				", table='" + table + '\'' +
				'}';
	}
}
