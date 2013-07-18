package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import entidades.Pessoa;

public class TestePessoa {

	@Test
	public void criaPessoa() {
		Pessoa t = new Pessoa("Ahmed Angel",24);
		
		assertEquals("Ahmed Angel", t.getNome());
		assertEquals(24, t.getIdade());		
	}

}
