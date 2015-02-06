package HeroesYVillanos;

import java.util.Random;

import GestionDeEmpleados.Empresa;

public class ej2Dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		random e = new random();
		random e2 = new random();
		random e3 = new random();

		int dadoAtk1 = e.randInt(1, 6);
		int dadoAtk2 = e2.randInt(1, 6);
		int dadoDef = e3.randInt(1, 6);

		int dadoMayor = 0;

		System.out.println("LA TIRADA: " + dadoAtk1 + " " + dadoAtk2 + " "
				+ dadoDef);

		if (dadoAtk1 > dadoAtk2) {

			dadoMayor = dadoAtk1;

		} else {

			dadoMayor = dadoAtk2;

		}

		if (dadoMayor > dadoDef) {
			System.out.println("EL ATAQUE GANA, BITCH!");
		} else if(dadoMayor <= dadoDef){
			System.out.println("LA DEFENSA GANA, BITCH!");
		}

	}

}
