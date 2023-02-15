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

		//Foi usado um Scanner para que o usuario possa digitar o level do Digimon, para realizar a rapida consulta!
		
		System.out.print("Level disponiveis para consulta ------ In Training | Rookie | Champion | Ultimate | Mega | Fresh ");

		try (Scanner scanner = new Scanner(System.in)) {
			String resposta = scanner.next();
			
			System.out.print("Escolha o level do Digimon: ");
			resposta = scanner.next();

			for (Digimon digimon : listaDigimon) { //Aqui onde havera um retorno de uma lista de level dos Digimons!

				if (digimon.getLevel().equals(resposta)) {  
					System.out.print("--" + digimon.getName());
					System.out.println(" " + digimon.getLevel());

				}

				/*
				 * ---- Lista o Level e o nome do Digimon----
				 * 
				 * for(Digimon digimon : listaDigimon) {
				 * System.out.print("--NOME: "+digimon.getName()+" ____ ");
				 * System.out.println(" Lvl."+digimon.getLevel());
				 * 
				 * 
				 * ---- Lista o Level selecionado do Digimon----
				 * 
				 */

			}
		}

	}
}