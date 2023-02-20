package com.planotatico.digimon.digimon;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.planotatico.digimon.digimon.client.DigimonClient;
import com.planotatico.digimon.digimon.client.domain.Digimon;

@SpringBootApplication
public class DigimonApplication {
	
	public static void main(String[] args) throws ParseException {
		DigimonClient digimonClient = new DigimonClient();
		List<Digimon> listaDigimon = digimonClient.listar();

			/* Será listado a seguir todos os digimons */
			System.out.println("\n"+"|______________________LISTA DE TODOS OS DIGIMONS____________________________|"+"\n");
			for (Digimon digimon : listaDigimon){
				System.out.println("--NOME: " + digimon.getName()+" ___ Lvl." + digimon.getLevel());
			
			}

		/*
		 * Foi usado um Scanner para que o usuario possa digitar o level do Digimon,
		 * para realizar a rápida consulta!
		 */																
		System.out.print("\n"+"LEVELS DISPONIVEIS PARA CONSULTA \n--- |In Training | Training | Rookie | Champion | Ultimate | Mega | Fresh | Armor| ---\nPressione ENTER para continuar");

	try (Scanner scanner = new Scanner(System.in)) {
		String resposta = scanner.nextLine();

		System.out.print("\nESCOLHA O LEVEL DO DIGIMON o level do Digimon: ");
		resposta = scanner.nextLine();

		/*
		 * Aqui onde haverá um retorno de uma lista de level dos Digimons, com base no
		 * que foi escolhido pelo usuario !
		 */
		for (Digimon digimon : listaDigimon) {

			if (digimon.getLevel().equals(resposta)) {

				System.out.println("-- " + digimon.getName()+" ___ Lvl."+digimon.getLevel());

			}

		}
		System.out.println("\n--------------!!SUA BUSCA TERMINA AQUI!!--------------");

		}

	}
}