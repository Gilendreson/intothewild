package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PEDIDO {
	private int id_Pedido;
	private LocalDate Data_criação;
	private String id_Cliente;
	private String id_Pacote;
	private int Quantidade;
	private double Preço;

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");

	public PEDIDO() {

	}

	public PEDIDO(int id_Pedido, LocalDate data_criação, String id_Cliente, String id_Pacote, int quantidade,
			double preço, DateTimeFormatter formatter) {
		super();
		this.id_Pedido = id_Pedido;
		Data_criação = data_criação;
		this.id_Cliente = id_Cliente;
		this.id_Pacote = id_Pacote;
		Quantidade = quantidade;
		Preço = preço;
		this.formatter = formatter;
	}

	public int getId_Pedido() {
		return id_Pedido;
	}

	public void setId_Pedido(int id_Pedido) {
		this.id_Pedido = id_Pedido;
	}

	public String getData_criação() {
		return Formatter.format(Data_criação);
	}

	public void setData_criação(String data_criação) {
		Data_criação = LocalDate.parse(data_criação, formatter);
	}

	public String getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(String id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getId_Pacote() {
		return id_Pacote;
	}

	public void setId_Pacote(String id_Pacote) {
		this.id_Pacote = id_Pacote;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public double getPreço() {
		return Preço;
	}

	public void setPreço(double preço) {
		Preço = preço;
	}

}
