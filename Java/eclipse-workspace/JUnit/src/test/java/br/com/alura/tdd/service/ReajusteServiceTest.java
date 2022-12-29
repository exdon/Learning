package test.java.br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.br.com.alura.tdd.modelo.Desempenho;
import main.java.br.com.alura.tdd.modelo.Funcionario;
import main.java.br.com.alura.tdd.service.ReajusteService;

public class ReajusteServiceTest {

	private ReajusteService service;
	private Funcionario funcionario;
	
	// Irá rodar antes de cada teste para inicializar as classes ReajusteService e Funcionario
	@BeforeEach
	public void inicializar() {
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));
	}
	
	// Irá rodar após cada teste
	// util para quando precisa de algo após finalizar o teste
	@AfterEach
	public void finalizar() {
		System.out.println("fim");
	}
	
	// ira rodar antes de todos os testes
	// ele precisa ser static
	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("antes de todos");
	}
	
	// ira rodar depois de todos os testes
	// ele precisa ser static
	@AfterAll
	public static void depoisDeTodos() {
		System.out.println("depois de todos");
	}

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
		
	}
	
	@Test
	public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
		
	}
	
	@Test
	public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
		
	}
	
}
