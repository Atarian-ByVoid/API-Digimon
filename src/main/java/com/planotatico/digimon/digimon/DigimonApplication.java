package com.planotatico.digimon.digimon;

import java.text.ParseException;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.planotatico.digimon.digimon.client.DigimonClient;
import com.planotatico.digimon.digimon.client.domain.Digimon;

@SpringBootApplication
public class DigimonApplication {

	public static void main(String[] args) throws ParseException {

		DigimonClient digimonClient = new DigimonClient();
		List<Digimon> listaDigimon = digimonClient.listar();

		/*for(Digimon digimon : listaDigimon) {
			System.out.print("--"+digimon.getName());
			System.out.println(" "+digimon.getLevel());*/

			

			for (Digimon digimon : listaDigimon) {

				if (digimon.getLevel().equals("Champion")) {
					System.out.print("--" + digimon.getName());
					System.out.println(" " + digimon.getLevel());
	
				}

		
	}
	

}
}