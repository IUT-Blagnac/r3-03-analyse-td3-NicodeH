package com.iutblagnac.r303trace;

public class App 
{
    public static void main( String[] args )
    {
        showIntegers();
        showIntegers(5);
    }

    /* Fonction qui permet de retourner un tableau d'entiers
     */
    public static int[] showIntegers() {
        int[] tab = new int[9];

        for (int i = 0; i<tab.length; i++) {
            tab[i] = i;
            System.out.println(tab[i]);
        }
        return tab;
    }

    /* Fonction qui permet de retourner un tableau d'entiers en fonction d'un paramètre
     * @param param le nombre d'entiers à retourner
     */
    public static int[] showIntegers(int param) {
        int[] tab = new int[param];  // Déclaration et initialisation du tableau

        for (int i = 0; i<param; i++) {
            tab[i] = i;
            System.out.println(tab[i]);
        }
        return tab;
    }
    
}
