package classesMetodos;

//Explicar a partir do programa DesafioData como utilizar o This e This().
public class ThisMain {
	public static void main(String[] args) {

		This data1 = new This(19, 11, 2000);
		This data2 = new This();
		
		System.out.println("Meu aniversario: " + data1.dataFormatada());
		System.out.println("Importante: " + data2.dataFormatada());
	}
}
