package it.betacom.service;

import java.io.IOException;

public class Main {

	final static String fileCSV = ".\\documenti\\PetShop_dati.csv";

	public static void main(String[] args) throws IOException {

		Metodi metodo = new Metodi();
		metodo.inizializza();

		// metodo.inserisci();
		metodo.importaCSV(fileCSV);
		metodo.generaReport1();
		metodo.generaReport2();

		metodo.chiusura();

	}

}