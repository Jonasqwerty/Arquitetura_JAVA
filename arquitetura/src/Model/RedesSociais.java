package Model;

public class RedesSociais {
	private String urlFacebook;
	private String urlInstagram;
	private String urlYoutube;
	private String urlLickedin;
	private String urlTikTok;
	
	public RedesSociais() {
		
	}
	
	public RedesSociais(String urlFacebook, String urlInstagram, String urlYoutube, String urlLickedin,
			String urlTikTok) {
		super();
		this.urlFacebook = urlFacebook;
		this.urlInstagram = urlInstagram;
		this.urlYoutube = urlYoutube;
		this.urlLickedin = urlLickedin;
		this.urlTikTok = urlTikTok;
	}

	public String getUrlFacebook() {
		return urlFacebook;
	}

	public void setUrlFacebook(String urlFacebook) {
		this.urlFacebook = urlFacebook;
	}

	public String getUrlInstagram() {
		return urlInstagram;
	}

	public void setUrlInstagram(String urlInstagram) {
		this.urlInstagram = urlInstagram;
	}

	public String getUrlYoutube() {
		return urlYoutube;
	}

	public void setUrlYoutube(String urlYoutube) {
		this.urlYoutube = urlYoutube;
	}

	public String getUrlLickedin() {
		return urlLickedin;
	}

	public void setUrlLickedin(String urlLickedin) {
		this.urlLickedin = urlLickedin;
	}

	public String getUrlTikTok() {
		return urlTikTok;
	}

	public void setUrlTikTok(String urlTikTok) {
		this.urlTikTok = urlTikTok;
	}
	
	
	
	

}
