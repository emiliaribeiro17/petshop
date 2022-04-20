package petshop.model;

public class Veterinario {
	private int id;
	private String nome;
	private String crvm;
	private String especialidade;
	
	public Veterinario() {
		
	}
	
	public Veterinario(int id, String nome, String crvm, String especialidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.crvm = crvm;
		this.especialidade = especialidade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCrvm() {
		return crvm;
	}
	public void setCrvm(String crvm) {
		this.crvm = crvm;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	

}
