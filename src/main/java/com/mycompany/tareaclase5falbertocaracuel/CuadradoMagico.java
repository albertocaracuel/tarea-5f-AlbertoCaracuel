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
    
    public void sumaFila(){
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                  suma += matriz[i][j];              
            }
            System.out.println("Fila " + i + " =" + suma);
            suma=0;
        }
    }
    
    public void sumaColumna(){
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                  suma += matriz[j][i];              
            }
            System.out.println("Columna " + i + " =" + suma);
            suma=0;
        }
    }
}
