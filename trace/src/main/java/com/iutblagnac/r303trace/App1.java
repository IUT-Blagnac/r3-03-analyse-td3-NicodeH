package com.iutblagnac.r303trace;


public class App1
{
    public static void main2( String[] args )
    {
        System.out.println(hello());
    }

    /* Fonction qui permet de retourner "Hello World"
     */
    public static String hello() {
        return  "Hello World!" ;
    }

    /* Fonction qui permet de retourner un paramètre de type String
     * @param param la chaine de caractère à retourner
     */
    public static String hello(String param) {
        return  param ;
    }
    
}
