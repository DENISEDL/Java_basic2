import java.util.Comparator;

public class Studente {

    private String nome;
    private Integer age;

    public Studente(String nome, Integer age) {
        this.nome = nome;
        this.age = age;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return '\n' +
                "nome:" + nome +
                ", age: " + age
               ;
    }
}
