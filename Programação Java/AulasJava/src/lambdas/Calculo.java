package lambdas;

//Pode ter apenas um metodo abstrato.
@FunctionalInterface 
public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
}
