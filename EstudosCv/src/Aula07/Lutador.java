package Aula07;

public class Lutador {
	// Atributos 
	private String nome;
	private String nascionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;


	
	// Métodos
	public void apresentador() {
		System.out.println("----------------------------------------------------");
		System.err.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome() );
		System.out.println("Diretamente de :  " + this.getNascionalidade());
		System.out.println("Com " + this.getIdade() + " anos e " +  this.getAltura() + "m");
		System.out.println("Pesando: " + this.getPeso() + "kg");
		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("Empates: " + this.getEmpates());
		System.out.println("Derrotas: " + this.getDerrotas());
		
	}
	
	public void status() {
		System.out.println("");
		System.out.println("---------Status---------");
		System.out.println(this.getNome() + " é um peso de " + this.categoria);
		System.out.println("Ganhou "  + this.getVitorias()  + " vezes. ");
		System.out.println("Empates "  + this.getEmpates()  + " vezes. ");
		System.out.println("Derrotas "  + this.getDerrotas()  + " vezes. ");
	}
	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1);
	}
	
	
	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}
	
	public void empatarLutas() {
		this.setIdade(getEmpates() + 1);
		
	}
	
	Lutador(String nome, String nascionalidade, int idade, double altura, double peso, int vitorias,
			int derrotas, int empates) {
		this.nome = nome;
		this.nascionalidade = nascionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNascionalidade() {
		return nascionalidade;
	}
	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria(categoria);
		
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		if(this.peso < 52.2) {
			this.categoria = "Inválido";
		
		}else if (this.peso <= 70.3) {
			this.categoria = "Leve";
			
		}else if(this.peso <= 83.9) {
			this.categoria = "Médio";
			
		}else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		
		}else {
			this.categoria = "Inválida";
		}
		
	
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	// Métodos Especiais
	
}
