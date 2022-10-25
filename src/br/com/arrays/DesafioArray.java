package br.com.arrays;

/* Objetivo do desafio:
Ler duas matrizes A e B quadradas de ordem 3 e realizar o produto destas matrizes.*/


/* Definição de como é possivel criar um produto de duas matrizes:
O produto de duas matrizes-  matriz1 pela matriz2, apenas esta definido se o numero de colunas
da matriz1A for igual ao numero de linhas da matriz2. Cada elemento de m1m2 e definido atraves do
somatorio do produto dos elementos da i-esima linha da matriz1 com os respectivos
elementos da j-esima coluna da matriz2.

          1 2 3                    8 1 3                  22
matrizA = 5 6 9    x     matrizB = 1 5 6       matrizAB = 
          8 7 4                    4 3 1

operacao = (1.8 + 2.1 + 3.4) = 22


   Dicas:
 - determinar a ordem da matriz quadrada
 - criar blocos de entrada de dados com Scanner
 - bloco processamento: multiplicando as matrizes de entrada
 - estipular blocos de saida para exibir as matrizes montadas a partir dos dados inseridos pelo 
usuario*/

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mat[][] = new int[3][3];
		int mat1[][] = new int[3][3];
		int matAB[][] = new int[3][3];

		System.out.println("Popule a matriz A: ");
		for (int linha = 0; linha < mat.length; linha++) {
			for (int coluna = 0; coluna < mat.length; coluna++) {
				mat[linha][coluna] = sc.nextInt();
				System.out.println("Matriz [" + linha + "]" + "[" + coluna + "] = " + mat[linha][coluna]);
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------");

		System.out.println("Popule a matriz B: ");
		for (int linha1 = 0; linha1 < mat1.length; linha1++) {
			for (int coluna1 = 0; coluna1 < mat1.length; coluna1++) {
				mat1[linha1][coluna1] = sc.nextInt();
				System.out.println("Matriz [" + linha1 + "]" + "[" + coluna1 + "] = " + mat1[linha1][coluna1]);
			}
		}

		System.out.println();
		System.out.println("-----------------------------------------");

		matAB[0][0] = (mat[0][0] * mat1[0][0]) + (mat[0][0] * mat1[0][0]);
		matAB[0][1] = (mat[0][1] * mat1[0][1]) + (mat[0][1] * mat1[0][1]);
		matAB[0][2] = (mat[0][2] * mat1[0][2]) + (mat[0][2] * mat1[0][2]);
		matAB[1][0] = (mat[1][0] * mat1[1][0]) + (mat[1][0] * mat1[1][0]);
		matAB[1][1] = (mat[1][1] * mat1[1][1]) + (mat[1][1] * mat1[1][1]);
		matAB[1][2] = (mat[1][2] * mat1[1][2]) + (mat[1][2] * mat1[1][2]);
		matAB[2][0] = (mat[2][0] * mat1[2][0]) + (mat[2][0] * mat1[2][0]);
		matAB[2][1] = (mat[2][1] * mat1[2][1]) + (mat[2][1] * mat1[2][1]);
		matAB[2][2] = (mat[2][2] * mat1[2][2]) + (mat[2][2] * mat1[2][2]);

		System.out.println("Multiplicação de matrizes");

		for (int i = 0; i < matAB.length; i++) {
			for (int j = 0; j < matAB[i].length; j++) {
				System.out.print(matAB[i][j] + "\t");
			}
		}

		sc.close();
	}
}

/*
matAB[0][0] = (mat[0][0] * mat1[0][0]) + (mat[0][0] * mat1[0][0]);
matAB[0][1] = (mat[0][1] * mat1[0][1]) + (mat[0][1] * mat1[0][1]);
matAB[0][2] = (mat[0][2] * mat1[0][2]) + (mat[0][2] * mat1[0][2]);
matAB[1][0] = (mat[1][0] * mat1[1][0]) + (mat[1][0] * mat1[1][0]);
matAB[1][1] = (mat[1][1] * mat1[1][1]) + (mat[1][1] * mat1[1][1]);
matAB[1][2] = (mat[1][2] * mat1[1][2]) + (mat[1][2] * mat1[1][2]);
matAB[2][0] = (mat[2][0] * mat1[2][0]) + (mat[2][0] * mat1[2][0]);
matAB[2][1] = (mat[2][1] * mat1[2][1]) + (mat[2][1] * mat1[2][1]);
matAB[2][2] = (mat[2][2] * mat1[2][2]) + (mat[2][2] * mat1[2][2]);
*/