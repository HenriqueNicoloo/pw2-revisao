
public class ExercicioSete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Precisamos de ajuda para escrever um c�digo que de acordo com a quantidade de lados iguais de um 
		tri�ngulo, exiba com console.log se
		ele � Equil�tero, Is�sceles ou Escaleno, sem a necessidade de repetir no c�digo a palavra �tri�ngulo�.
		Tri�ngulo Equil�tero: possui os 3 lados iguais.
		Tri�ngulo Is�sceles: possui 2 lados iguais.
		Tri�ngulo Escaleno: possui 3 lados diferentes*/
		
		double ladoA = 3;
		double ladoB = 5;
		double ladoC = 5;
		
		if (ladoA == ladoB && ladoA == ladoC)
			System.out.println("Equil�tero");
		else if (ladoA == ladoB && ladoA != ladoC || ladoA != ladoB && ladoA == ladoC || ladoA != ladoB && ladoA != ladoC)
			System.out.println("Is�sceles");
		else
			System.out.println("Escaleno");
			
			
	}

}
