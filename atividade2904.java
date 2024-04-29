package condicional;

public class atividade2904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int total_de_idades = 0;
        int numero_de_idades = 0;
        int idade;

        System.out.println("Enter ages (enter 0 to quit):");
        idade = scanner.nextInt();
        while (idade != 0) {
        	total_de_idades += idade;
        	numero_de_idades++;
        	idade = scanner.nextInt();

        }



        if ( numero_de_idades > 0) {
        	double averageAge = (double) total_de_idades /  numero_de_idades;
            System.out.printf("\n"
            		+ "A idade média é %.2f%n", averageAge);

        } else {
        	System.out.println("Nenhuma idade foi inserida.");

        }

        scanner.close();

    }


}

