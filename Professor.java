package Aula04;

public class Professor extends Funcionario {
	
	//Argumento
	private String titulo;
	
	//Construtor:
	public Professor(String nome, String email, Integer idade, float salario, String titulo) {
		super(nome, email, idade, salario);
		this.titulo = titulo;
	}
	
	//Métodos
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Professor: \n"
			  +"Nome    = " + super.getNome()    + "\n"
			  +"Email   = " + super.getEmail()   + "\n"
			  +"Idade   = " + super.getIdade()   + "\n"
			  +"Salario = " + super.getSalario() + "\n"
			  +"Titulo  = " + titulo;
	}
	
	
	
}
