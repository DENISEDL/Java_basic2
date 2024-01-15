public enum OperazioneAritmeticaEnum {
    ADDIZIONE("+"),
    SOTTRAZIONE("-"),
    MOLTIPLICAZONE("*"),
    DIVISIONE("/");


    private String OperazioneAritmetica;

    OperazioneAritmeticaEnum(String operazioneAritmetica) {
        OperazioneAritmetica = operazioneAritmetica;
    }

    public String getOperazioneAritmetica() {
        return OperazioneAritmetica;
    }
}
