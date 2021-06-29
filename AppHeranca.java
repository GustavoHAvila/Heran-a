package Aula04;

public class AppHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Pessoa p = new Pessoa("Nome1", "emai1l@email.com");
		
		System.out.println(p.toString());
		
		Funcionario f = new Funcionario("Nome2","email2@email.com", 7000);
		System.out.println(f.toString());
		f.setNome("Nome do Funcionario");
		System.out.println(f.toString());
		
		Funcionario f2 = new Funcionario("Nome3", "email3@email.com", 20, 6500);
		System.out.println(f2.toString());
		*/
		
		//ATIVIDADE 05 - HERANÇA
		Aluno a = new Aluno("Gustavo", "emai1l@email.com", "Matricula01", 21, "28/06/2021", "SI");
		System.out.println(a.toString());
		
		Professor p = new Professor("Eduardo", "email2@email.com", 30, 10000, "Doutor");
		System.out.println(p.toString());
	}

}
