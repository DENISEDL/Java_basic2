public class Studente {

    private String name;
    private String surname;
    private int identificativo;


    Studente(String name, String surname, int identificativo){
        this.name = name;
        this.surname = surname;
        this.identificativo = identificativo;
    }

    @Override
    public String toString() {
        return "Studente ( name : " + name + " , surname : " + surname + " , " +
                "identificativo : " + identificativo +')';

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }
}


