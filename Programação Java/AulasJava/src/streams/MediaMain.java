package streams;

//Usa classe Media.
public class MediaMain {

	public static void main(String[] args) {
		
		//Retornando Media posso encadear tudo.  
		Media m1 = new Media()
			.adicionar(8.3).adicionar(6.7);
		System.out.println("Media 1: " + m1.getValor());
		
		Media m2 = new Media()
				.adicionar(7.9).adicionar(6.6);
		System.out.println("Media 2: " + m2.getValor());
		System.out.println("Duas Medias: " + Media.combinar(m1, m2).getValor());
			
	}

}
