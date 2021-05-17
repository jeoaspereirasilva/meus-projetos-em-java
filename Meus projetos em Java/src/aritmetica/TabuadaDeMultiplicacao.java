/*
 * 17 de maio de 2021 - 00:28
 * Programa que multiplica valores de 0 a 10 
 * */

package aritmetica;

import javax.swing.JOptionPane;

public class TabuadaDeMultiplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = 1;
		String nomeDoPrograma = "Tabuada de Multiplicação";
		String converterParaString = "";
		String concatenacao = "";
		int fator1 = 0 , fator2 = 0 , produto = 0;
		
		while(opcao != 0){
			opcao = Integer.parseInt(JOptionPane.showInputDialog(nomeDoPrograma + "\n\n[1] - Calcular\n[0] - Encerrar"));
			if(opcao == 1){
				fator1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o Fator 1"));
				
				for(int contador = 0; contador <= 10; contador++){
					converterParaString = Integer.toString(fator1);
					concatenacao += converterParaString + " X ";
					converterParaString = Integer.toString(fator2);
					concatenacao += converterParaString + " = ";
					converterParaString = Integer.toString(produto);
					concatenacao += converterParaString + "\n";
					fator2 = fator2 + 1;
					produto = produto + fator1;
				}
				JOptionPane.showMessageDialog(null, "Resultado da Multiplicação\n" + concatenacao);
				/*
					Resetando as Strings
				*/
				concatenacao = "";
				fator2 = 0; produto = 0;
			}
			else if(opcao == 0){
				JOptionPane.showMessageDialog(null, "Programa encerrado...");
			}
		}//fim da estrutra while

	}

}
