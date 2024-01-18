public class Person {
    private String nome;
    private String cognome;
    private Integer age;
    private String adress;

    public Person(String nome, String cognome,String adress,Integer age) {
        this.nome = nome;
        this.cognome = cognome;
        this.age = age;
        this.adress = adress;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "(Person: " +
                "Nome:" + nome +
                " , Cognome: " + cognome +
                " , Age: " + age +
                " , Adress: " + adress + ")";
    }
}
