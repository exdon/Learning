
//abstract para que não possa instanciar essa classe diretamente(new Funcionario), pois ela é apenas para referenciar um funcionário especifico. ex gerente, Programador etc
// a ideia é que nunca vai existir um funcionario por si só, vai existir um gerente que é um funcionário, mas funcionário por ser funcionário não, ele precisa de um papel, como ex gerente.
public abstract class Funcionario {
	private String name;
	private String cpf;
	//protected double salario; //publico apenas para meus filhos
	private double salario;
	
	//método sem corpo, não há implementação.. quem implementa são os filhos.
	public abstract double getBonificacao();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
