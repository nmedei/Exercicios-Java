/*******************************************************************************
* 9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e 
* dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
* com 365 dias e mês com 30 dias.
*******************************************************************************/

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int IdadeAnos /* not anus! */, IdadeMeses, IdadeDias, IdadeTotalDias;
	
	System.out.print("Calculadora de idade em dias\n\n"); 


	System.out.print("Digite os anos:19");
	IdadeAnos = entrada.nextInt();
	
	System.out.print("Digite os meses:228");
	IdadeMeses = entrada.nextInt();

	System.out.print("Digite os dias:6935 ");
	IdadeDias = entrada.nextInt();


	IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
	System.out.print("Idade total em dias = "+IdadeTotalDias+"\n");
	
    }

}

