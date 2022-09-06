package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PACOTE extends PEDIDO
{
		
	private String id_pacote;	
	private double Preço;	
	private int Quantidade;		
	private String Destino;		
	private String Origem;
	private LocalDate Data_viagem;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("dd/mm/yyyy");
	
	public PACOTE(){
		
	}

	public PACOTE(String id_pacote, double preço, int quantidade, String destino, String origem, LocalDate data_viagem,
			DateTimeFormatter formatter) {
		super();
		this.id_pacote = id_pacote;
		Preço = preço;
		Quantidade = quantidade;
		Destino = destino;
		Origem = origem;
		Data_viagem = data_viagem;
		this.formatter = formatter;
	}

	public String getId_pacote() {
		return id_pacote;
	}

	public void setId_pacote(String id_pacote) {
		this.id_pacote = id_pacote;
	}

	public double getPreço() {
		return Preço;
	}

	public void setPreço(double preço) {
		Preço = preço;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}

	public String getOrigem() {
		return Origem;
	}

	public void setOrigem(String origem) {
		Origem = origem;
	}

	public String getData_viagem() {
		return Formatter.format(Data_viagem);
	}

	public void setData_viagem(String data_viagem) {
		Data_viagem = LocalDate.parse(data_viagem, formatter);
		
	}


	}

	
	
	

}
