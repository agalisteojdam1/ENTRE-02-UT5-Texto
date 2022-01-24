/**
 * clase Utilidades 
 * incluye  m�todos est�ticos para trabajar con String
 *
 * @author - Asier Galisteo
 */
public class Utilidades {

    /**
     * Dada una cadena devuelve una nueva capitalizando los caracteres de
     * tres en tres de forma
     * alterna empezando por may�scula (may�scula, min�scula, may�scula,
     * min�scula, ....) 
     * Ej. si la cadena recibida es "texto" devuelve "TEXto"
     * si la cadena recibida es "zapato" devuelve "ZAPato"
     * si la cadena recibida es "de" devuelve "DE"
     */

    public static String capitalizarAlterna(String cadena) {
        String cad = "";
        int i = 1;
        while(cadena.length() >= 3){
            String a = cadena.substring(0,3);
            cadena = cadena.substring(3);
            cad += escribirCadena(i,a);
            i++;
        }
        cad += escribirCadena(i,cadena);

        return cad;
    }

    /**
     * M�todo auxiliar de ayuda para escribir una cadena en may�sculas o minusculas dependiendo
     * de si el num�ro que se le pasa es par o impar.
     * @ param cualquier numero , una cadena cualquiera
     * @ return la cadena escrita en mayusculas o minusculas.
     */
    private static String escribirCadena(int i,String cadena)
    {
        String str = "";
        if(i % 2 == 0){
            str += cadena.toLowerCase();
        }
        else{
            str += cadena.toUpperCase();
        }
        return str;
    }

    /**
     * Dada una cadena devuelve true si hay letras repetidas, false en otro caso
     * Es indiferente may�sculas o min�sculas
     *
     * Pista!! puedes hacer de forma sencilla este m�todo con ayuda de
     * indexOf y substring
     *
     */
    public static  boolean tieneLetrasRepetidas(String cadena) {
        cadena = cadena.toLowerCase();
        while(cadena.length() > 0){
            String ultimaLetra = cadena.substring(cadena.length() - 1);
            cadena = cadena.substring(0,cadena.length() - 1);

            if(cadena.contains(ultimaLetra)){
                return true;
            }
        }

        return false;
    }

    // /**
    // *
    // */
    // public static void main(String[] args) {
    // String cadena = "zaPaTo";
    // System.out.println(cadena + "\tCapitalizada alterna: " +
    // Utilidades.capitalizarAlterna(cadena));
    // cadena = "pez";
    // System.out.println(cadena + "\tCapitalizada alterna: " +
    // Utilidades.capitalizarAlterna(cadena));

    // cadena = "vaso";
    // System.out.println(cadena + "\tCapitalizada alterna: " +
    // Utilidades.capitalizarAlterna(cadena));

    // cadena = "semana";
    // System.out.println(cadena + "\tTiene letras repetidas?: " +
    // Utilidades.tieneLetrasRepetidas(cadena));

    // cadena = "quebrantos";
    // System.out.println(cadena + "\tTiene letras repetidas?: " +
    // Utilidades.tieneLetrasRepetidas(cadena));

    // cadena = "y";
    // System.out.println(cadena + "\tTiene letras repetidas?: " +
    // Utilidades.tieneLetrasRepetidas(cadena));

    // cadena = "de";
    // System.out.println(cadena + "\tTiene letras repetidas?: " +
    // Utilidades.tieneLetrasRepetidas(cadena));

    // }
}
