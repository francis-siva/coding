package com.codestudiocorp.coding;

public class Mobile implements FingerPrintReader, FacialRecognition {

	private String brand;
	private String modele;
	private double screenSize;
	
	public Mobile() {
	}

	public Mobile(String brand, String modele, double d) {
		this.brand = brand;
		this.modele = modele;
		this.screenSize = d;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	
	public void unlockScreen() {
		System.out.println("Basic mode unlock screen");
	}

	public int getFacialRecognition() {
		int min = 1, max = 10, nombreAleatoire;
		return nombreAleatoire = min + (int)(Math.random() * ((max - min) + 1));
	}

	public void unlockByFacialRecognition() {
		System.out.println("Screen unlocked with FacialRecognition 🙂");
	}

	public int readFingerPrint() {
		/*int min = 1, max = 10, nombreAleatoire;
		return nombreAleatoire = min + (int)(Math.random() * ((max - min) + 1));*/
		return 0;
	}

	public void unlockByFingerPrint() {
		System.out.println("Screen unlocked with FingerPrint");
		
	}
}
