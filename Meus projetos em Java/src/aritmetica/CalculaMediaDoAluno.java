/*
 * 17 de maio de 2021 - 00:28
 * Programa que calcula a média das notas de um aluno 
 * */

package aritmetica;

import javax.swing.JOptionPane;

public class CalculaMediaDoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int repetirCalculo = 0;
		String converteNotaParaString = "";
		String concatenarNotas = "";
		int contadorDeNotas;
		double notaDoAluno = 0;
		double mediaDasNotas = 0;
		double somaDasNotas = 0;
		
		do {
			for(contadorDeNotas = 1; contadorDeNotas <= 4; contadorDeNotas++) {
				notaDoAluno = Double.parseDouble(JOptionPane.showInputDialog("Calculando a Média do Aluno\n\n"
						+ "A média do aluno para aprovação deverá ser\n"
						+ "Maior ou Igual a 70\n\n"
						+ "Informe a nota " + contadorDeNotas));
				mediaDasNotas += notaDoAluno;
				
				somaDasNotas = somaDasNotas + notaDoAluno;
				converteNotaParaString = "Nota " + Integer.toString(contadorDeNotas) + " >>> " + Double.toString(notaDoAluno);
				concatenarNotas += converteNotaParaString + "\n";
			}
			mediaDasNotas = mediaDasNotas / 4;
			
			if(mediaDasNotas >= 70) {
				JOptionPane.showMessageDialog(null, "Notas digitadas:\n\n" + concatenarNotas 
						+ "\nA soma das notas é: " + somaDasNotas + "\nA média do Aluno é: " + mediaDasNotas
						+ "\n\nO aluno foi aprovado");
			}else {
				JOptionPane.showMessageDialog(null, "Notas digitadas:\n\n" + concatenarNotas 
						+ "\nA soma das notas é: " + somaDasNotas + "\nA média do Aluno é: " + mediaDasNotas
						+ "\n\nInfelizmente o aluno não foi aprovado");
			}
			
			/*
			 * Resetando as Variáveis
			 * */
			mediaDasNotas = 0;
			concatenarNotas = "";
			//***********************************
			
			repetirCalculo = Integer.parseInt(JOptionPane.showInputDialog("Repetir cálculo?...\n\n"
					+ "[1] - Confirmar\n"
					+ "[0] - Cancelar"));
		}while(repetirCalculo != 0);
		JOptionPane.showMessageDialog(null, "Programa encerrado...");

	}

}
