//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum
//Crei un metodo per calcolare l'operazione richiesta ee restituire il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal entrate = BigDecimal.valueOf(2500).setScale(2);
        System.out.println("Entrate mesili del correntista Luca Gallo : " + entrate + " euro");

        BigDecimal uscite =  BigDecimal.valueOf(890);
        System.out.println("Media di uscite mesili : " + uscite + " euro");

        System.out.println(OperazioneAritmeticaEnum.SOTTRAZIONE);
        sottrazioneBigDecimal(entrate,uscite);
    }
    public static void sottrazioneBigDecimal(BigDecimal entrate,BigDecimal uscite){
        BigDecimal result = new BigDecimal(String.valueOf(entrate.subtract(uscite)));
        System.out.println("Conto residuo : " + result + " euro");
    }
}