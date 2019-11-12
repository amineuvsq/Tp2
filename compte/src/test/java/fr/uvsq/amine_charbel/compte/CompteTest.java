package fr.uvsq.amine_charbel.compte;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompteTest {

	@Test
	public void consulterTest() {
		int soldeTest = 12;
		Compte c1 = new Compte(soldeTest);
		int solde = c1.consulter();
		assertTrue(solde == soldeTest);
	}
	
	@Test
	public void creditTest() {
		Compte c1 = new Compte(50);
		int creditAjouter = 20;
		int resultatAttendu = c1.consulter() + creditAjouter;
		c1.credit(creditAjouter);
		int resultat = c1.consulter();
		assertEquals(resultat,resultatAttendu);
	}
}