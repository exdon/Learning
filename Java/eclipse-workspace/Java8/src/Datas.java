import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(olimpiadasRio, hoje);
		System.out.println(periodo.getYears());
		
		
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = proximasOlimpiadas.format(formatador);
		System.out.println(valorFormatado);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatador));
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		System.out.println(agora.format(formatadorComHoras));
		
		YearMonth mes = YearMonth.now();
		System.out.println(mes);
		

	}

}
