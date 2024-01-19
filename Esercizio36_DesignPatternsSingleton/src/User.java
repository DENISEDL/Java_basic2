public class User {
    private String nome;
    private Integer eta;
    private static User instanza;
    public static User getInstanza(){
        if(instanza == null){
            instanza = new User();
        }
        return instanza;
    }

    public User() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public void stampaInfo(){
        System.out.println("Nome:" + nome + " " + "Età:" + eta);
    }
}
