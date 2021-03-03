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

    int matriz[][];

    public CuadradoMagico(int[][] matriz) {
        this.matriz = new int[3][3];

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random() * 8 + 1);
            }
        }
    }

}
