package com.spring.danilo.web.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.spring.danilo.web.teste.models.Cliente;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TesteApplicationTests {

	@Test
	void instanciaClienteDanilo() {
		Cliente cliente = new Cliente();
		cliente.setNome("Danilo");
		assertEquals(cliente.getNome(), "Danilo");
	}


	@Test
	void instanciaClienteJoao() {
		Cliente cliente = new Cliente();
		cliente.setNome("Joao");
		assertEquals(cliente.getNome(), "Joao");
	}
}
