public class PersonBuilder {
    private String nome;
    private String cognome;


    public PersonBuilder() {
    }

    public PersonBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public PersonBuilder setCognome(String cognome) {
        this.cognome = cognome;
        return this;
    }
    public Person builder(){
        return new Person(nome,cognome,"JAVA",28);

    }
}
