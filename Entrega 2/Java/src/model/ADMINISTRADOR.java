package model;

public class ADMINISTRADOR extends PACOTE {

	private String id_adminitrador;
	private String NomeADM;
	private String EmailADM;
	private String SenhaADM;

	public ADMINISTRADOR() {

	}

	public ADMINISTRADOR(String id_adminitrador, String nomeADM, String emailADM, String senhaADM) {
		super();
		this.id_adminitrador = id_adminitrador;
		NomeADM = nomeADM;
		EmailADM = emailADM;
		SenhaADM = senhaADM;
	}

	public String getId_adminitrador() {
		return id_adminitrador;
	}

	public void setId_adminitrador(String id_adminitrador) {
		this.id_adminitrador = id_adminitrador;
	}

	public String getNomeADM() {
		return NomeADM;
	}

	public void setNomeADM(String nomeADM) {
		NomeADM = nomeADM;
	}

	public String getEmailADM() {
		return EmailADM;
	}

	public void setEmailADM(String emailADM) {
		EmailADM = emailADM;
	}

	public String getSenhaADM() {
		return SenhaADM;
	}

	public void setSenhaADM(String senhaADM) {
		SenhaADM = senhaADM;
	}

}
