package DominioMetodoVarargs;

public class Calculadora {

	//METODO - VARARGS
	
	public void somaArray(int[]numeros) {
		int soma = 0;
		for(int num: numeros) {
			soma += num;
		}
		System.out.println(soma);
	}
	
	public void somaVarargs(int... numeros) {
		int soma = 0;
		for(int num: numeros) {
			soma += num;
		}
		System.out.println(soma);
	}
}
