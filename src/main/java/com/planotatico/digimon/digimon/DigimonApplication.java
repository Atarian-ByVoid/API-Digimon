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

			System.out.println("______________________LISTA DE TODOS OS DIGIMONS____________________________");
			System.out.println();

			for (Digimon digimon : listaDigimon) {

				System.out.print("--NOME: " + digimon.getName());
				System.out.println(" ___ Lvl." + digimon.getLevel());

			}
			System.out.println();
			
		/*
		 * Foi usado um Scanner para que o usuario possa digitar o level do Digimon,
		 * para realizar a rápida consulta!
		 */
		System.out.print("Level disponiveis para consulta --- In Training | Rookie | Champion | Ultimate | Mega | Fresh --- Pressione ENTER para continuar");

	try (Scanner scanner = new Scanner(System.in)) {
		String resposta = scanner.nextLine();

		System.out.print("Escolha o level do Digimon: ");
		resposta = scanner.next();

		/*
		 * Aqui onde haverá um retorno de uma lista de level dos Digimons, com base no
		 * que foi escolhido pelo usuario !
		 */
		for (Digimon digimon : listaDigimon) {

			if (digimon.getLevel().equals(resposta)) {

				System.out.print("--" + digimon.getName());
				System.out.println(" Lvl." + digimon.getLevel());

			}

		}
		System.out.println("--------------!!SUA BUSCA TERMINA AQUI!!--------------");

		}

	}
}