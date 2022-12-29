package test.java.br.com.alura.tdd.service;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import main.java.br.com.alura.tdd.modelo.Funcionario;
import main.java.br.com.alura.tdd.service.BonusService;


class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		
		assertThrows(
				IllegalArgumentException.class, 
				() -> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")))
				);
		//assertThrows verifica se uma exception aconteceu
		// primeiro parametro é a exception que quero verificar
		// segundo é o método que retorna essa exception, junto a uma função lambda( () -> )
		
		
		// ---- OUTRA MANEIRA DE FAZER O ASSERTTHROWS COM TRY CATCH
		try {
			service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
			fail("Não deu a exception! Teste falhou");
		} catch (Exception e) {
			assertEquals("Funcionário com salario maior do que R$ 10.000 não pode receber bonus!", e);
		}
		
		// o try tenta fazer o método e se não der a exception o método do JUnit fail()
		// é chamado, informando que o teste falhou
		// caso dê a exception, ele entrará no catch que captura essa exception
		// e verifica se a mensagem passada na exception é igual a que retornou
		
		// ----- OUTRA FORMA DE VALIDAR A MENSAGEM DO EXCEPTION USANDO ASSERTTHROWS 
		
		var e = assertThrows(
				IllegalArgumentException.class, 
				() -> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")))
				);
		assertEquals(e.getMessage(), "Funcionário com salario maior do que R$ 10.000 não pode receber bonus!");

	}
	
	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	void bonusDe1000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));
		
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
	

}
