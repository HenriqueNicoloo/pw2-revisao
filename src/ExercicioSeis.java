
public class ExercicioSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Abaixo de 4kg = Abaixo do Peso
 			Maior que 10kg = Acima do Peso
 			Se tiver entre esses dois valores = Peso normal.*/
		
		double pesoPet = 5;
		
		if(pesoPet < 4)
			System.out.println("Abaixo do peso");
		else if(pesoPet > 10)
			System.out.println("Acima do peso");
		else
			System.out.println("Peso normal");
		
	}

}
