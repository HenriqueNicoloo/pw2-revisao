
public class ExercicioSete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Precisamos de ajuda para escrever um código que de acordo com a quantidade de lados iguais de um 
		triângulo, exiba com console.log se
		ele é Equilátero, Isósceles ou Escaleno, sem a necessidade de repetir no código a palavra “triângulo”.
		Triângulo Equilátero: possui os 3 lados iguais.
		Triângulo Isósceles: possui 2 lados iguais.
		Triângulo Escaleno: possui 3 lados diferentes*/
		
		double ladoA = 3;
		double ladoB = 5;
		double ladoC = 5;
		
		if (ladoA == ladoB && ladoA == ladoC)
			System.out.println("Equilátero");
		else if (ladoA == ladoB && ladoA != ladoC || ladoA != ladoB && ladoA == ladoC || ladoA != ladoB && ladoA != ladoC)
			System.out.println("Isósceles");
		else
			System.out.println("Escaleno");
			
			
	}

}
