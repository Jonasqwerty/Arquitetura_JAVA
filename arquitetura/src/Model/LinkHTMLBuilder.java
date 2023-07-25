package Model;

public class LinkHTMLBuilder {
	private String urlAlvo;
	private String texto;
	private String ondeAbrir;
	
	public LinkHTMLBuilder setUrlAlvo(String urlAlvo) {
		this.urlAlvo = urlAlvo;
		return this;
	}
	
	public LinkHTMLBuilder setTexto(String texto) {
		this.texto = texto;
		return this;
	}
	
	public LinkHTMLBuilder setOndeAbrir(String ondeAbrir) {
		this.ondeAbrir = ondeAbrir;
		return this;
	}
	
	public LinkHTML build() {
		return new LinkHTML(urlAlvo, texto, ondeAbrir);
	}

}
