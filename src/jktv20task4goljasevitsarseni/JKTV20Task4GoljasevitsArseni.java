/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20task4goljasevitsarseni;

/**
 *
 * @author pupil
 */
public class JKTV20Task4GoljasevitsArseni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] mas = new int[50];
	for(int i=0,n=1; i<mas.length; n=n+2,i++){
		mas[i] = n;
	}
	for(int i=mas.length-1; i>=0; i--) {
		System.out.print(mas[i]+" ");
	}

    }

}
