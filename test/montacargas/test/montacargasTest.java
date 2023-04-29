package montacargas.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import montacarga.dominio.Montacarga;

public class montacargasTest {

	@Test
	public void queSePuedaCrearUnMontacarga() {
		Montacarga montacarga = new Montacarga();
		assertNotNull(montacarga);
	}

	@Test
	public void queSePuedaCargarMontacarga() {
		Montacarga montacarga = new Montacarga("jose", 0);
		montacarga.setPeso(10);
		
		Integer valorEsperado = montacarga.getPeso();
		Integer valorObtenido = 10;
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queNoSePuedaCargarMasDelPesoMaximo() {
		Montacarga montacarga = new Montacarga("jose", 0);
		assertTrue(montacarga.queSePuedaCargar(499));
		assertFalse(montacarga.queSePuedaCargar(2));
	}
	
}
