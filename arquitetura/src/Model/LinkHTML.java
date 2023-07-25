package Model;

public class LinkHTML {
	private String urlAlvo;
	private String texto;
	private String ondeAbrir;
	
	public LinkHTML(String urlAlvo, String texto, String ondeAbrir) {
		this.urlAlvo = urlAlvo;
		this.texto = texto;
		this.ondeAbrir = ondeAbrir;
	}

	public String getUrlAlvo() {
		return urlAlvo;
	}

	public void setUrlAlvo(String urlAlvo) {
		this.urlAlvo = urlAlvo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getOndeAbrir() {
		return ondeAbrir;
	}

	public void setOndeAbrir(String ondeAbrir) {
		this.ondeAbrir = ondeAbrir;
	}
	
	public String gerarHTML() {
		if (this.ondeAbrir == null) {
			return ("<a href='"+urlAlvo+"'>"+texto+"</a>");
		}
		else {
			return ("<a target='_blank' href='"+urlAlvo+"'>"+texto+"</a>"); 
		}
	}
	
	

}
