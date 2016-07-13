package teste.tecnico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = 0; 
		int xMax = 0; 
		int yMax = 0; 
		int y = 0;
		String pos = "";

		System.out.println("Insira o tamanho maximo para o plano. Ex.: 5 5");
		String maximos = scanner.nextLine(); 
		String[] tamanhos = maximos.split(" ");
		xMax = Integer.parseInt(tamanhos[0]);
		yMax = Integer.parseInt(tamanhos[1]);

		Integer i=0;
		List<Rover> rovers = new ArrayList<Rover>();
		do {
			i++;
			System.out.println("Definindo Rover "+i);
			System.out.println("Adicione a coordenada inicial e a posicao para onde o Rover está direcionado. Ex.: 1 2 N");
			String posicoes = scanner.nextLine();
			String[] posicao = posicoes.split(" ");
			Rover rov = new Rover(Integer.parseInt(posicao[0]), Integer.parseInt(posicao[1]), posicao[2],xMax,yMax);
			
			System.out.println("Adicione os comandos para a movimentacao do Rover. Ex.: LMLMLMLMM");
			rov.setComandos(scanner.nextLine());
			
			rovers.add(rov);
			
			System.out.println("Deseja adicionar outro Rover? y/n");
		}while (scanner.nextLine().equalsIgnoreCase("y"));
		System.out.println("Posicionamento final dos Rovers adicionados");
		i=0;
		for (Rover rover : rovers) {
			System.out.println("Rover "+(++i)+": "+rover.getPosicaoFinal());			
		}
		
	}

}
