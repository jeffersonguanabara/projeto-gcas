package br.unipe.posgraducao.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import br.unipe.posgraducao.core.Valores;
import junit.framework.TestCase;

public class TestValores extends TestCase {
	
	Valores valores = new Valores();

	public void testInserir() {
		assertTrue(valores.ins(2));
	}
	
	public void testInserirArrayCheio() {
		for (int i = 0; i < 10; i++) {
			valores.ins(i+1);
		}
		
		assertFalse(valores.ins(3));
	}
	
	public void testInserirValorNegativo() {
		assertFalse(valores.ins(-15));
	}
	
	public void testInserirValorZero() {
		assertFalse(valores.ins(0));
	}
	
	public void testDeletar() {
		valores.ins(5);
		
		assertEquals(5, valores.del(0));
	}
	
	public void testDeletarVazio() {
		assertEquals(-1, valores.del(2));
	}
	
	public void testDeletarIndiceMenorQueZero() { 
		assertEquals(-1, valores.del(-2));
	}
	
	public void testDeletarIndiceMaiorQueNove() { 
		assertEquals(-1, valores.del(10));
	}
	
	public void testTamanhoVazio() {
		assertEquals(0, valores.size());
	}
	
	public void testTamanhoUm() {
		valores.ins(2);
				
		assertEquals(1, valores.size());
	}
	
	public void testTamanhoCheio() {
		for (int i = 0; i < 10; i++) {
			valores.ins(i+1);
		}
		
		assertEquals(10, valores.size());
	}
}
