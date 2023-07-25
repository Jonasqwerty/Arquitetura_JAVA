package teste;

import Model.LinkHTML;
import Model.LinkHTMLBuilder;
import Model.Pessoa;
import Model.PessoaBuilder;
import Model.RedesSociais;

public class classeExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa1 = new PessoaBuilder().setPrimeiroNome("Alex").setUltimoNome("Castro").setIdade(28).build();
		System.out.println(pessoa1.getPrimeiroNome()+" / "+pessoa1.getEmail());
		
		Pessoa pessoa2 = new PessoaBuilder().setPrimeiroNome("Joice").setUltimoNome("Rodrigues").setIdade(25).setEmail("joice@gmail.com").setEndereco("Rua Getúlio Vargas 123").build();
		System.out.println(pessoa2.getPrimeiroNome()+" / "+pessoa2.getEmail());
		
		RedesSociais rede1 = new RedesSociais();
		rede1.setUrlInstagram("jo_goncalveslima");
		rede1.setUrlFacebook("Jonas Gonçalves Lima");
		
		
		Pessoa pessoa3 = new PessoaBuilder().setNaturalidade("Bagé").setRede(rede1).build();
		System.out.println(pessoa3.getNaturalidade());
		System.out.println(pessoa3.getRede().getUrlFacebook());
		
		LinkHTML umLinkExemplo = new LinkHTMLBuilder().setUrlAlvo("www.gmail.com")
				.setTexto("Gmail").build();
				System.out.println(umLinkExemplo.gerarHTML() );
				
		LinkHTML umLinkExemplo2 = new LinkHTMLBuilder().setUrlAlvo("www.hotmail.com")
						.setTexto("Hotmail").setOndeAbrir("Nova Aba").build();
						System.out.println(umLinkExemplo2.gerarHTML() );

	}

}
