package Funcionario;

public class Funcio {
	int matricula;
	String nome;
	
	public Funcio(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
		matricula();
		status();
	}
	
	public void matricula() {
		if(this.matricula>=1) {
			this.matricula +=2;
		}
			
		}
		void status() {
			System.out.println("Nome : "+this.nome);
			System.out.println("Funcionario de matricula : " +this.matricula);
	}
}


