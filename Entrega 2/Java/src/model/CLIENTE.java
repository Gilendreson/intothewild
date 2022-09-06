package model;

public class CLIENTE
{
	private Integer id_Cliente;	
	private String Nome;	
	private String Sexo;
	private String DN;
	private String Email;
	private Integer Telefone_res;
	private Integer Telefone_cel;
	private Integer Telefone_ener;
	private String Senha;
	private Integer Numero;
	private String Cidade;
	private Integer CEP;
	private String Rua;
	private String Bairro;
	private Integer CPF;
	
	public CLIENTE(){
	
	}
	

	public CLIENTE(Integer id_Cliente, String nome, String sexo, String dN, String email, Integer telefone_res,
			Integer telefone_cel, Integer telefone_ener, String senha, Integer numero, String cidade, Integer cEP,
			String rua, String bairro, Integer cPF) {
		super();
		this.id_Cliente = id_Cliente;
		Nome = nome;
		Sexo = sexo;
		DN = dN;
		Email = email;
		Telefone_res = telefone_res;
		Telefone_cel = telefone_cel;
		Telefone_ener = telefone_ener;
		Senha = senha;
		Numero = numero;
		Cidade = cidade;
		CEP = cEP;
		Rua = rua;
		Bairro = bairro;
		CPF = cPF;
	}


	public Integer getId_Cliente() {
		return id_Cliente;
	}


	public void setId_Cliente(Integer id_Cliente) {
		this.id_Cliente = id_Cliente;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getSexo() {
		return Sexo;
	}


	public void setSexo(String sexo) {
		Sexo = sexo;
	}


	public String getDN() {
		return DN;
	}


	public void setDN(String dN) {
		DN = dN;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public Integer getTelefone_res() {
		return Telefone_res;
	}


	public void setTelefone_res(Integer telefone_res) {
		Telefone_res = telefone_res;
	}


	public Integer getTelefone_cel() {
		return Telefone_cel;
	}


	public void setTelefone_cel(Integer telefone_cel) {
		Telefone_cel = telefone_cel;
	}


	public Integer getTelefone_ener() {
		return Telefone_ener;
	}


	public void setTelefone_ener(Integer telefone_ener) {
		Telefone_ener = telefone_ener;
	}


	public String getSenha() {
		return Senha;
	}


	public void setSenha(String senha) {
		Senha = senha;
	}


	public Integer getNumero() {
		return Numero;
	}


	public void setNumero(Integer numero) {
		Numero = numero;
	}


	public String getCidade() {
		return Cidade;
	}


	public void setCidade(String cidade) {
		Cidade = cidade;
	}


	public Integer getCEP() {
		return CEP;
	}


	public void setCEP(Integer cEP) {
		CEP = cEP;
	}


	public String getRua() {
		return Rua;
	}


	public void setRua(String rua) {
		Rua = rua;
	}


	public String getBairro() {
		return Bairro;
	}


	public void setBairro(String bairro) {
		Bairro = bairro;
	}


	public Integer getCPF() {
		return CPF;
	}


	public void setCPF(Integer cPF) {
		CPF = cPF;
	}
	
	
	
	
	
}
