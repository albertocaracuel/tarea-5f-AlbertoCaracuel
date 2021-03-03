/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareaclase5falbertocaracuel;

/**
 *
 * @author alber
 */
public class CuadradoMagico {

    private int matriz[][];

    public CuadradoMagico(int[][] matriz) {
        this.matriz = new int[3][3];

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random() * 8 + 1);
            }
        }

    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public void sumaFila() {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("Fila " + i + " =" + suma);
            suma = 0;
        }
    }

    public void sumaColumna() {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[j][i];
            }
            System.out.println("Columna " + i + " =" + suma);
            suma = 0;
        }
    }

    private void visualizarArray(int[] pArray) {
        for (int i = 0; i < pArray.length; i++) {
            System.out.print("\t" + pArray[i]);
        }
    }

    public void sumadiagonales() {
        int[] diagoPrincipal = new int[matriz.length];
        int[] diagoSecundaria = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    diagoPrincipal[i] = matriz[i][j];
                }

                if (i + j == matriz.length - 1) {
                    diagoSecundaria[i] = matriz[i][j];
                }
            }
        }
        System.out.println("\nDiagonal Principal");
        visualizarArray(diagoPrincipal);
            int suma=0;

        for (int i = 0; i < diagoPrincipal.length; i++) {
          
            suma += diagoPrincipal[i];

        }
        System.out.println("REsultado principal" + suma);

        System.out.println("\n\nDiagonal Secundaria");
        visualizarArray(diagoSecundaria);
          int suma1=0;
         for (int i = 0; i < diagoSecundaria.length; i++) {
            
            suma1 += diagoSecundaria[i];

        }
         
         System.out.println("Resultado secundario" + suma1);
    }
}
